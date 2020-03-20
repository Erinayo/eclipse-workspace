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
	void LoveListTest() {
		HomePage homePage = new HomePage(driver);
		
		//homePage.clickListHeart("List item 2");
		Assertions.assertEquals("CLICK ME UP!", homePage.getTransitionText());
	}
	
	@Test
	void HelloGreetingTest() {
		HomePage homePage = new HomePage(driver);
		
		homePage.setForename("Dan");
		homePage.clickButton("submit");
		Assertions.assertEquals("Hello Dan", homePage.getPopupMessage());
	}
	
	@Test
	void ButtonsTest() {
		HomePage homePage = new HomePage(driver);
		
		homePage.clickButton("login");
		homePage.clickButton("cancel");
		//homePage.clickButton("home");
		homePage.clickButton("link-button");

		Assertions.assertEquals("Hello Dan", homePage.getPopupMessage());
	}
}
