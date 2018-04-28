package pkgAbstractFactory;

import java.util.ArrayList;

//This is the "INGREDIENTS" class 
//Here the "Ingredient" is "Bungee Jumping" for the PRODUCT. In this case Product is 'OutdoorSportsEquipment'
//All "Ingredients" implements an "Ingredient" interface. Here it is 'OutdoorAdventureSports'

public class ParaGlidingDisabled implements OutdoorAdventureSports {
	String SportsName =  "Para Gliding for Disabled Brave Sports Enthusiasts....";
	ArrayList<String> paraGlidingEquipments = new ArrayList(); 
	
	ParaGlidingDisabled(){
		
		paraGlidingEquipments.add("EMERGENCY RESERVE SYSTEM (PARACHUTE)"); paraGlidingEquipments.add("TWO - METER RADIO & RADIO HARNESS");
		paraGlidingEquipments.add("WHEEL_CHAIR PARAGLIDER"); paraGlidingEquipments.add("harness & safety helmet"); 

	}

   public String  getSportsName() {return SportsName;}  

    public void displayAdvSportsEquipments() { 
    	
    	System.out.println("Para Gliding for Disabled Sports Eqipments are"); 
    	System.out.println(paraGlidingEquipments); 
    }

	
}//end of class BungeeJumpingDisabled