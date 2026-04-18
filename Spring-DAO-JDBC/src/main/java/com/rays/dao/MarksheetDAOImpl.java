package com.rays.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.rays.dto.UserDTO;

public class MarksheetDAOImpl implements MarksheetDAOInt {

	private JdbcTemplate jdbctemplet;

	private DataSource datasource = null;

	@Autowired
	public void setDataSoure(DataSource datasource) {
		this.jdbctemplet = new JdbcTemplate(datasource);
	}

	public long nextPk() {
		String sql = "select max(id) from st_user";
		Long maxId = jdbctemplet.queryForObject(sql, Long.class);
		if (maxId == null) {
			return 1;
		}
		return maxId + 1;
	}

	public long add(UserDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public void update(UserDTO dto) {
		// TODO Auto-generated method stub

	}

	public UserDTO findByPk(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
