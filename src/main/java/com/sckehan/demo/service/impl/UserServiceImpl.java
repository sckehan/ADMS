package com.sckehan.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sckehan.demo.entity.User;
import com.sckehan.demo.repository.UserRepository;
import com.sckehan.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    UserRepository repository;
	
	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return repository.getUser(id);
	}

}
