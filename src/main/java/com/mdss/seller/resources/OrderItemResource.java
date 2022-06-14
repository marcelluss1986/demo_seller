package com.mdss.seller.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mdss.seller.entities.Order;
import com.mdss.seller.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderItemResource {
		
		@Autowired
		private OrderService services;
		
		@RequestMapping(method = RequestMethod.GET)
		public ResponseEntity<List<Order>> findAll(){
			List<Order>obj = services.findAll();
			return ResponseEntity.ok().body(obj);
		}
	
}
