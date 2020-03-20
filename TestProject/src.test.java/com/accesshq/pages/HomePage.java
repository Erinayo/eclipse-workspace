package com.accesshq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.accesshq.uielements.ItemList;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickTransitionButton() {
		driver.findElement(By.className("anibtn")).click();
	}

	public String getTransitionText() {
		By locator = By.className("animating");
		new WebDriverWait(driver, 10).until(ExpectedConditions.not(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)));
		return driver.findElement(By.className("anibtn")).getText();
	}

	public void setForename(String forename) {
		driver.findElement(By.id("forename")).sendKeys(forename);
	}

	public void clickSubmitButton() {
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("submit"))).click();		
	}

	public String getPopupMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement popup = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("popup")));
		wait.until(ExpectedConditions.textToBePresentInElement(popup, ""));

		return popup.findElement(By.className("popup-message")).getText();
	}
	
	public void clickButton(String buttonId) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+buttonId+"']"))).click();		
	}

	public void clickLoginButton(String string) {
		clickButton("login");
	}
	
	public void clickHomeButton(String string) {
		clickButton("cancel");
	}
	
	public void clickCancelButton(String string) {
		clickButton("cancel");
	}
	
	public void clickLinkButton(String string) {
		clickButton("login");
	}
	
	public void clickUploadButton(String string) {
		clickButton("login");
	}

	public void clickListHeart(String listItem) throws Exception {
		ItemList list = new ItemList(driver.findElement(By.tagName("ul")));
		list.favouriteListItem(listItem);
	}
	
}
