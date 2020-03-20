package com.accesshq.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.accesshq.pages.HomePage;
import com.accesshq.uielements.LoginDialog;

class LoginDialogTests extends BaseTestSuite{ 

	public LoginDialogTests() {
		super("https://d1iw6mb9di5l9r.cloudfront.net/");
	}

	@Test
	void MandatoryErrorMessagesTest() throws Exception {
		HomePage homePage = new HomePage(driver);
		LoginDialog loginDialog = homePage.clickUsersMenuItem();
		loginDialog.clickLogin();
		Assertions.assertEquals("Invalid user and password", loginDialog.getUserameError(), "Username error message correct");
		Assertions.assertEquals("Invalid user and password", loginDialog.getPasswordError(), "Password error message correct");
	}

}
