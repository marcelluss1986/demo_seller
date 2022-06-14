package com.mdss.seller.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.seller.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
