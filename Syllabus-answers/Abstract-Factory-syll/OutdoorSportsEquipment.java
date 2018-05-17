package pkgAbstractFactory;
//This is the sub-class of "PRODUCT" 
//It specializes in "OutdoorSportsEquipment" 

public class OutdoorSportsEquipment extends SportsEquipment {
	
	/*All "Products" will have a reference to the Abstract-Factory. 
	 * Here it is 'SportsTypeAbstractFactory' 
	 */

	SportsTypeAbstractFactory mySportsAF; 
	
	/*All "Products" will have a reference to its "Ingredients" in the Abstract-Factory Pattern. 
	 * Here it is 'OutdoorAdventureSports' 
	 */
	
	OutdoorAdventureSports myoutdoorSports; 
	OutdoorRegularSports myoutregsports; 
	
	void displayDetails() {
		myoutdoorSports = mySportsAF.createAdventureSports(); 
		System.out.println("\nOutdoor Adventure Sports Equipment are"); 
		myoutdoorSports.displayAdvSportsEquipments(); 
		myoutregsports = mySportsAF.createOutdoorRegularSports();
		System.out.println("\nOutdoor Regular Sports Equipment are"); 
		myoutregsports.displayRegSportsEquipments();
		
	}
	
	OutdoorSportsEquipment(SportsTypeAbstractFactory mySportsAF){ 
		
		this.mySportsAF = mySportsAF; 
		
	}

}
