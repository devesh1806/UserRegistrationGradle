package com.userregistrationgradle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import java.util.Collection;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class ValidEmailTest {
	private String emailId;
	private boolean expectedResult;
	private UserRegistration userRegistration;
	
	public ValidEmailTest(String emailId,boolean expectedResult) {
		this.emailId=emailId;
		this.expectedResult=expectedResult;
	}
	
	@Before
	public void initialize() {
		userRegistration = new UserRegistration();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com",true},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com",true},
			{"abc111@abc.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@1.com",true},
			{"abc@gmail.com.com",true},
			{"abc+100@gmail.com",true},
			{"abc",false},
			{"abc@.com.my",false},
			{"abc123@gmail.a",false},
			{"abc123@.com",false},
			{"abc123@.com.com",false},
			{".abc@abc.com",false},
			{"abc()*@gmail.com",false},
			{"abc@%*.com",false},
			{"abc..2002@gmail.com",false},
			{"abc.@com",false},
			{"abc@abc@gmail.c",false},
			{"abc@gmail.com.1a",false},
			{"abc@gmail.com.aa.au",false}
			});
	}
	
	@Test
	public void givenEmailID_ShouldReturnAsPerParamaterizedResult() {
		System.out.println("Is " + emailId +" valid: " + expectedResult);
		Assert.assertEquals(expectedResult, userRegistration.validateEmailId(emailId));
	}
}
