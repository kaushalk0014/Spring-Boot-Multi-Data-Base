package com.learning.database.repo.secondary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnOrderRepositry extends JpaRepository<ReturnOrderRepositry, Integer>{

}
