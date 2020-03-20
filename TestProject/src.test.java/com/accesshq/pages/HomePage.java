package com.accesshq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickTransitionButton() {
		driver.findElement(By.className("anibtn")).click();
	}

	public String getTransitionText() {
		By locator = By.className("animating");
		new WebDriverWait(driver, 30).until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(locator)));
		return driver.findElement(By.className("anibtn")).getText();
	}

	public void setForename(String forename) {
		driver.findElement(By.id("forename")).sendKeys(forename);
	}

	public void clickButton(String buttonId) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+buttonId+"']"))).click();		
	}

	public String getPopupMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement popup = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("popup")));
		wait.until(ExpectedConditions.textToBePresentInElement(popup, "Hello"));

		return popup.findElement(By.className("popup-message")).getText();
	}
	
}
