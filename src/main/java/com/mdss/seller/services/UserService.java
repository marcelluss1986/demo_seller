package com.mdss.seller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdss.seller.entities.User;
import com.mdss.seller.repositories.UserRepository;

@Service
public class UserService {
	
		@Autowired
		private UserRepository repository;
		
		public List<User> findAll(){
			List<User> obj = repository.findAll();
			return obj;
		}
}
