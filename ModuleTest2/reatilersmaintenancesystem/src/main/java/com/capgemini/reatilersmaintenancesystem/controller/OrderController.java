package com.capgemini.reatilersmaintenancesystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.reatilersmaintenancesystem.dto.OrderInfo;
import com.capgemini.reatilersmaintenancesystem.dto.OrderResponse;
import com.capgemini.reatilersmaintenancesystem.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService service;
	@PostMapping(path = "/add-order", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse addProduct(@RequestBody OrderInfo order) {
		OrderResponse response = new OrderResponse();
		if (service.addOrder(order)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("order added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("order with same name already exists");
		}
		return response;
	}

	@GetMapping(path = "/view-order", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse viewProduct(@RequestParam("id") int id) {
		OrderResponse response = new OrderResponse();
		OrderInfo order = service.getOrder(id);
		if (order != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order found");
			response.setOrder(Arrays.asList(order));
			//response.setProduct(Arrays.asList(product));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order id does not exist");
		}
		return response;
	}

	@GetMapping(path = "/view-allorders", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse viewAllProducts() {
		OrderResponse response = new OrderResponse();
		List<OrderInfo> list = service.getAllOrders();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order found");
			response.setOrder(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}

	@DeleteMapping(path = "/delete-order/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse deleteProduct(@PathVariable("id") int id) {
		OrderResponse response = new OrderResponse();
		if (service.deleteOrder(id)) {
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


}
