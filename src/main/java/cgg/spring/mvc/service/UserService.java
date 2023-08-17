package cgg.spring.mvc.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cgg.spring.mvc.dao.UserDao;
import cgg.spring.mvc.modal.User1;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public int createUser(User1 user) {
		return this.userDao.saveUser(user);
	}
}
