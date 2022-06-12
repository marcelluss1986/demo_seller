package com.mdss.seller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdss.seller.entities.Order;
import com.mdss.seller.repositories.OrderRepository;

@Service
public class OrderService {
	
		@Autowired
		private OrderRepository repository;
		
		public List<Order> findAll(){
			List<Order> obj = repository.findAll();
			return obj;
		}
}
