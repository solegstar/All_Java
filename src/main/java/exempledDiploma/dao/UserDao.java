package exempledDiploma.dao;

import java.util.List;

import exempledDiploma.models.User;

public interface UserDao {
	User getUserById(int id);
	List <User> getAllUsers();
	boolean saveUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(User user);

}
