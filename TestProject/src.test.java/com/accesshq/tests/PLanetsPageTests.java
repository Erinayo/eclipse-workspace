package com.accesshq.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.accesshq.pages.HomePage;
import com.accesshq.pages.PlanetsPage;
import com.accesshq.planets.Planet;

class PLanetsPageTests extends BaseTestSuite{

	public PLanetsPageTests() {
		super("https://d1iw6mb9di5l9r.cloudfront.net/");
	}

	@Test
	void ExploreTest() throws Exception {
		HomePage homePage = new HomePage(driver);
		PlanetsPage planetsPage = homePage.clickPlanetsMenuItem();	
		Planet planet = planetsPage.getPlanet("Neptune");
		
		planet.clickExplore();
		Assertions.assertEquals("Exploring Neptune", planetsPage.getAlertMessage());
		
	}

}
