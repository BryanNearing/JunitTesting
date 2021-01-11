package com.Testing;


import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

class LoginTest {

	@Test
	void loginPass() {
		
		final String username = "admin";
		final String password = "password";
		
		Login l = new Login();
		
		boolean loginStatus = l.login(username, password);
		
		assertTrue(loginStatus);
		
	}
	
	@Test
	void loginFail() {
		
		final String username = "admin";
		final String password = "Badpassword";
		
		Login l = new Login();
		
		boolean loginStatus = l.login(username, password);
		
		assertTrue(loginStatus);
		
	}

}
