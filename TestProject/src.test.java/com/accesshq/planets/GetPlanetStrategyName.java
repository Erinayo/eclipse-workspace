package com.accesshq.planets;

public class GetPlanetStrategyName extends GetPlanetStrategy {
	
	private String name;
	
	public GetPlanetStrategyName(String name) {
		this.name = name;
	}

	@Override
	protected boolean compare(Planet planet) {
		return planet.getName().equals(name);
	}

}
