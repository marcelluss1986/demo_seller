package com.mdss.seller.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdss.seller.entities.Category;
import com.mdss.seller.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	public List<Category>findAll(){
		List<Category>list = service.findAll();
		return list;
	}
	
}
