package com.huberto.tacocloud.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SecurityConfig {


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }




    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder){
        List<UserDetails> userDetails = new ArrayList<>();
        userDetails.add(
                new User("soundiata", encoder.encode("niani"), Arrays.asList(new SimpleGrantedAuthority("USER"))));
        userDetails.add(new User("soumaoro", encoder.encode("kirina"), Arrays.asList(new SimpleGrantedAuthority("USER"))));
        return  new InMemoryUserDetailsManager(userDetails);
    }


}