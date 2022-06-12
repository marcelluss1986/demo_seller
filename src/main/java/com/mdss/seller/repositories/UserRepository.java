package com.mdss.seller.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.seller.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
