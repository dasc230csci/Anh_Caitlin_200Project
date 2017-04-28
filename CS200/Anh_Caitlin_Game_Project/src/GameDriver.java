import java.io.FileNotFoundException;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class GameDriver {
private GameLayout game;
private LocationDescription currentPlanet;
public void init() throws FileNotFoundException{
	game = new GameLayout("Planet Connection","PlanetDescription");
	
	System.out.println("------------------List the description of a location------------------");
	currentPlanet = game.getDescription("Earth(A)");
	String currentName = currentPlanet.getPlanetName();
	System.out.println(currentPlanet.toString());
	
	System.out.println("------------------List out all the planet------------------");
	Iterator<String>planets = game.locations();
	while(planets.hasNext()){
		System.out.println(planets.next());
	}
	
	System.out.println("------------------List all the location connected to the location------------------");
	System.out.println("Your options to move next are: "+"\n");
	Iterator<String>connections = game.connections(currentName);
	while(connections.hasNext()){
		System.out.println(connections.next());
	}
	System.out.println("------------------move to the connected location------------------");
	String nextPlanet = JOptionPane.showInputDialog("Where do you want to go next: ");
	currentPlanet = game.getDescription(nextPlanet);
	System.out.println(currentPlanet.toString());
}
public static void main(String [] args) throws FileNotFoundException
{
  new GameDriver().init();
}
}
