package com.cts.training.userservice;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



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





