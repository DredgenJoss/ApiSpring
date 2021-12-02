package com.api.userCrud.services;

import java.util.ArrayList;

import com.api.userCrud.models.userModel;
import com.api.userCrud.repositories.userRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class userService {
    @Autowired
    userRepository user_repository;

    public ArrayList<userModel> getUsers(){
        return (ArrayList<userModel>) user_repository.findAll();
    }

    public userModel postUser(userModel newUser){
        return user_repository.save(newUser);
    }

    public userModel putUser(userModel updateUser){

        var findUserName = user_repository.findByuserName(updateUser.getUserName());
        var findUserId = user_repository.findAll();


        if(findUserId != null){

            if(findUserName == null){
                //Actualiza si no se repite el nombre de usuario
                return user_repository.save(updateUser);
            }
            else if(findUserName.getId() == updateUser.getId()){
                //Actualiza si el nombre de usuario corresponde por me dio ids
                return user_repository.save(updateUser);
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }

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
