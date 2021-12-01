package com.api.userCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserCrudApplication {

	public static void main(String[] args) {
		try{
		SpringApplication.run(UserCrudApplication.class, args);
		}
		catch(Exception e){
			System.out.println("Error_load: " + e.getMessage());
		}
	}

}
