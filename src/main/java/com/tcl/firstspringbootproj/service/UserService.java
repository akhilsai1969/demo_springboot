package com.tcl.firstspringbootproj.service;

import com.tcl.firstspringbootproj.entity.UserClass;

import java.util.List;
import java.util.Optional;

public interface UserService {

	public UserClass addUser(UserClass artuser);
	public List<UserClass> listAllUser();
	public Optional<UserClass> findByUserId(Long id);
}