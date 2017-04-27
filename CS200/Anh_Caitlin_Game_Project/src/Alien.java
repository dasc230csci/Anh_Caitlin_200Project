/**
 * file Alien.java
 */

/**
 * @author Anh Tran & Caitlin Harvey
 * @version 4/21/2017
 */
public class Alien {
	String give, riddle ,type;
	public Alien(String give,String riddle , String type) {
		this.riddle = riddle;
		this.give = give;
		this.type = type;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGive() {
		return this.give;
	}
	public void setGive(String give) {
		this.give = give;
	}
	public String getRiddle() {
		return riddle;
	}
	public void setRiddle(String riddle) {
		this.riddle = riddle;
	}
	public String toString(){
		return this.type;
	}
}
