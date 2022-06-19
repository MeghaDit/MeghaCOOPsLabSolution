package com.greatLearning.email.service;

import com.greatLearning.email.model.Employee;

public interface credentialService {
	public String generateEmail(Employee Emp,String dept);
	public char[] generatePassword();
	public void showCredentials(Employee Emp, String Dept);

}
