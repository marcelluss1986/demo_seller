package com.mdss.seller.services;

import java.util.List;
import java.util.Optional;

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
		
		public User findById(Long id) {
			Optional<User> obj = repository.findById(id);
			return obj.get();
		}
		
		public User insert (User obj) {
			return repository.save(obj);
		}
		
		public void delete(Long id) {
			repository.deleteById(id);
		}
		
		public User update(Long id, User obj) {
			Optional<User> entity = repository.findById(id);
			updateData(entity, obj);
			return repository.save(entity);
			
		}

		private void updateData(Optional<User> entity, User obj) {
			entity.get().setName(obj.getName());
			entity.get().setEmail(obj.getEmail());
			entity.get().setPhone(obj.getPhone());
		}
}
