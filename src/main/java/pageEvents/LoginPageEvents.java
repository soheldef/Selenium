package pageEvents;

import utils.ElementFetch;
import pageObjects.LoginPageElements;

public class LoginPageEvents {
	ElementFetch ele = new ElementFetch();
//	public void verifyIfLoginPageIsLoaded() {
//		
//		Assert.assertTrue(ele.getWebElement("XPATH",LoginPageElements.loginText), "Element not found");
//		
//	}
	
public void EnterCredentials() {
		
		ele.getWebElement("XPATH",LoginPageElements.emailAddress).sendKeys("rmishra@gmail.com");
		ele.getWebElement("XPATH",LoginPageElements.passwordField).sendKeys("12345");
		
	}

}
