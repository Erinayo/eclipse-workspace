package com.accesshq.uielements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginDialog {

	private WebElement element;
	
	public LoginDialog(WebElement element) {
		this.element = element;
	}

	public void clickLogin() throws Exception {
		for (WebElement button: element.findElements(By.tagName("button"))) {
			System.out.println(button.getText());
			if(button.getText().contentEquals("LOGIN")) {
				button.click();
				return;
			}
		}
		
		throw new Exception("Unable to find login button");
	}
	
	private String getError(String string) throws Exception {
		for(WebElement input: element.findElements(By.className("v-input"))) {
			if(input.findElement(By.tagName("label")).getText().equals(string)) {
				return input.findElement(By.className("v-messages")).getText();
			}
		}
		
		throw new Exception("Unable to find " + string + "error message");
	}

	public String getUserameError() throws Exception {
		return getError("Username");
	}
	
	public String getPasswordError() throws Exception {
		return getError("Password");
	}

}
