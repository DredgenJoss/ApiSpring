package com.api.userCrud;

import com.api.userCrud.repositories.userLoginRepository;
import com.api.userCrud.services.userLoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class AppWebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    /*
    @Autowired
    private userLoginService user_login_service;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(user_login_service);


    }
    */

    @Override
    protected void configure(HttpSecurity http) throws Exception {


        http
            .csrf().disable()
            .authorizeRequests()
                .anyRequest().permitAll();
    }
}