package com.mdss.seller.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.seller.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
