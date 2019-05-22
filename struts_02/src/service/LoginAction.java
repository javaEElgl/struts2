package service;

import pojo.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.impl.UserDaoImp;

public class LoginAction extends ActionSupport{
	private UserDaoImp dao;
	private User user;
		public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

		public UserDaoImp getDao() {
		return dao;
	}

	public void setDao(UserDaoImp dao) {
		this.dao = dao;
	}

		@Override
		public String execute() throws Exception {
			if(dao.login(user.getName(), user.getPassword())){
				return SUCCESS;
			}else{
				return ERROR;
			}
		}
}
