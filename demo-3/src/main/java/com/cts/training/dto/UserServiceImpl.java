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
	UserRepo userRepo;
	@Override
	public UserDTO insert(UserDTO userDTO) {
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		userRepo.save(user);
		return userDTO;


	}
	
	

}





