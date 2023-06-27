package com.ty.hospital_app.service;

import com.ks.hospital_app.dao.imp.Userdaoimp;
import com.ty.hospital_app.dto.User;

public class UserService {

	public void saveUser(User user)
	{
		Userdaoimp daoimp=new Userdaoimp();
		User user1=daoimp.saveuser(user);
		if(user1 !=null)
		{
			System.out.println("user  saved");
		}
		else
		{
			System.out.println("unfortunatelty user not saved");
		}
	}

	public User getUserId(int uid)
	{
		Userdaoimp userdaoimp=new Userdaoimp();
		User user=userdaoimp.getUserId(uid);
		if(user !=null)
		{
			return user;
		}
		else
		{
			return null;
		}
	}
	public void deleteUserId(int uid)
	{
		Userdaoimp daoimp=new Userdaoimp();
		boolean  flag=daoimp.deletUserId(uid);
		if(flag)
		{
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println("Data not deleted");
		}
	}
	public User updateUser(int uid, User user)
	{
		Userdaoimp daoimp=new Userdaoimp();
		User user1=daoimp.updateUserId(uid,user);
		if(user1 !=null)
		{
			return user1;
		}
		else
		{
			return null;
		}
	}
}