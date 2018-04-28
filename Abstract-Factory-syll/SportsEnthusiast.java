package pkgAbstractFactory;

//CREATOR of the 'PRODUCT' in this case 'SportsEquipment' 

public abstract class SportsEnthusiast {
	
	//Factory Method that creates the product inside the creator 
	public abstract SportsEquipment createSports(String s); 

}
