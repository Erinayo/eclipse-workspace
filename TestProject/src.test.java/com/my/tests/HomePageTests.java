package com.my.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class HomePageTests extends BaseTestSuite {
	
	public HomePageTests() {
		super("");
	}

	@Test
	void test() {
		driver.findElement(By.tagName("body"));
	}

}
