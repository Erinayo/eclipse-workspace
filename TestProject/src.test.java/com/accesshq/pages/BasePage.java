package com.accesshq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.accesshq.uielements.LoginDialog;

public abstract class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public FormsPage clickFormsMenuItem() {
		driver.findElement(By.cssSelector(".v-toolbar__items [aria-label='forms'")).click();
		return new FormsPage(driver);
	}
	
	public PlanetsPage clickPlanetsMenuItem() {
		driver.findElement(By.cssSelector(".v-toolbar__items [aria-label='planets'")).click();
		return new PlanetsPage(driver);
	}
	
	public LoginDialog clickUsersMenuItem() {
		driver.findElement(By.cssSelector(".users")).click();
		WebElement loginDialog = new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.id("loginDialog")));
		return new LoginDialog(loginDialog);
	}

}
