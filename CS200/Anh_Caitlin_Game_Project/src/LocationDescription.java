/**
 * file LocationDescription.java
 */

/**
 * @author Anh Tran & Caitlin Harvey
 * @version 4/21/2017
 */
public class LocationDescription {
	
	private String planetName, wormHoleKey, gravityBomb, peaceOffering;
	private String alien;
	private String resources, asteroidChance;
	
	public LocationDescription(String planetName, String wormHoleKey, String gravityBomb,
			String peaceOffering, String alien, String resources) {
		this.planetName = planetName;
		this.wormHoleKey = wormHoleKey;
		this.gravityBomb = gravityBomb;
		this.lightSaber = lightSaber;
		this.peaceOffering = peaceOffering;
		this.alien = alien;
		this.resources = resources;
	}

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}

	public String getWormHoleKey() {
		return wormHoleKey;
	}

	public void setWormHoleKey(String wormHoleKey) {
		this.wormHoleKey = wormHoleKey;
	}

	public String getGravityBomb() {
		return gravityBomb;
	}

	public void setGravityBomb(String gravityBomb) {
		this.gravityBomb = gravityBomb;
	}

	public String getLightSaber() {
		return lightSaber;
	}

	public void setLightSaber(String lightSaber) {
		this.lightSaber = lightSaber;
	}

	public String getPeaceOffering() {
		return peaceOffering;
	}

	public void setPeaceOffering(String peaceOffering) {
		this.peaceOffering = peaceOffering;
	}

	public String getAlien() {
		return alien;
	}

	public void setAlien(String alien) {
		this.alien = alien;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}
	
	public String toString(){
		return this.planetName+"\n"+this.alien.toString()+"\n"+this.getResources()+"\n"+this.getGravityBomb()+"\n"+this.getWormHoleKey()+"\n"+this.getAsteroidChance()+"\n"+this.getPeaceOffering();
	}

	public String getAsteroidChance() {
		return asteroidChance;
	}

	public void setAsteroidChance(String asteroidChance) {
		this.asteroidChance = asteroidChance;
	}
}
