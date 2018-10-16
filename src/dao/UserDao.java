package dao;

import entity.User;

public interface UserDao {
	
	
	public User checkLogin(String name,String pwd);

}
