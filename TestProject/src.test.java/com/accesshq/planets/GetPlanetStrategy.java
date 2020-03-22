package com.accesshq.planets;

import java.util.List;

import org.openqa.selenium.WebElement;

public abstract class GetPlanetStrategy {
	
	protected abstract boolean compare(Planet planet);
	
	public Planet getPlanet(List<WebElement> planets) throws Exception {
		for(WebElement planetElement: planets) {
			Planet planet = new Planet(planetElement);
			if(compare(planet)) {
				return planet;
			}
		}

		throw new Exception("Unable to find planet");
	}
}
