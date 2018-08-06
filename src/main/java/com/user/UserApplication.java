package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.user.entity.User;
import com.user.repository.UserRepo;

@SpringBootApplication
public class UserApplication implements CommandLineRunner {

	@Autowired
	UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
