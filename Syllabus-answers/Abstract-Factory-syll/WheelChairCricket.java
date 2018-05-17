package pkgAbstractFactory;

import java.util.ArrayList;

public class WheelChairCricket implements OutdoorRegularSports {
	
	String SportsName =  "Wheel Chair Cricket for Disabled Brave Sports Enthusiasts....";
	ArrayList<String> wheelChairEquipments = new ArrayList(); 
	
		public void displayRegSportsEquipments() {
			System.out.println("Wheel Chair Cricket for Disabled Sports Eqipments are"); 
			System.out.println(wheelChairEquipments); 
	}
		public String  getSportsName() {return SportsName;}
		
		WheelChairCricket(){
			
			wheelChairEquipments.add("wheel-chair");
			wheelChairEquipments.add("Bat, Gloves,Helmet"); 
		}

}




  

