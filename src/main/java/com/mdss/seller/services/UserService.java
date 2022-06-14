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
			User entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
			
		}

		private void updateData(User entity, User obj) {
			entity.setName(obj.getName());
			entity.setEmail(obj.getEmail());
			entity.setPhone(obj.getPhone());
		}
}
