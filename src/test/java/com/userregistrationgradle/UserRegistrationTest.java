package com.userregistrationgradle;
import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {
	
	
	//Test Cases for FirstName.
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("Devesh");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("De");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("Deve@sh");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenWithoutCaps_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("devesh");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenCapsInBetween_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("deVesh");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenEmptyName_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenWithNumber_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("Dev1esh");
		Assert.assertEquals(false, result);
	}
	
	//Test Cases for LastName.
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("Bhangale");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("Bh");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("Bhang@ale");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenWithoutCaps_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("bhangale");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenCapsInBetween_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("bhanGaLe");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenEmptyName_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenWithNumber_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("Bhan1gale");
		Assert.assertEquals(false, result);
	}
	
	//Test Case for Email-ID
	@Test
	public void givenEmailID_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenEmailID_WhenEmailWithNumber_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh1806@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenEmailID_WhenEmailWithNumberAndSpChar_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh-1806@gmail.com");
		Assert.assertEquals(true, result);
		result = userRegistration.validateEmailId("devesh.1806@gmail.com");
		Assert.assertEquals(true, result);
		result = userRegistration.validateEmailId("devesh+1806@net.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenEmailID_WhenEmailWithNumberAndSpCharAndTwoTld_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh-1806@gmail.com.com");
		Assert.assertEquals(true, result);
		result = userRegistration.validateEmailId("devesh.1806@net.com.au");
		Assert.assertEquals(true, result);
		result = userRegistration.validateEmailId("devesh+1806@net.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenEmailID_WhenWithMultipleTld_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh@gmail.com.au.au");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithNoSymbol_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenTldStartsWithDot_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh@.com.my");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenEmailStartsWithDot_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId(".devesh@.com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithNotValidTld_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh@com.m");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithBrackets_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh()*@com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithTwoDots_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh..2002@com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithLastCharDot_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh.@com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithTwoSymbol_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("devesh@2002@com.c");
		Assert.assertEquals(false, result);
	}
	
	//Test Case for Mobile number
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateMobileNumber("91 7506385338");
		Assert.assertEquals(true, result);
		result = userRegistration.validateMobileNumber("1 7506385338");
		Assert.assertEquals(true, result);
		result = userRegistration.validateMobileNumber("1-234 7506385338");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenMobileNumber_WhenWithNoSpace_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateMobileNumber("917506385338");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNumber_WhenLessThanTenDigits_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateMobileNumber("91 75063838");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNumber_WhenWithNoCountryCode_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateMobileNumber("7506385338");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNumber_WhenMoreThanTenDigits_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateMobileNumber("91 750638533889");
		Assert.assertEquals(false, result);
	}
	
	//Test case for Password
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("Devesh@18");
		Assert.assertEquals(true, result);
		result = userRegistration.validatePassword("Devesh@1");
		Assert.assertEquals(true, result);
		result = userRegistration.validatePassword("dEvesh@1");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPassword_WhenWithNoCaps_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("devesh@18");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenWithNoSymbol_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("Devesh18");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenWithLessThanEightLength_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("Dev@18");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenWithNoNumber_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("Devesh@");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenEmptyPassword_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("");
		Assert.assertEquals(false, result);
	}
	
}
