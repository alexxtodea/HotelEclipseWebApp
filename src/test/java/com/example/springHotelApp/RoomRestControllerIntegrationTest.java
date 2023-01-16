package com.example.springHotelApp;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.aMapWithSize;
import static org.junit.Assert.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;
import java.nio.file.Files;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import com.example.springHotelApp.repository.RoomRepository;
import com.jayway.jsonpath.JsonPath;


@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class RoomRestControllerIntegrationTest {

    @Autowired
    private RoomRepository roomrepository;

    @Autowired
    private MockMvc mockMvc;
    
    @Before
    public void setUp() throws Exception {
       // roomrepository.save(new Room());
    }
    
    @Test
    void should_create_one_room() throws Exception {
        final File jsonFile = new ClassPathResource("init/user.json").getFile();
        final String roomToCreate = Files.readString(jsonFile.toPath());

        this.mockMvc.perform(post("/rooms/add")
                        .contentType(APPLICATION_JSON)
                        .content(roomToCreate))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$").isMap())
                .andExpect(jsonPath("$", aMapWithSize(8)));

        assertThat(this.roomrepository.findAll()).hasSize(1);
    }
    
    @Test
    void should_get_all_rooms() throws Exception {
        final File jsonFile = new ClassPathResource("init/user.json").getFile();
        final String roomToCreate = Files.readString(jsonFile.toPath());
        final File jsonFile2 = new ClassPathResource("init/user2.json").getFile();
        final String roomToCreate2 = Files.readString(jsonFile2.toPath());

        this.mockMvc.perform(post("/rooms/add")
                        .contentType(APPLICATION_JSON)
                        .content(roomToCreate))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$").isMap())
                .andExpect(jsonPath("$", aMapWithSize(8)));
        
        this.mockMvc.perform(post("/rooms/add")
                        .contentType(APPLICATION_JSON)
                        .content(roomToCreate2))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$").isMap())
                .andExpect(jsonPath("$", aMapWithSize(8)));
       
        
        this.mockMvc.perform(get("/rooms/getAll"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(APPLICATION_JSON))
        .andExpect(jsonPath("$[0].roomType").value("Test Room")) 
        .andExpect(jsonPath("$[1].roomType").value("Test Room"))
        .andExpect(jsonPath("$[2].roomType").value("Room Test"));
        assertThat(this.roomrepository.findAll()).hasSize(3);
    }
    


    @Test
    void should_retrieve_one_room() throws Exception {
        
        
        final File jsonFile2 = new ClassPathResource("init/user2.json").getFile();
        final String roomToCreate2 = Files.readString(jsonFile2.toPath());

        MvcResult result = (MvcResult) mockMvc.perform(post("/rooms/add")
                        .contentType(APPLICATION_JSON)
                        .content(roomToCreate2))
                .andDo(print())
                .andExpect(status().isCreated())
                .andReturn(); 
        
        String roomid = JsonPath.read(result.getResponse().getContentAsString(), "$.id");
            
       MvcResult otherReslult = (MvcResult) this.mockMvc.perform(get("/rooms/find/{id}", roomid))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(roomid))
                .andExpect(jsonPath("$.roomType").value("Room Test"))
                .andReturn();
       
       assertEquals( JsonPath.read(result.getResponse().getContentAsString(), "$.id"), roomid);
    }
      

    

//    @Test
//    void should_delete_one_user() throws Exception {
//        this.mockMvc.perform(delete("/user/delete/{id}", 2))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//
//        assertThat(this.repository.findAll()).hasSize(4);
//    }
}
