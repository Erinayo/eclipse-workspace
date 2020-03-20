package com.accesshq.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.accesshq.pages.HomePage;

public class HomePageTests extends BaseTestSuite {
	
	public HomePageTests() {
		super("https://d1iw6mb9di5l9r.cloudfront.net/");
	}

	@Test
	void StateTransitionTest() {
		HomePage homePage = new HomePage(driver);
		
		homePage.clickTransitionButton();
		Assertions.assertEquals("CLICK ME UP!", homePage.getTransitionText());
		homePage.clickTransitionButton();
		Assertions.assertEquals("CLICK ME DOWN!", homePage.getTransitionText());
	}

	@Test
	void LoveListTest() throws Exception {
		HomePage homePage = new HomePage(driver);
		
		homePage.clickListHeart("List Item 2");
		Assertions.assertEquals("You loved List Item 2", homePage.getPopupMessage());
	}
	
	@Test
	void HelloGreetingTest() {
		HomePage homePage = new HomePage(driver);
		
		homePage.setForename("Dan");
		homePage.clickSubmitButton();
		Assertions.assertEquals("Hello Dan", homePage.getPopupMessage());
	}
	
	@Test
	void ButtonsTest() {
		HomePage homePage = new HomePage(driver);
		
		homePage.clickLoginButton("login");
		homePage.clickCancelButton("cancel");
		homePage.clickHomeButton("home");
		homePage.clickLinkButton("link-button");

		//Assertions.assertEquals("Hello Dan", homePage.getPopupMessage());
	}
}
