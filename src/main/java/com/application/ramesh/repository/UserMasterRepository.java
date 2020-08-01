package com.application.ramesh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.ramesh.entity.UserMaster;
@Repository
public interface UserMasterRepository extends CrudRepository<UserMaster, Integer> {

}
