package com.userregistrationgradle;

import java.util.regex.Pattern;

@FunctionalInterface
interface IRegistration{
	boolean validate(String input);
	static void printFormat(String n,String name,IRegistration obj) {
		System.out.println(name + " Validation of "+ n + " is "+obj.validate(n));
	}
}

public class UserRegistration {
	
	private static final String NAME_PATTERN = "^[A-Z][a-z]{3,}";
	private static final String EMAIL_ID_PATTERN = "^[A-Z]?[a-z]{2,}[.+_-]?[0-9a-zA-Z]{0,}@[A-Za-z0-9]{1,}.[a-z]{2,}[.]?([a-z]{2,})?$";
	private static final String MOBILE_NUMBER_PATTERN = "^[0-9-]{1,}\\s[0-9]{10}$";
	private static final String PASSWORD_PATTERN = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";
	
	public boolean validateFirstName(String name) throws MoodAnalysisException {
		try {
			Pattern pattern = Pattern.compile(NAME_PATTERN);
			return pattern.matcher(name).matches();
		}
		catch (NullPointerException exception) {
			throw new MoodAnalysisException("Invalid Input.");
		}
	}
	
	public boolean validateLastName(String name) throws MoodAnalysisException{
		try {
			Pattern pattern = Pattern.compile(NAME_PATTERN);
			return pattern.matcher(name).matches();
		}
		catch (NullPointerException exception) {
			throw new MoodAnalysisException("Invalid Input.");
		}
	}
	
	public boolean validateEmailId(String email) throws MoodAnalysisException{
		try {
			Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
			return pattern.matcher(email).matches();
		}
		catch (NullPointerException exception) {
			throw new MoodAnalysisException("Invalid Input.");
		}
	}
	
	public boolean validateMobileNumber(String number) throws MoodAnalysisException{
		try {
			Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
			return pattern.matcher(number).matches();
		}
		catch(NullPointerException exception) {
			throw new MoodAnalysisException("Invalid Input.");
		}
	}
	
	public boolean validatePassword(String password) throws MoodAnalysisException{
		try {
			Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
			return pattern.matcher(password).matches();
		}
		catch(NullPointerException exception) {
			throw new MoodAnalysisException("Invalid Input.");
		}
	}
	
}