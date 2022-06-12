package com.mdss.seller.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.seller.entities.OrderItem;

public interface OrderRepository extends JpaRepository<OrderItem, Long> {

}
