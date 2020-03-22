package com.accesshq.planets;

public class GetPlanetStrategyRadius extends GetPlanetStrategy{

	private double radius;
	
	public GetPlanetStrategyRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	protected boolean compare(Planet planet) {
		return planet.getRadius() <= this.radius;
	}

}
