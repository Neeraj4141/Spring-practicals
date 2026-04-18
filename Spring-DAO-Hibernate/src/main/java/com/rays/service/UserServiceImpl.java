package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;

@Service
public class UserServiceImpl implements UserServiceInt {

	@Autowired
	private UserDAOInt dao = null;

	@Transactional(propagation = Propagation.REQUIRED)
	public long add(UserDTO dto) {
		long pk = dao.add(dto);
		return pk;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(UserDTO dto) {
		dao.update(dto);
	}

	public List search(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public UserDTO delete(long id) {
		dao.delete(id);
		return null;
	}

	@Transactional(readOnly = true)
	public UserDTO findByLogin(String login) {
		return dao.findByLogin(login);

	}

	@Transactional(readOnly = true)
	public UserDTO findByPK(long pk) {
		return dao.findByPK(pk);
	}

	public UserDTO authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
