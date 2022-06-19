package com.greatLearning.email.service;

import java.util.Random;
import com.greatLearning.email.model.Employee;

public class credentialServiceImpl implements credentialService{

	@Override
	public String generateEmail(Employee Emp, String dept) {
		return Emp.getFirstName().toLowerCase() + Emp.getLastName().toLowerCase() + "@" + dept + ".abc.com"; 
	}

	@Override
	public char[] generatePassword() {
		Random random = new Random();
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smalls = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*+_-/?.<>)";
		String values = caps + smalls + numbers + specialCharacters;

		char[] password = new char[8];

		for(int i=0;i<8;i++) {
			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;
	}

	@Override
	public void showCredentials(Employee Emp, String Dept) {
		System.out.println("Dear " + Emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    --> " + generateEmail(Emp,Dept));
		System.out.println("Password --> " + generatePassword());

	}

}
