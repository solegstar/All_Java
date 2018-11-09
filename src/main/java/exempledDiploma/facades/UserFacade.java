package exempledDiploma.facades;

import exempledDiploma.dao.UserDao;
import exempledDiploma.dao.impl.DefaultUserDao;
import exempledDiploma.models.User;

public class UserFacade {

	private UserDao userDao;
	
	{
		userDao = new DefaultUserDao();
	}
	
	public User getUserById (int id) {
		if (id > 0) {
			return userDao.getUserById(id);
		}
		throw new IllegalArgumentException();
	}
	
	public boolean saveUser (User user) {
		return userDao.saveUser(user);
	}

}
