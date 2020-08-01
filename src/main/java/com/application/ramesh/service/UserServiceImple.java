package com.application.ramesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.ramesh.entity.UserMaster;
import com.application.ramesh.repository.UserMasterRepository;

@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserMasterRepository userRepository;

	@Override
	public void registerUser(UserMaster user) {
		userRepository.save(user);
		
	}

}
