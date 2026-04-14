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
		userDao.findByPk(id);
	}

	public void update(UserDTO dto) {
		userDao.update(dto);
	}

	public UserDTO findByPk(int id) {
		return userDao.findByPk(id);
	}

	public UserDTO findByLogin(String login) {
		return userDao.findByLogin(login);
	}

	public UserDTO authenticate(String login, String password) {
		return userDao.authenticate(login, password);

	}

}
