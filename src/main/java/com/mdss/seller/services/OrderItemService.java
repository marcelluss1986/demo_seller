package com.mdss.seller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdss.seller.entities.OrderItem;
import com.mdss.seller.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
		@Autowired
		private OrderItemRepository repository;
		
		public List<OrderItem> findAll(){
			List<OrderItem> obj = repository.findAll();
			return obj;
		}
}
