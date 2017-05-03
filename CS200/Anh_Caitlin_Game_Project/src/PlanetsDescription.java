import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * A class to create planets with their own unique location description.
 * 
 * @author Anh Tran & Caitlin Harvey
 * @version 4/28/2017
 */
public class PlanetsDescription {
	private LocationDescription earth, pluto, cybertron, dagobah, eternia, wormhole, forgottenRealm, blackHole, gallifrey, hyrule, middleEarth, iathilles, krypton;
	private Random random;
	private LocationDescription[] planets;
	private PrintWriter writer;
	
	/**
	 * Default constructor to set each planet in the location Description array.
	 */
	public PlanetsDescription(){
		planets = new LocationDescription[13];
		random = new Random();
		
	}
	
	/**
	 * Create the starting point, Earth.
	 * 
	 * @return LocationDescription for Earth
	 */
	public LocationDescription createEarth(){
		int resources = random.nextInt(250);
		String amount = resources+"";
		earth = new LocationDescription("Earth(A)","No Alien", amount, "No Gravity Bomb", "No Wormhole Key", "No Asteroid Shower", "No Peace Offering","No Light Saber");
		planets[0]=this.earth;

		return earth;

	}
	
	/**
	 * Create a blackhole, that immediately ends the game if the player enters.
	 * 
	 * @return LocationDescription of blackhole
	 */
	public LocationDescription createBlackHole(){
		blackHole = new LocationDescription("BlackHole(K)", "No Alien", "No Resources", "No Gravity Bomb", "No Wormhole Key", "No Asteroid Shower", "No Peace Offering", "No Light Saber");

		planets[5]=this.blackHole;

		return blackHole;

	}
	
	/**
	 * Create the planet iathilles.
	 * 
	 * @return LocationDescription for iathilles
	 */
	public LocationDescription createIathilles(){
		iathilles = new LocationDescription("Iathilles(I)", "No Alien", "No Resources", "No Gravity Bomb", "No Wormhole Key", "No Asteroid Shower", "No Peace Offering", "No Light Saber");
		planets[9]=this.iathilles;

		return iathilles;

	}
	
	/**
	 * Create the planet krypton.
	 * 
	 * @return LocationDescription for krypton
	 */
	public LocationDescription createKrypton(){
		krypton = new LocationDescription("Krypton(J)", "No Alien", "No Resources", "No Gravity Bomb", "No Wormhole Key", "No Asteroid Shower", "No Peace Offering", "No Light Saber");

		planets[10]=this.krypton;

		return krypton;

	}
	
	/**
	 * Create the planet middle earth.
	 * 
	 * @return LocationDescription for middle earth
	 */
	public LocationDescription createMiddleEarth(){
		String type ="";
		String give="";
		String asteroid="";
		int resources = random.nextInt(250);
		int alienType = random.nextInt(100);
		if(alienType<=50){
			type = "Good Alien";
			int giveWhat = random.nextInt(100);
			if(giveWhat<=25){
				give="Gravity Bomb";
			}
			else if(giveWhat<=50){
				give = "Peace Offering";
			}
			else{
				resources = random.nextInt(250)+resources;
			}
			int yoda = random.nextInt(100);
			if(yoda<=25){
				type ="Yoda";
				int yodaGive = random.nextInt(100);
				if(yodaGive<=25){
					give = "Light Saber";
				}
				else{
					give = "clue";
				}
			}
		}
		else{
			type = "Bad Alien";
		}
		int asteroidChance = random.nextInt(100);
		if(asteroidChance<=25){
			asteroid = "Asteroid";
		}
		else{
			asteroid = "No Asteroid";
		}
		//bad alien
		if(type.equals("Bad Alien")){
			middleEarth = new LocationDescription("Middle Earth(M)", type, resources+"", "No Gravity Bomb", "Wormhole Key", asteroid, "No Peace Offering", "Riddle");
		}
		
		//good alien
		else if(type.equals("Good Alien")){
			if(give.equals("Gravity Bomb")){
				middleEarth = new LocationDescription("Middle Earth(M)", type, resources+"", give, "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
			}
			else if(give.equals("Peace Offering")){
				middleEarth = new LocationDescription("Middle Earth(M)", type, resources+"", "No Gravity Bomb", "Wormhole Key", asteroid, give, "No Light Saber");
			}
			else{
				middleEarth = new LocationDescription("Middle Earth(M)", type, resources+"", "No Gravity Bomb", "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
			}
		}
		else{
			if(give.equals("Light Saber")){
				middleEarth = new LocationDescription("Middle Earth(M)", type, resources+"", "No Gravity Bomb", "Wormhole Key", asteroid, "No Peace Offering", give);
			}
			else{
				middleEarth = new LocationDescription("Middle Earth(M)", type, resources+"", "No Gravity Bomb", "Wormhole Key", asteroid, "No Peace Offering", give);
			}
		}

		planets[11]=this.middleEarth;

		return middleEarth;
	}
	
	/**
	 * Create the planet Gallifrey.
	 * 
	 * @return LocationDescription for gallifrey
	 */
	public LocationDescription createGallifrey(){
		int resources = random.nextInt(250);
		gallifrey = new LocationDescription("Gallifrey(G)","No Alien", resources+"", "No Gravity Bomb", "No Wormhole Key", "Asteroid Shower", "Peace Offering","No Light Saber");

		planets[7]=this.gallifrey;

		return gallifrey;

	}
	
	/**
	 * Create the planet Hyrule.
	 * 
	 * @return LocationDescription for hyrule.
	 */
	public LocationDescription createHyrule(){
		int resources = random.nextInt(250);
		int asteroidChance = random.nextInt(100);
		String asteroid = "";
		if(asteroidChance<=25){
			asteroid = "Asteroid";
		}
		else{
			asteroid = "No Asteroid";
		}
		hyrule = new LocationDescription("Hyrule(H)","No Alien", resources+"", "Gravity Bomb", "No Wormhole Key", asteroid, "Peace Offering","No Light Saber");
		planets[8]=this.hyrule;
		return hyrule;

	}
	
	/**
	 * Create the planet Pluto.
	 * @return LocationDescription for pluto
	 */
	public LocationDescription createPluto(){
		int resources = random.nextInt(250);
		int asteroidChance = random.nextInt(100);
		int bomb = random.nextInt(100);
		String gBomb = "";
		if(bomb<=50){
			gBomb = "Gravity Bomb";
		}
		else{
			gBomb = "No Gravity Bomb";
		}
		String asteroid = "";
		if(asteroidChance<=25){
			asteroid = "Asteroid";
		}
		else{
			asteroid = "No Asteroid";
		}
		pluto = new LocationDescription("Pluto(B)","No Alien", resources+"", gBomb, "No Wormhole Key", asteroid, "No Peace Offering","No Light Saber");

		planets[1]= this.pluto;

		return pluto;

	}
	
	/**
	 * Create the wormhole.
	 * @return LocationDescription for the wormhole
	 */
	public LocationDescription createWormHole(){
		wormhole = new LocationDescription("Wormhole(L)", "No Alien", "No Resources", "No Gravity Bomb", "No Wormhole Key", "No Asteroid Shower", "No Peace Offering", "No Light Saber");

		planets[12]=this.wormhole;

		return wormhole;

	}
	
	/**
	 * Create the planet Dagobah.
	 * @return LocationDescription for Dagobah.
	 */
	public LocationDescription createDagobah(){
		int resources = random.nextInt(250);
		dagobah = new LocationDescription("Dagobah(D)", "No Alien", resources+"", "Gravity Bomb", "No Wormhole Key", "Asteroid Shower", "No Peace Offering", "No Light Saber");
		planets[3]= this.dagobah;
		return dagobah;
	}
	
	/**
	 * Create the planet cybertron.
	 * 
	 * @return LocationDescription for cybertron
	 */
	public LocationDescription createCybertron(){
		String type ="";
		String give="";
		String asteroid="";
		String gBomb = "";
		int bomb = random.nextInt(100);
		int alienType = random.nextInt(100);
		int resources = random.nextInt(250);
		int asteroidChance = random.nextInt(100);
		if(bomb<=50){
			gBomb = "Gravity Bomb";
		}
		else{
			gBomb = "No Gravity Bomb";
		}
		
		
		if(alienType<=50){
			type = "Good Alien";
			int giveWhat = random.nextInt(100);
			if(giveWhat<=25){
				give="Gravity Bomb";
			}
			else if(giveWhat<=50){
				give = "Peace Offering";
			}
			else{
				resources = random.nextInt(250)+resources;
			}
			int yoda = random.nextInt(100);
			if(yoda<=25){
				type ="Yoda";
				int yodaGive = random.nextInt(100);
				if(yodaGive<=25){
					give = "Light Saber";
				}
				else{
					give = "clue";
				}
			}
		}
		else{
			type = "Bad Alien";
		}
		
		if(asteroidChance<=25){
			asteroid = "Asteroid";
		}
		else{
			asteroid = "No Asteroid";
		}
		if(type.equals("Bad Alien")){
			cybertron = new LocationDescription("Cybertron(C)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", "Riddle");
		}
		else if(type.equals("Good Alien")){
			if(give.equals("Gravity Bomb")){
				cybertron = new LocationDescription("Cybertron(C)", type, resources+"", give, "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
			}
			else if(give.equals("Peace Offering")){
				cybertron = new LocationDescription("Cybertron(C)", type, resources+"", gBomb, "Wormhole Key", asteroid, give, "No Light Saber");
			}
			else{
				cybertron = new LocationDescription("Cybertron(C)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
			}
		}
		else{
			if(give.equals("Light Saber")){
				cybertron = new LocationDescription("Cybertron(C)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", give);
			}
			else{
				cybertron = new LocationDescription("Cybertron(C)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", give);
			}
		}

		planets[2]= this.cybertron;

		return cybertron;

	}
	
	/**
	 * Create the planet eternia.
	 * @return LocationDescription for eternia
	 */
	public LocationDescription createEternia(){
		String type ="";
		String give="";
		String asteroid="";
		int bomb = random.nextInt(100);
		String gBomb = "";
		if(bomb<=50){
			gBomb = "Gravity Bomb";
		}
		else{
			gBomb = "No Gravity Bomb";
		}
		int resources = random.nextInt(250);
		int alienType = random.nextInt(100);
		if(alienType<=50){
			type = "Good Alien";
			int giveWhat = random.nextInt(100);
			if(giveWhat<=25){
				give="Gravity Bomb";
			}
			else if(giveWhat<=50){
				give = "Peace Offering";
			}
			else{
				resources = random.nextInt(250)+resources;
			}
			int yoda = random.nextInt(100);
			if(yoda<=25){
				type ="Yoda";
				int yodaGive = random.nextInt(100);
				if(yodaGive<=25){
					give = "Light Saber";
				}
				else{
					give = "clue";
				}
			}
		}
		else{
			type = "Bad Alien";
		}
		int asteroidChance = random.nextInt(100);
		if(asteroidChance<=25){
			asteroid = "Asteroid";
		}
		else{
			asteroid = "No Asteroid";
		}
		if(type.equals("Bad Alien")){
			eternia = new LocationDescription("Eternia(E)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", "Riddle");
		}
		else if(type.equals("Good Alien")){
			if(give.equals("Gravity Bomb")){
				eternia = new LocationDescription("Eternia(E)", type, resources+"", give, "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
			}
			else if(give.equals("Peace Offering")){
				eternia = new LocationDescription("Eternia(E)", type, resources+"", gBomb, "Wormhole Key", asteroid, give, "No Light Saber");
			}
			else{
				eternia = new LocationDescription("Eternia(E)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
			}
		}
		else{
			if(give.equals("Light Saber")){
				eternia = new LocationDescription("Eternia(E)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", give);
			}
			else{
				eternia = new LocationDescription("Eternia(E)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", give);
			}
		}

		planets[4]=this.eternia;

		return eternia;

	}

	/**
	 * Create planet forgottenRealm.
	 * @return LocationDescription for forgottenrealm
	 */
	public LocationDescription createForgottenRealm(){
		String type ="";
		String give="";
		String asteroid="";
		int bomb = random.nextInt(100);
		String gBomb = "";
		if(bomb<=50){
			gBomb = "Gravity Bomb";
		}
		else{
			gBomb = "No Gravity Bomb";
		}
		int resources = random.nextInt(250);
		int alienType = random.nextInt(100);
		if(alienType<=50){
			type = "Good Alien";
			int giveWhat = random.nextInt(100);
			if(giveWhat<=25){
				give="Gravity Bomb";
			}
			else if(giveWhat<=50){
				give = "Peace Offering";
			}
			else{
				resources = random.nextInt(250)+resources;
			}
			int yoda = random.nextInt(100);
			if(yoda<=25){
				type ="Yoda";
				int yodaGive = random.nextInt(100);
				if(yodaGive<=25){
					give = "Light Saber";
				}
				else{
					give = "clue";
				}
			}
		}
		else{
			type = "Bad Alien";
		}
		int asteroidChance = random.nextInt(100);
		if(asteroidChance<=25){
			asteroid = "Asteroid";
		}
		else{
			asteroid = "No Asteroid";
		}
		if(type.equals("Bad Alien")){
			forgottenRealm = new LocationDescription("Forgotten Realm(F)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", "Riddle");
		}
		else if(type.equals("Good Alien")){
			if(give.equals("Gravity Bomb")){
				forgottenRealm = new LocationDescription("Forgotten Realm(F)", type, resources+"", give, "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
			}
			else if(give.equals("Peace Offering")){
				forgottenRealm = new LocationDescription("Forgotten Realm(F)", type, resources+"", gBomb, "Wormhole Key", asteroid, give, "No Light Saber");
			}
			else{
				forgottenRealm = new LocationDescription("Forgotten Realm(F)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
			}
		}
		else{
			if(give.equals("Light Saber")){
				forgottenRealm = new LocationDescription("Forgotten Realm(F)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", give);
			}
			else{
				forgottenRealm = new LocationDescription("Forgotten Realm(F)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", give);
			}
		}

		planets[6]=this.forgottenRealm;

		return forgottenRealm;

	}
	/**
	 * Select a planet and return its LocationDescription
	 * @param planetName
	 * @return LocationDescription for given planet
	 */
	public LocationDescription getPlanet(String planetName){
		for(LocationDescription planet:planets){
			
			if (planet.getPlanetName().equals(planetName)){
				return planet;
			}
		}
		return null;
	}
	
	/**
	 * Write all LocationDescription of planets into a file
	 * @param fileName
	 * @return File
	 * @throws FileNotFoundException
	 */
	public File writeFile(String fileName) throws FileNotFoundException{
		File file = new File(fileName);
		writer = new PrintWriter(file);
		for(LocationDescription planet:planets){
			writer.write(planet.toString());
		}
		writer.close();
		return file;
	}
	
	/**
	 * Start the game.
	 */
	public void begin(){
		this.createBlackHole();
		this.createCybertron();
		this.createDagobah();
		this.createEarth();
		this.createEternia();
		this.createForgottenRealm();
		this.createGallifrey();
		this.createHyrule();
		this.createIathilles();
		this.createKrypton();
		this.createMiddleEarth();
		this.createPluto();
		this.createWormHole();
	}
}

