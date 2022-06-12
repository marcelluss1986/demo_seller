package com.mdss.seller.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mdss.seller.entities.Product;
import com.mdss.seller.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {
	
	@Autowired
	private ProductService services;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Product>> findAll(){
		List<Product> obj = services.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Product>findById(Integer id){
		Product obj = services.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
