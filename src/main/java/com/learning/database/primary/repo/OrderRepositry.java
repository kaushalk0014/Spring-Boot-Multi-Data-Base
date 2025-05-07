package com.learning.database.primary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.database.primary.entity.Order;

@Repository
public interface OrderRepositry extends JpaRepository<Order, Integer>{

}
