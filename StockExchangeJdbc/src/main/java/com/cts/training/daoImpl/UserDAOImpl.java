package com.cts.training.daoImpl;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import com.cts.training.dao.UserEntity;
public class UserDAOImpl {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
	}
	public boolean saveUser(UserEntity userDAO) {
//		String query = "insert into userdao values('" +
//		userDAO.getId() + "','" +
//		userDAO.getUsername() + "','" + userDAO.getPassword() + "','" +
//		userDAO.getEmail() + "','" + userDAO.getEmail() + "')";
//		try {
//		jdbcTemplate.update(query); return true; } catch (DataAccessException e) {
//		e.printStackTrace();
//		return false;
//		}
		String query = "insert into userdao values(?,?,?,?,?)";
		try {
		jdbcTemplate.update(query, userDAO.getId(), userDAO.getUsername(), userDAO.getEmail(), userDAO.getEmail(), userDAO.getPhone());
		return true;
		} catch (DataAccessException e) {
		e.printStackTrace();
		return false;
		}
		}
}