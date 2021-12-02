package com.api.userCrud.controllers;

import java.util.ArrayList;

import com.api.userCrud.models.userModel;
import com.api.userCrud.services.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    userService user_service;

    @GetMapping()
    public ArrayList<userModel> getUsers(){
        return user_service.getUsers();
    }

    @PostMapping()
    public userModel postUser(@RequestBody userModel newUser){
        return this.user_service.postUser(newUser);
    }

    @PutMapping()
    public userModel putUser(@RequestBody userModel updateUser){
        var response = this.user_service.putUser(updateUser);

        if(response != null){
            return response;
        }
        else{
            return null;
        }
        
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        Boolean ok = this.user_service.deleteUser(id);
        if(ok){
            return "Se usuario a sido eliminado.";
        }
        else{
            return "No se pudo eliminar el usuario.";
        }
    }
}
