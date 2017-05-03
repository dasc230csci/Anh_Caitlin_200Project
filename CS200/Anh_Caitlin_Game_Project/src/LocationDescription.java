/**
 * file LocationDescription.java
 */

/**
 * @author Anh Tran & Caitlin Harvey
 * @version 4/21/2017
 */
public class LocationDescription {
	
	private String planetName, wormHoleKey, gravityBomb, peaceOffering, lightSaber;
	private String alien;
	private String resources, asteroidShower;
	
	public LocationDescription(String planetName, String alien, String resources,String gravityBomb, String wormHoleKey,String asteroidShower, String peaceOffering, String lightSaber) {
		this.planetName = planetName;
		this.wormHoleKey = wormHoleKey;
		this.gravityBomb = gravityBomb;
		this.peaceOffering = peaceOffering;
		this.alien = alien;
		this.resources = resources;
		this.asteroidShower = asteroidShower;
		this.lightSaber = lightSaber;
	}
	
	public void setDescription(String alien, String resources,String gravityBomb, String wormHoleKey,String asteroidShower, String peaceOffering, String lightSaber) {
		this.wormHoleKey = wormHoleKey;
		this.gravityBomb = gravityBomb;
		this.peaceOffering = peaceOffering;
		this.alien = alien;
		this.resources = resources;
		this.asteroidShower = asteroidShower;
		this.lightSaber = lightSaber;
	}

	public String getPlanetName() {
		return this.planetName;
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
		return "_"+"\n" + this.planetName+"\n"+this.alien.toString()+"\n"+this.getResources()+"\n"+this.getGravityBomb()+"\n"+this.getWormHoleKey()+"\n"+this.getAsteroidShower()+"\n"+this.getPeaceOffering()+"\n"+this.getLightSaber()+"\n";
	}

	public String getAsteroidShower() {
		return asteroidShower;
	}

	public void setAsteroidShower(String asteroidChance) {
		this.asteroidShower = asteroidChance;
	}
	
	public String getLightSaber() {
		return this.lightSaber;
	}
}
