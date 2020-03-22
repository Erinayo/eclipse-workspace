package com.accesshq.planets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Planet {
	
	private WebElement element;
	
	public Planet(WebElement element) {
		this.element = element;
	}
	
	public String getName() {
		return element.findElement(By.className("name")).getText();
	}

	public void clickExplore() {
		element.findElement(By.tagName("button")).click();
	}

	public double getRadius() {
		return Double.parseDouble(element.findElement(By.className("radius")).getText());
	}
	
	
}
