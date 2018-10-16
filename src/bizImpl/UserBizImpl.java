package bizImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UserDao;

import entity.User;
import biz.UserBiz;

@Service
public class UserBizImpl implements UserBiz{
	
	@Resource
	private UserDao dao;
	
     
	
	
	public UserDao getDao() {
		return dao;
	}




	public void setDao(UserDao dao) {
		this.dao = dao;
	}




	public User checkLogin(String name, String pwd) {
		// TODO Auto-generated method stub
		return dao.checkLogin(name, pwd);
	}

}
