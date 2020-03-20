package com.accesshq.uielements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemList {
	
	public WebElement element;
	
	public ItemList(WebElement element) {
		this.element = element;
	}
	
	public void favouriteListItem(String listItem) throws Exception {
		for(WebElement item: element.findElements(By.tagName("li")) ) {
			if(item.findElement(By.className("list-title")).getText().equals(listItem)) {
				item.findElement(By.className("list-item-button")).click();
				return;
			}
		}
		
		throw new Exception("Unable to find list item");
	}
}
