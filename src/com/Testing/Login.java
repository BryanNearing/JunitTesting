package com.Testing;

public class Login {

	private String username = "admin";
	private String password = "password";
	
	public Login() {
		super();
	}
	
	public boolean login(String uname, String password) {
		
		if(uname.equals(this.username) && password.equals(this.password))
			return true;
		else
			return false;
		
	}
	
}
