package com.userregistrationgradle;

import java.util.regex.Pattern;

@FunctionalInterface
interface IRegistration{
	boolean validate(String input);
	static void printFormat(String n,String name,IRegistration obj) {
		System.out.println(name + " Validation of "+ n + " is "+obj.validate(n));
	}
}

public class UserRegistrationLambda {
	public static void main(String[] args) {
		IRegistration firstName = n ->{
			try {
				Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}");
				return pattern.matcher(n).matches();
			}
			catch (NullPointerException e) {
				return false;
			}
			
		};
		
		IRegistration lastName = n ->{
			try {
				Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}");
				return pattern.matcher(n).matches();
			}
			catch (NullPointerException e) {
				return false;
			}
		};
		
		IRegistration email = n ->{
			try {
				Pattern pattern = Pattern.compile("^[A-Z]?[a-z]{2,}[.+_-]?[0-9a-zA-Z]{0,}@[A-Za-z0-9]{1,}.[a-z]{2,}[.]?([a-z]{2,})?$");
				return pattern.matcher(n).matches();
			}
			catch (NullPointerException e) {
				return false;
			}
		};
		
		IRegistration mobileNumber = n ->{
			try {
				Pattern pattern = Pattern.compile("^[0-9-]{1,}\\s[0-9]{10}$");
				return pattern.matcher(n).matches();
			}
			catch (NullPointerException e) {
				return false;
			}
		};
		
		IRegistration password = n ->{
			try{
				Pattern pattern = Pattern.compile("^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$");
				return pattern.matcher(n).matches();
			}
			catch (NullPointerException e) {
				return false;
			}
		};

		
//		TestCases for Lambda Implementation
		IRegistration.printFormat("devesh", "Firstname", firstName);
		IRegistration.printFormat("Devesh", "Firstname", firstName);
		IRegistration.printFormat("De", "Firstname", firstName);
		
		IRegistration.printFormat("Bhangale", "Lastname", lastName);
		IRegistration.printFormat("bhangale", "Lastname", lastName);
		IRegistration.printFormat("Bh", "Lastname", lastName);
		
		IRegistration.printFormat("devesh.com", "Email", email);
		IRegistration.printFormat("devesh-100@net.com.au", "Email", email);
		IRegistration.printFormat("devesh1806@net.com", "Email", email);
		IRegistration.printFormat("abc@xyz.com.com", "Email", email);
		IRegistration.printFormat(null, "Email", email);
		
		IRegistration.printFormat("91 6385338", "Mobile Number", mobileNumber);
		IRegistration.printFormat("17506385338", "Mobile Number", mobileNumber);
		IRegistration.printFormat("1 7506385338", "Mobile Number", mobileNumber);
		IRegistration.printFormat("91 7506385338", "Mobile Number", mobileNumber);
		IRegistration.printFormat("1-245 7506385338", "Mobile Number", mobileNumber);
		
		IRegistration.printFormat("Ascs", "Password", password);
		IRegistration.printFormat("asDafxcZ@123", "Password", password);
		IRegistration.printFormat("abc100@", "Password", password);
		IRegistration.printFormat("asdafxcZ123", "Password", password);
		IRegistration.printFormat("Abc100@123", "Password", password);

	}
}
