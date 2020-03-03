package com.cts.training.userservice;


import java.util.List;

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
	@Override
	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserDTO getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserDTO saveUser(UserDTO user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public UserDTO updateUser(UserDTO user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean activateUser(String email) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}





