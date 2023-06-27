package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.User;

public interface Userdao {
	
	public User saveuser(User user);
	
	public User getUserId(int uid);
	
	public boolean deletUserId(int uid);
	
	public User updateUserId(int uid,User user);
	
	public List<User> getAlluser();
	
	public List<User> getUserByRole(String role);

}
