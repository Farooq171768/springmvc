package cgg.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cgg.spring.mvc.modal.User1;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	@Transactional
	public int saveUser(User1 user) {
		int id = (Integer)this.hibernateTemplate.save(user);
		return id;
	}

}
