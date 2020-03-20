package com.accesshq.tests;

import org.junit.jupiter.api.Test;

import com.accesshq.pages.HomePage;

public class HomePageTests extends BaseTestSuite {
	
	public HomePageTests() {
		super("https://d1iw6mb9di5l9r.cloudfront.net/");
	}

	@Test
	void test() {
		HomePage homePage = new HomePage(driver);
	}

}
