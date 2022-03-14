package com.example.demo.Users;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;


@Service
public class UsersServiceimpl implements UsersService{
	private UsersRepository usersRepository;
	public UsersServiceimpl(UsersRepository usersRepository) {
		super();
		this.usersRepository=usersRepository;
	}
	@Override
	public UsersEntity saveUser(UsersEntity user) {
		user.setCreated_date(new Date());
		return usersRepository.save(user);
	}

	@Override
	public List<UsersEntity> getAllUser() {
		return usersRepository.findAll();
	}
	@Override
	public UsersEntity getUserById(long id) {
		return usersRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "Id", id));
	}
	@Override
	public UsersEntity updateUser(UsersEntity user, long id) {
		UsersEntity existingUser=usersRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "Id", id));
		existingUser.setFullname(user.getFullname());
		existingUser.setAddress(user.getAddress());
		existingUser.setBirth(user.getBirth());
		existingUser.setPhone(user.getPhone());
		existingUser.setSex(user.getSex());
		existingUser.setUsername(user.getUsername());
		existingUser.setPassword(user.getPassword());
		existingUser.setUpdate_date(new Date());
		
		
		//save toDB
		usersRepository.save(existingUser);
		
		return existingUser;
	}
	@Override
	public UsersEntity deleteUser(UsersEntity user, long id) {
		UsersEntity existingUser=usersRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "Id", id));
		existingUser.setIs_delete(1);
		existingUser.setUpdate_date(new Date());
		usersRepository.save(existingUser);
		return existingUser;
	
	}
}
