package com.cp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cp.model.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public User saveUser(User user) {

		String sql = "insert into chanchal(name, password) values(?,?)";

		jdbcTemplate.update(sql, new Object[] { user.getName(), user.getPassword() });
		return user;

	}

}
