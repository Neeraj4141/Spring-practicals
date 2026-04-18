package com.rays.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;

@Repository
public class UserDAOHibImpl implements UserDAOInt {

	@Autowired
	private SessionFactory sessionfactory = null;

	public long add(UserDTO dto) {
		long pk = (Long) sessionfactory.getCurrentSession().save(dto);
		return pk;
	}

	public void update(UserDTO dto) {
		sessionfactory.getCurrentSession().update(dto);

	}

	public UserDTO delete(long id) {
		UserDTO dto = findByPK(id);
		sessionfactory.getCurrentSession().delete(dto);
		return dto;
	}

	public UserDTO findByLogin(String login) {
		UserDTO dto = null;
		Session session = sessionfactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);
		criteria.add(Restrictions.ilike("login", login));
		List list = criteria.list();
		if (list.size() == 1) {
			dto = (UserDTO) list.get(0);
		}
		return dto;
	}

	public UserDTO auth(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO findByPK(long pk) {
		UserDTO dto = null;
		dto = (UserDTO) sessionfactory.getCurrentSession().get(UserDTO.class, pk);
		return dto;
	}

	public List search(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
