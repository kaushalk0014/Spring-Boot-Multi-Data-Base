package com.learning.database.secondary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.database.secondary.entity.Return;

@Repository
public interface ReturnOrderRepositry extends JpaRepository<Return, Integer>{

}
