package com.rays.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAOInt {

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
		Long pk = nextPk();
		String sql = "insert into st_user values(?, ?, ?, ?, ?)";
		int i = jdbctemplet.update(sql, pk, dto.getFirstName(), dto.getLastname(), dto.getLoginId(), dto.getPassword());
		return i;

	}

	public void delete(int id) {
		String sql = "delete from st_user where id = ?";
		jdbctemplet.update(sql, id);
	}

	public void update(UserDTO dto) {
		String sql = "update st_user set st_firstName = ?, st_lastName = ?, st_loginId = ?, st_password = ? where id = ?";
		jdbctemplet.update(sql, dto.getFirstName(), dto.getLastname(), dto.getLoginId(), dto.getPassword(),
				dto.getId());

	}

	public UserDTO findByPk(int id) {
		try {
			String sql = ("select * from st_user where id=?");
			Object[] params = { id };
			UserDTO user = jdbctemplet.queryForObject(sql, params, new UserMapper());
			return user;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public UserDTO findByLogin(String login) {
		try {
			String sql = "select * from st_user where st_loginId = ?";
			Object[] params = { login };
			UserDTO user = jdbctemplet.queryForObject(sql, params, new UserMapper());
			return user;
		} catch (EmptyResultDataAccessException e) {
			return null;

		}

	}

	public UserDTO authenticate(String login, String password) {
		try {
			String sql = "select * from st_user where st_loginId=? and st_password=?";
			Object[] params = { login, password };
			UserDTO user = jdbctemplet.queryForObject(sql, params, new UserMapper());
			return user;
		} catch (EmptyResultDataAccessException e) {
			return null;

		}
	}

}
