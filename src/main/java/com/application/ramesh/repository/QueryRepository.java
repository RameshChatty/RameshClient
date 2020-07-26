package com.application.ramesh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.ramesh.entity.Querys;

@Repository
public interface QueryRepository extends CrudRepository<Querys, 	Integer> {

}
