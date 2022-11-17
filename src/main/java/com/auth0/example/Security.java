package com.auth0.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@EnableWebSecurity
public class Security {

    
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        http.csrf()
////        .disable()
////            .authorizeHttpRequests((requests) -> requests
////                .antMatchers("/", "/rooms/**").permitAll()
//               // .anyRequest().authenticated()
//  //          )
////            .formLogin((form) -> form
////                .loginPage("/login")
////                .permitAll()
////            )
////            .logout((logout) -> logout.permitAll());
//
//        return http.build();
//    }

    
//    @Bean
//    protected UserDetailsService userDetailsService() {
//    UserDetails timmy = User.builder()
//                            .username("timmy")
//                            .password("password")
//                            .build();
//
//  
//    InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager(timmy);
//        
//        return userDetailsManager;
//
//    }
}
