package com.accesshq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.accesshq.planets.Planet;

public class PlanetsPage extends BasePage{

	public PlanetsPage(WebDriver driver) {
		super(driver);
	}

	public Planet getPlanet(String planetName) throws Exception {
		for(WebElement planetElement: driver.findElements(By.className("planet"))) {
			Planet planet = new Planet(planetElement);
			if(planet.getName().equals(planetName)) {
				return planet;
			}
		}

		throw new Exception("Unable to find planet");
	}

	public Object getAlertMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement popup = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("popup")));
		wait.until(ExpectedConditions.textToBePresentInElement(popup, "Exploring"));

		return popup.findElement(By.className("popup-message")).getText();	}

}
