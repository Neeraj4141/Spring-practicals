package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;

@Service
public class UserServiceImpl implements UserServiceInt {

	@Autowired
	private UserDAOInt dao = null;

	public long add(UserDTO dto) {
	dao.add(dto);
		return 0;
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
