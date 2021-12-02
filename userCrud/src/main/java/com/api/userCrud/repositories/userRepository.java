package com.api.userCrud.repositories;

import java.util.Optional;

import com.api.userCrud.models.userModel;

import org.apache.catalina.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<userModel, Integer>{
    userModel findByuserName(String userName);
}
