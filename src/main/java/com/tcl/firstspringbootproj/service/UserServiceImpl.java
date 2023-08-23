package com.tcl.firstspringbootproj.service;

import java.util.List;
import java.util.Optional;

import com.tcl.firstspringbootproj.entity.UserClass;
import com.tcl.firstspringbootproj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserClass addUser(UserClass artuser) {
		return userRepository.save(artuser);
	}

	@Override
	public List<UserClass> listAllUser() {

		return userRepository.findAll();
	}

	@Override
	public Optional<UserClass> findByUserId(Long id) {

		return userRepository.findById(id);
	}

}