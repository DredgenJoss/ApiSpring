package com.api.userCrud.services;

import java.util.ArrayList;


import com.api.userCrud.models.userModel;
import com.api.userCrud.repositories.userLoginRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class userLoginService implements UserDetailsService{

    /*
    @Autowired
    private userLoginRepository user_login_repository;

    @Override
    public UserDetails loadUserByUsername(String user_name) throws UsernameNotFoundException {
        userModel user = user_login_repository.findByNombre(user_name);


        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("ADMIN"));

        UserDetails user_details = (UserDetails) new User(user.getUserName(), user.getPassword(), roles);
        return user_details;
    }
    */

    @Override
    public UserDetails loadUserByUsername(String user_name) throws UsernameNotFoundException {
        return null;
    }
    
}
