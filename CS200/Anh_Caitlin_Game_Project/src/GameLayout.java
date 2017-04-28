import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
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
	          this.connection.get(planetName).add(scanner2.nextLine());
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
	    	  }
	      }
	      scanner3.close();
	}
	    catch(FileNotFoundException e){
	        System.out.println("File not found");
	      }     
	}
	
	
}