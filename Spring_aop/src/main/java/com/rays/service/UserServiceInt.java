package com.rays.service;

import java.util.List;

import com.rays.dto.UserDTO;

public interface UserServiceInt {

	public long add(UserDTO dto);

	public void update();

	public UserDTO delete(long id);

	public UserDTO findByPk(long pk);

	public UserDTO findBbyLogin(String login);

	public void list(UserDTO dto);

	public List search(UserDTO dto, int pageNo, int pageSize);

}
