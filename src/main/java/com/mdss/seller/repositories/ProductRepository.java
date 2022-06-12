package com.mdss.seller.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.seller.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
