import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * file GameLayout.java
 */

/**
 * @author Anh Tran & Caitlin Harvey
 * @version 4/21/2017
 */
public class GameLayout {
	private Map<String, Set<String>> connection;
	private Map<String, LocationDescription> descriptions;
	private PlanetsDescription planets;
	private int resources, gBomb, key, lightSaber, offering, clueNumber;
	private String clue;
	private String riddle;
	private String[] riddleMaster;
	private String[] clueMaster;
	private Random random;
	
	public GameLayout(){
		this.connection = new HashMap<String, Set<String>>();
		this.descriptions = new HashMap<String, LocationDescription>();
	}
	public GameLayout(String fileName1, String fileName2) throws FileNotFoundException{
		this.connection = new HashMap<String, Set<String>>();
		this.descriptions = new HashMap<String, LocationDescription>();
		this.resources = 250;
		this.gBomb = 0;
		this.key = 0;
		this.lightSaber = 0;
		this.offering = 0;
		this.clue ="";
		this.riddle="";
		this.clueNumber=0;
		this.planets= new PlanetsDescription();
		this.random = new Random();
		this.riddleMaster = new String[15];
		this.riddleMaster[0]="Is an older one-hundred dollar bill worth more than a newer one?";
		this.riddleMaster[1]="What building has the most stories?";
		this.riddleMaster[2]="Railroad crossing without any cars. Can you spell that without any R's?(Please spell in the form of C-A-T. Thank you)";
		this.riddleMaster[3]="How many apples grow on a tree?";
		this.riddleMaster[4]="A truck driver is going opposite traffic on a one-way street. A police officer sees him but doesn't stop him.Why didn't the police officer stop him?";
		this.riddleMaster[5]="A man was sitting on his couch and searching for the English Channel. How did he find it?";
		this.riddleMaster[6]="Which is correct 'The yolk of the egg is white' or 'The egg yolk is white?'";
		this.riddleMaster[7]="I am the only organ that named myself.What am I?";
		this.riddleMaster[8]="Why can't the Tyrannosaurus rex clap?";
		this.riddleMaster[9]="What kind of room has no doors or windows?";
		this.riddleMaster[10]="Why did the hamburger go to the gym?";
		this.riddleMaster[11]="Why would a hair stylist rather cut the hair of two brunettes than one red head?";
		this.riddleMaster[12]="Why was the chef embarrassed?";
		this.riddleMaster[13]="Which is the most curious letter?";
		this.riddleMaster[14]="Which month has 28 days?";
		this.clueMaster =  new String[15];
		this.clueMaster[0]="Read all the words carefully, one word, different meaning, could have.";
		this.clueMaster[1]="Much stories to tell, the library has much books and books have stories, do they not, hmm?  ";
		this.clueMaster[2]="Asked, answer what is.";
		this.clueMaster[3]="From a tree, all the fruit must come.";
		this.clueMaster[4]="Just because you have a car, it means you drive it all the time not. ";
		this.clueMaster[5]="More useful than you think, a map is.";
		this.clueMaster[6]="Yellow, the color of the egg yolk is";
		this.clueMaster[7]="If you think your brain weird, as weird your brain think itself.";
		this.clueMaster[8]="How long ago did the dinosaur go extinct?";
		this.clueMaster[9]="For something more than it is, I once mistook a mushroom.  ";
		this.clueMaster[10]="Exercise, I need exercise, my buns are looking good right now not.  ";
		this.clueMaster[11]="If given the choice between $200 and $100, you choose, what would, hmm?";
		this.clueMaster[12]="Salad dressing, one word, different meaning, could have.";
		this.clueMaster[13]="'Y' are you just as curious not, hmm?";
		this.clueMaster[14]="At least 28 days, every earth month in the year has, not does it, hmm?.";
		planets.begin();
		File file2 = planets.writeFile(fileName2);
	    try{
	      File newFile1 = new File(fileName1);
	      Scanner scanner1 = new Scanner(newFile1);
	      Scanner scanner2 = new Scanner(newFile1);
	      while (scanner1.hasNextLine()){
	        String nextToken1 =  scanner1.nextLine();
	        if(nextToken1.equals("_")&&scanner1.hasNextLine()){
	          this.connection.put(scanner1.nextLine(), new HashSet<>()); 
	        }
	      }
	      while (scanner2.hasNextLine()){
	        String nextToken2 = scanner2.nextLine();
	        if(nextToken2.equals("_")&&scanner2.hasNextLine()){
	        	String planetName = scanner2.nextLine();
	          int number = Integer.parseInt(scanner2.nextLine());
	          for(int i=0; i<number; i++){
	        	  String connectPlanet = scanner2.nextLine();
	        	  connection.get(planetName).add(connectPlanet);
	          }
	        } 
	      }
	      scanner1.close();
	      scanner2.close();
	      File newFile2 = new File(fileName2);
	      Scanner scanner3 = new Scanner(newFile2);
	      while (scanner3.hasNextLine()){
	    	  String firstToken = scanner3.nextLine();
	    	  if(firstToken.equals("_")){
	    		  String name = scanner3.nextLine();
	    		  String alien = scanner3.nextLine();
	    		  String resources = scanner3.nextLine();
	    		  String gBomb = scanner3.nextLine();
	    		  String key = scanner3.nextLine();
	    		  String asteroid = scanner3.nextLine();
	    		  String offering = scanner3.nextLine();
	    		  String yodaGive = scanner3.nextLine();
	    		  LocationDescription planet = new LocationDescription(name, alien, resources, gBomb, key, asteroid, offering, yodaGive);
	    		  descriptions.put(name, planet);
	    	  }
	      }
	      scanner3.close();
	}
	    catch(FileNotFoundException e){
	        System.out.println("File not found");
	      }     
	}
	
	public Iterator<String> locations(){
		return descriptions.keySet().iterator();
	}
	
	public Iterator<String> connections(String planet){
		return connection.get(planet).iterator();
	}
	
	public LocationDescription getDescription(String planet){
		return descriptions.get(planet);
	}
	
	public void update(String name, String alien, String resources, String gBomb, String key, String asteroid, String offering, String yodaGive){
		descriptions.get(name).setDescription(alien, resources, gBomb, key, asteroid, offering, yodaGive);
	}
	
	public void saveGame(String fileName){
		try{
		      File newFile = new File(fileName);
		      PrintWriter writer = new PrintWriter(newFile);
		      Iterator<String> planets = this.locations();
		      while(planets.hasNext()){
		        String planetName = planets.next();
		        writer.write(descriptions.get(planetName).toString());
		      }
		      writer.close();
		    }
		    catch(FileNotFoundException e){
		      System.out.println("File not found");
		    }
	}
	
	public void explore(String planetName){
		if(this.descriptions.get(planetName).getAlien().equals("Good Alien")||this.descriptions.get(planetName).getAlien().equals("Yoda") ){
		this.resources += Integer.parseInt(this.descriptions.get(planetName).getResources());
		if(this.descriptions.get(planetName).getGravityBomb().equals("Gravity Bomb")){
		this.gBomb ++;
		}
		if(this.descriptions.get(planetName).getWormHoleKey().equals("Wormhole Key")){
		this.key ++;
		}
		if(this.descriptions.get(planetName).getPeaceOffering().equals("Peace Offering")){
		this.offering ++;
		}
		if(this.descriptions.get(planetName).getLightSaber().equals("Light Saber")){
			this.lightSaber ++;
		}
		else if(this.descriptions.get(planetName).getLightSaber().equals("clue")){
			this.clueNumber ++;
		}
		}
		else if(this.descriptions.get(planetName).getAlien().equals("Bad Alien")){
			this.resources += Integer.parseInt(this.descriptions.get(planetName).getResources());
			this.riddle=this.descriptions.get(planetName).getLightSaber();
		}
	}
	public int getClueNumber(){
		return this.clueNumber;
	}
	public int getResources(){
		return this.resources;
	}
	
	public int getGBomb(){
		return this.gBomb;
	}
	
	public int getKey(){
		return this.key;
	}
	
	public int getOffering(){
		return this.offering;
	}
	
	public int getYodaGift(){
		return this.lightSaber;
	}
	
	public String getRiddle(){
		return this.riddle;
	}
	
	public String getClue(){
		return this.clue+"\n";
	}
	
	public void setResources(int amount){
		this.resources+=amount;
	}
	
	public void setGBomb(int amount){
		this.gBomb+=amount;
	}
	
	public void setKey(int amount){
		this.key+=amount;
	}
	
	public void setOffering(int amount){
		this.offering+=amount;
	}
	
	public void setYodaGift(int amount){
		this.lightSaber+=amount;
	}
	
	public void setRiddle(String riddle){
		this.riddle = riddle;
	}
	
	public void setClue(String clue){
		this.clue=clue;
	}
	
	public void setClueNumber(int number){
		this.clueNumber+=number;
	}
}
