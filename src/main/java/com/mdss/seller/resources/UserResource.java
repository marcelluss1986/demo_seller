package com.mdss.seller.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mdss.seller.entities.User;
import com.mdss.seller.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
		@Autowired
		private UserService services;
		
		@RequestMapping(method = RequestMethod.GET)
		public ResponseEntity<List<User>> findAll(){
			List<User>obj = services.findAll();
			return ResponseEntity.ok().body(obj);
		}
		
		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public ResponseEntity<User> findById(@PathVariable Long id){
			User obj = services.findById(id);
			return ResponseEntity.ok().body(obj);
		}
		
		@RequestMapping(method = RequestMethod.POST)
		public ResponseEntity<User> insert(@RequestBody User obj){
			User user = services.insert(obj);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
			return ResponseEntity.created(uri).body(obj);
		}
		
		@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<Void> delete(@PathVariable Long id){
			services.delete(id);
			return ResponseEntity.noContent().build();
		}
}
