/**
 * file Alien.java
 */

/**
 * @author Anh Tran & Caitlin Harvey
 * @version 4/21/2017
 */
public class Alien {
	String lightSaber, clue, riddle ,type;
	int resources;
	public Alien(String lightSaber, String clue, String type, int resources, String riddle) {
		this.lightSaber = lightSaber;
		this.clue = clue;
		this.resources = resources;
		this.type = type;
	}
	public String getLightSaber() {
		return lightSaber;
	}
	public void setLightSaber(String lightSaber) {
		this.lightSaber = lightSaber;
	}
	public String getClue() {
		return clue;
	}
	public void setClue(String clue) {
		this.clue = clue;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getResources() {
		return resources;
	}
	public void setResources(int resources) {
		this.resources = resources;
	}
	public String getRiddle() {
		return riddle;
	}
	public void setRiddle(String riddle) {
		this.riddle = riddle;
	}
	public String toString(){
		return "This alien is a" + this.type;
	}
}
