package com.api.userCrud.repositories;

import com.api.userCrud.models.userModel;

import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<userModel, Integer>{
    
}
