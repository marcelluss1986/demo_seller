package com.mdss.seller.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.seller.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
