package main;

import models.Password;

public class PasswordApp {

	public static void main(String[] args) {
		
		Password password = new Password();
		
		Password password1 = new Password(9);
		
		System.out.println(password.toString());
		
		System.out.println(password1.toString());

	}

}
