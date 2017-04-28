import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class PlanetsDescription {
	private LocationDescription earth, pluto, cybertron, dagobah, eternia, wormhole, forgottenRealm, blackHole, gallifrey, hyrule, middleEarth, iathilles, krypton;
	private Random random;
	private LocationDescription[] planets;
	private PrintWriter writer;
	
	public PlanetsDescription(){
		planets = new LocationDescription[13];
		random = new Random();
		
	}
	
	public void createEarth(){
		int resources = random.nextInt(250);
		String amount = resources+"";
		earth = new LocationDescription("Earth(A)","No Alien", amount, "No Gravity Bomb", "No Wormhole Key", "No Asteroid Shower", "No Peace Offering","No Light Saber");
		planets[0]=this.earth;
	}
	
	public void createBlackHole(){
		blackHole = new LocationDescription("BlackHole(K)", "No Alien", "No Resources", "No Gravity Bomb", "No Wormhole Key", "No Asteroid Shower", "No Peace Offering", "No Light Saber");
		planets[5]=this.blackHole;
	}
	
	public void createIathilles(){
		iathilles = new LocationDescription("Iathilles(I)", "No Alien", "No Resources", "No Gravity Bomb", "No Wormhole Key", "No Asteroid Shower", "No Peace Offering", "No Light Saber");
		planets[9]=this.iathilles;
	}
	
	public void createKrypton(){
		krypton = new LocationDescription("Krypton(K)", "No Alien", "No Resources", "No Gravity Bomb", "No Wormhole Key", "No Asteroid Shower", "No Peace Offering", "No Light Saber");
		planets[10]=this.krypton;
	}
	
	public void createMiddleEarth(){
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
		if(type.equals("Bad Alien")){
			middleEarth = new LocationDescription("Middle Earth(M)", type, resources+"", "No Gravity Bomb", "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
		}
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
	}
	
	public void createGallifrey(){
		int resources = random.nextInt(250);
		gallifrey = new LocationDescription("Gallifrey(G)","No Alien", resources+"", "No Gravity Bomb", "No Wormhole Key", "Asteroid Shower", "Peace Offering","No Light Saber");
		planets[7]=this.gallifrey;
	}
	
	public void createHyrule(){
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
	}
	
	public void createPluto(){
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
	}
	
	public void createWormHole(){
		wormhole = new LocationDescription("Wormhole(L)", "No Alien", "No Resources", "No Gravity Bomb", "No Wormhole Key", "No Asteroid Shower", "No Peace Offering", "No Light Saber");
		planets[12]=this.wormhole;
	}
	
	public void createDagobah(){
		int resources = random.nextInt(250);
		dagobah = new LocationDescription("Dagobah(D)", "No Alien", resources+"", "Gravity Bomb", "No Wormhole Key", "Asteroid Shower", "No Peace Offering", "No Light Saber");
		planets[3]= this.dagobah;
	}
	
	public void createCybertron(){
		int resources = random.nextInt(250);
		int alienType = random.nextInt(100);
		int asteroidChance = random.nextInt(100);
		String type ="";
		String give="";
		String asteroid="";
		String gBomb = "";
		int bomb = random.nextInt(100);
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
			cybertron = new LocationDescription("Cybertron(C)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
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
	}
	
	public void createEternia(){
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
			eternia = new LocationDescription("Eternia(E)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
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
	}

	public void createForgottenRealm(){
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
			forgottenRealm = new LocationDescription("Forgotten Realm(F)", type, resources+"", gBomb, "Wormhole Key", asteroid, "No Peace Offering", "No Light Saber");
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
	}
	public LocationDescription getPlanet(String planetName){
		for(LocationDescription planet:planets){
			
			if (planet.getPlanetName().equals(planetName)){
				return planet;
			}
		}
		return null;
	}
	
	public File writeFile(String fileName) throws FileNotFoundException{
		File file = new File(fileName);
		writer = new PrintWriter(file);
		for(LocationDescription planet:planets){
			System.out.println(planet.toString()+1);
			writer.write(planet.toString());
		}
		writer.close();
		return file;
	}
	
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

