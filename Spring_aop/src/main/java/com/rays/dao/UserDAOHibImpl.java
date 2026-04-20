package com.rays.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;

@Repository
public class UserDAOHibImpl implements UserDAOInt {

	@Autowired
	private SessionFactory sessionFactory = null;

	public long add(UserDTO dto) {
		long pk = (Long) sessionFactory.getCurrentSession().save(dto);
		return pk;
	}

	public void update() {
		// TODO Auto-generated method stub

	}

	public UserDTO delete(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO findByPk(long pk) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO findBbyLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	public void list(UserDTO dto) {
		// TODO Auto-generated method stub

	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
