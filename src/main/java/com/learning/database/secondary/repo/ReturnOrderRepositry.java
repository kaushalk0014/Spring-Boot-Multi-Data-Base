package com.learning.database.secondary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnOrderRepositry extends JpaRepository<ReturnOrderRepositry, Integer>{

}
