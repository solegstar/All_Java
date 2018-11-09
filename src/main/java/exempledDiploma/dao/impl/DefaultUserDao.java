package exempledDiploma.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import exempledDiploma.dao.UserDao;
import exempledDiploma.dbutils.DataSourceUtils;
import exempledDiploma.models.User;

public class DefaultUserDao implements UserDao {
	public static final String SELECT_USER_BY_ID_QUERY = "SELECT * FROM user WHERE user.id = ?";
	public static final String INSERT_NEW_USER = "INSERT INTO user (name, last_name, dob, email) VALUES (?, ?, ?, ?)";
	public static final String UPDATE_USER = "UPDATE user SET name = (?), last_name = (?), dob = (?), email = (?) WHERE (id = (?))";
	public static final String DELETE_USER = "DELETE FROM user WHERE (id = (?));";
	private DataSource ds;

	{
		this.ds = DataSourceUtils.getDataSource();
	}

	@Override
	public User getUserById(int id) {
		User user = new User(); // TODO Auto-generated method stub
		try (Connection conn = ds.getConnection()) {
			PreparedStatement preparedStatement = conn.prepareStatement(SELECT_USER_BY_ID_QUERY);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setLastName(rs.getString("last_name"));
				user.setDob(rs.getString("dob"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return user;
	}
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveUser(User user) {
		try (Connection conn = ds.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(INSERT_NEW_USER);
			ps.setString(1, user.getName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getDob());
			ps.setString(4, user.getEmail());
			// TODO change sql query to insert email and other fields
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		try (Connection conn = ds.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(UPDATE_USER);
			ps.setString(1, user.getName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getDob());
			ps.setString(4, user.getEmail());
			ps.setInt(5, user.getId());
			// TODO change sql query to insert email and other fields
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteUser(User user) {
		try (Connection conn = ds.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(DELETE_USER);
			ps.setInt(1, user.getId());
			// TODO change sql query to insert email and other fields
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
