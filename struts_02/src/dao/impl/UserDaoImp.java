package dao.impl;

import pojo.User;
import dao.UserDao;

public class UserDaoImp implements UserDao{
	@Override
	public boolean login(String name, String password) {
		if("lgl".equals(name)){
			return true;
		}else{
			return false;
		}
	}
}
