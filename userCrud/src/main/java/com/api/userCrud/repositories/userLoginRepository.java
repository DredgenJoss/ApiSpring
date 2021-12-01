package com.api.userCrud.repositories;

import com.api.userCrud.models.userModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userLoginRepository extends JpaRepository<userModel, Integer>{
    //userModel findByNombre(String username);
    
}
