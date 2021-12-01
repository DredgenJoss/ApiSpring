package com.api.userCrud.services;

import java.util.ArrayList;

import com.api.userCrud.models.userModel;
import com.api.userCrud.repositories.userRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.bytebuddy.asm.Advice.Return;

@Service
public class userService {
    @Autowired
    userRepository user_repository;

    public ArrayList<userModel> getUsers(){
        return (ArrayList<userModel>) user_repository.findAll();
    }

    public userModel postUsers(userModel newUser){
        return user_repository.save(newUser);
    }

    public boolean deleteUser(Integer id){
        try{
            user_repository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
