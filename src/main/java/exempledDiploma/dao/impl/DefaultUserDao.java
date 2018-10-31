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
		private DataSource ds;
		
		{
			this.ds = DataSourceUtils.getDataSource();
		}
	public static void main(String[] args) {

	}

	public User getUserById(int id) {
			User user = new User();		// TODO Auto-generated method stub
		try (Connection conn = ds.getConnection()) {
			PreparedStatement preparedStatement = conn.prepareStatement(SELECT_USER_BY_ID_QUERY);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
						user.setId(rs.getInt("id"));
						user.setName(rs.getString("name"));
						user.setLastName(rs.getString("last_name"));
						user.setDob(rs.getDate("dob"));	
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		} 
		
		return user;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
