package pkgAbstractFactory;

import java.util.ArrayList;

//This is the "INGREDIENTS" class 
//Here the "Ingredient" is "Bungee Jumping" for the PRODUCT. In this case Product is 'OutdoorSportsEquipment'
//All "Ingredients" implements an "Ingredient" interface. Here it is 'OutdoorAdventureSports'

public class BungeeJumpingDisabled implements OutdoorAdventureSports {
	String SportsName =  "Bungee Jumping for Disabled Brave Sports Enthusiasts....";
	ArrayList<String> bungeeEquipments = new ArrayList(); 
	
	BungeeJumpingDisabled(){
		
		bungeeEquipments.add("bungee cord"); bungeeEquipments.add("wheel-chair");
		bungeeEquipments.add("full-body harness"); bungeeEquipments.add("ankle harness"); 

	}

   public String  getSportsName() {return SportsName;}  

    public void displayAdvSportsEquipments() { 
    	
    	System.out.println("Bungee-Jumping for Disabled Sports Eqipments are"); 
    	System.out.println(bungeeEquipments); 
    }

	
}//end of class BungeeJumpingDisabled