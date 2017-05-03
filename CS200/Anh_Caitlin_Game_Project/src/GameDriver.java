import java.io.FileNotFoundException;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class GameDriver {
private GameLayout game;
private LocationDescription currentPlanet;

private GUILayout gui = new GUILayout();

public void init() throws FileNotFoundException{
	gui.setVisible(true);
	game = new GameLayout("Planet Connection","Planet Description");
	
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
	if(game.explore(nextPlanet)){
		String answer = JOptionPane.showInputDialog("Answer this to pass: "+ game.getRiddle());	
		System.out.println(game.checkAnswer(answer));
	}
	System.out.println(game.getDescription("Middle Earth(M)"));
	boolean test = game.explore("Middle Earth(M)");
	System.out.println(test);
	if(test){
		String answer = JOptionPane.showInputDialog("Answer this to pass: "+ game.getRiddle());	
		System.out.println(game.checkAnswer(answer));
	}
}
public static void main(String [] args) throws FileNotFoundException
{
  new GameDriver().init();
}
}
