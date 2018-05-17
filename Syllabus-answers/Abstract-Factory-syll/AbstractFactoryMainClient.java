package pkgAbstractFactory;

//This class is the Client of 'AbstractFactory' pattern 
public class AbstractFactoryMainClient {

	public static void main(String[] args) {
		
		//The client will create an object of the CREATOR of the PRODUCT 
		//In this case the CREATOR is 'DisabledSportsEnthusiast' 
		
		DisabledSportsEnthusiast SunilRamesh = new DisabledSportsEnthusiast(); 
		SportsEquipment mySports; //The PRODUCT is 'SportsEquipment' 
		
		//CREATOR will always call its Factory Method 
		//In this case 'createSports' is the Factory Method defined inside the CREATOR 'DisabledSportsEnthusiast'
		mySports = SunilRamesh.createSports("Bungee-Cricket Disabled"); 
		
		mySports.displayDetails();
		
		mySports = SunilRamesh.createSports("Para Gliding-Cricket Disabled"); 
		
		mySports.displayDetails();
		

	}

}
