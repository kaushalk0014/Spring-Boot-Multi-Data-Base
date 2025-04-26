package com.learning.database.repo.primary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.database.entiry.primary.Order;

@Repository
public interface OrderRepositry extends JpaRepository<Order, Integer>{

}
