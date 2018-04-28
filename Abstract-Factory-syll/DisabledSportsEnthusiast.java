package pkgAbstractFactory;
//Sub-class of CREATOR(SportsEnthusiast) of the 'PRODUCT' in this case 'SportsEquipment' 

public class DisabledSportsEnthusiast extends SportsEnthusiast {
	
//Remember: The CREATOR will always have ABSTRACT-FACTORY as its member. 
//Here CREATOR(DisabledSportsEnthusiast) is tied to 'DisabledSportsType1' of the 'SportsTypeAbstractFactory' 
	
	SportsTypeAbstractFactory mySportsTypeAF1 = new DisabledSportsType1(); 
	SportsTypeAbstractFactory mySportsTypeAF2 = new DisabledSportsType2(); 
	
	//Factory Method that creates the product inside the creator 
		public SportsEquipment createSports(String s) {
			
			if(s.equals("Bungee-Cricket Disabled"))
			/* Remember: In ABSTRACT-FACTORY pattern when the CREATOR creates new PRODUCTS the INGREDIENTS of 
			 * the PRODUCT is passed as its parameter. 
			 * Here CREATOR(DisabledSportsEnthusiast) creates PRODUCT(OutdoorSportsEquipment) with the INGREDIENT(mySportsTypeAF) 
			 * an object of ABSTRACT-FACTORY(DisabledSportsType1)
			 */
			return new OutdoorSportsEquipment(mySportsTypeAF1);
			else if (s.equals("Para Gliding-Cricket Disabled"))
			return new OutdoorSportsEquipment(mySportsTypeAF2);	
			else 
			return null; 
		}


}
