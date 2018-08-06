package com.user.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.user.entity.User;
import com.user.repository.IUserRepo;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	@Qualifier(value = "NJT")
	IUserRepo repo;

	@GetMapping("/data")
	public List<User> displayAll() {
		return repo.getAll();
	}

	@PostMapping("/")
	public int createUser(@RequestBody User user) {

		return repo.addUser(user);

	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") int id) {
		return repo.getUserById(id);
	}

	@DeleteMapping("/{id}")
	public int deleteUserById(@PathVariable("id") int id) {
		return repo.deleteUserByID(id);
	}

	@DeleteMapping
	public int deleteAll() {
		return repo.deleteAll();
	}

	@PutMapping("/{id}")
	public int updateUserEmail(@PathVariable("id") int id, @RequestBody User user) {
		user.setUserId(id);
		return repo.updateUserEmail(user);

	}
}

