package di;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuthenticationServiceTest {
	
	@Test public void
	username_existed() {
		AuthenticationService authenticationService =
				new AuthenticationService( new SucessUserDao() );
		assertTrue(
				authenticationService
				.isUsernameExisted("somkiat"));
	}
	
	@Test public void
	username_not_existing() {
		AuthenticationService authenticationService =
				new AuthenticationService( new NullUserDao() );
		assertFalse(
				authenticationService
				.isUsernameExisted("somkiat"));
	}

}

class SucessUserDao implements UserDao {
	public User searchByUsername(String username) {
		return new User();
	}
	
}

class NullUserDao implements UserDao {
	public User searchByUsername(String username) {
		return null;
	}
	
}



