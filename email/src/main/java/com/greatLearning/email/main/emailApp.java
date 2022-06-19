package com.greatLearning.email.main;

import java.util.Scanner;
import com.greatLearning.email.model.Employee;
import com.greatLearning.email.service.credentialService;
import com.greatLearning.email.service.credentialServiceImpl;

public class emailApp {

	static credentialService service = new credentialServiceImpl();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the First Name");
		String firstName = sc.next();
		System.out.println("Enter the last Name");
		String lastName = sc.next();
		Employee emp = new Employee(firstName,lastName);
		getEmailCredentials(emp);
	}

	static public void getEmailCredentials(Employee emp) {

		System.out.println("Please enter the following from the department ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int option = sc.nextInt();
		String Dept = "";

		switch(option) {			
		case 1:
			Dept = "tech";
			break;
		case 2:
			Dept = "Admin";
			break;
		case 3:
			Dept = "hr";
			break;
		case 4:
			Dept = "legal";
			break;
		default:
			System.out.println("Please enter a correct option from 1 to 4 ");
			break;
		}
		service.showCredentials(emp, Dept); 
	}
}
