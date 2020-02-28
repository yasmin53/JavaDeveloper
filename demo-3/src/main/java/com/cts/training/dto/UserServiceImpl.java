package com.cts.training.dto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.models.User;
import com.cts.training.repo.UserRepo;
import com.cts.training.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo ur;
	
	@Override
	public UserDTO insert(UserDTO ud) {
		User ue = new User();
		BeanUtils.copyProperties(ud, ue);
		ur.save(ue);
		return ud;
	}
	
	

}
