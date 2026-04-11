package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;

@Service
public class UserService {

	@Autowired
	public UserDAOInt userDao;

	public long add(UserDTO dto) {
		Long pk = userDao.add(dto);
		return pk;

	}

	public void delete(int id) {
		userDao.delete(id);
	}

	public void update(UserDTO dto) {
		userDao.update(dto);
	}

}
