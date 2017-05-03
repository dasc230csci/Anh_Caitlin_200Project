import java.io.FileNotFoundException;

public class playGame {
	
private GameLayout game;
private LocationDescription currentPlanet;
private GUILayout gui;

public void init() throws FileNotFoundException{
	gui.setVisible(true);
	game = new GameLayout("Planet Connection","Planet Description");
	
	
}
public static void main(String [] args) throws FileNotFoundException
{
  new playGame().init();
}
}
