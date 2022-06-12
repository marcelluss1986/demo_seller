package com.mdss.seller.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdss.seller.entities.Product;
import com.mdss.seller.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	

	public List<Product> findAll(){
		List<Product> obj = repository.findAll();
		return obj;
	}
	
	public Product findById(Integer id){
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
