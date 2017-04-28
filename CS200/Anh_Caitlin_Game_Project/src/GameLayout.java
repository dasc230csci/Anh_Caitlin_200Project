import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
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
	public GameLayout(){
		this.connection = new HashMap<String, Set<String>>();
		this.descriptions = new HashMap<String, LocationDescription>();
	}
	public GameLayout(String fileName1, String fileName2) throws FileNotFoundException{
		this.connection = new HashMap<String, Set<String>>();
		this.descriptions = new HashMap<String, LocationDescription>();
		this.planets= new PlanetsDescription();
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
	
}
