package com.rays.dao;

import com.rays.dto.UserDTO;

public interface MarksheetDAOInt {
	
	public long nextPk();

	public long add(UserDTO dto);

	public void delete(int id);

	public void update(UserDTO dto);

	public UserDTO findByPk(int id);

}
