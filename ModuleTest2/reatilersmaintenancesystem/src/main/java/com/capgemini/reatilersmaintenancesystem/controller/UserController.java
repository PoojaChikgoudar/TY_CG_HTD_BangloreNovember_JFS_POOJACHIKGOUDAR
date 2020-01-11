package com.capgemini.reatilersmaintenancesystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.reatilersmaintenancesystem.dto.Authentication;
import com.capgemini.reatilersmaintenancesystem.dto.AuthenticationResponse;
import com.capgemini.reatilersmaintenancesystem.dto.UserInfo;
import com.capgemini.reatilersmaintenancesystem.dto.UserResponse;
import com.capgemini.reatilersmaintenancesystem.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	@PostMapping(path = "/add-user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addProduct(@RequestBody UserInfo user) {
		UserResponse response = new UserResponse();
		if (service.addUser(user)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User with same name already exists");
		}
		return response;
	}

	@GetMapping(path = "/view-user", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse viewProduct(@RequestParam("id") int id) {
		UserResponse response = new UserResponse();
		UserInfo user = service.getUsers(id);
		if (user != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order found");
			response.setUser(Arrays.asList(user));
			//response.setProduct(Arrays.asList(product));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order id does not exist");
		}
		return response;
	}

	@GetMapping(path = "/view-allusers", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse viewAllProducts() {
		UserResponse response = new UserResponse();
		List<UserInfo> list = service.getAllUsers();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order found");
			response.setUser(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}

	@DeleteMapping(path = "/delete-user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteProduct(@PathVariable("id") int id) {
		UserResponse response = new UserResponse();
		if (service.deleteUser(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order not found");
		}
		return response;
	}
	
	@PutMapping(path = "/modify-password", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse modifyPasword(@RequestBody UserInfo user) {
		UserResponse response = new UserResponse();
		if (service.modifyPassword(user.getUser_id(), user.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product cost updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found");
		}
		return response;
	}

	@PostMapping(path = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AuthenticationResponse register(@RequestBody Authentication account) {
		AuthenticationResponse response = new AuthenticationResponse();
		service.register(account);
		response.setStatusCode(201);
		response.setDescription("Success");
		response.setMessage("Account created");
		return response;
	}

	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AuthenticationResponse login(@RequestBody Authentication credentials) {
		AuthenticationResponse response = new AuthenticationResponse();
		Authentication account = service.login(credentials);
		if (account != null) {
			response.setStatusCode(201);
			response.setDescription("Success");
			response.setMessage("Logged in");
			response.setAccount(Arrays.asList(account));
		} else {
			response.setStatusCode(405);
			response.setDescription("Failure");
			response.setMessage("Provide valid credentials");
		}
		return response;
	}

}
