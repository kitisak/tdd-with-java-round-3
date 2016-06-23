package di;

public class AuthenticationService {
	
	UserDao userDao;
	
	public AuthenticationService(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean isUsernameExisted(String username) {
		User user = userDao.searchByUsername(username);
		if(user != null) {
			return true;
		}
		return false;
	}

}
