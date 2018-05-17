package pkgFacade.DecathlonExample;

/* This is the Client to the Facade Pattern called "Sports2000SubSystemFacade" 
 * 
 */

public class DecathlonSports2000FacadeClient {

	public static void main(String[] args) {
		
		float billAmount = (float) 10240.50; //This is the total Bill Amnount 
		DecathlonSports2000Facade oFacade1 = new DecathlonSports2000Facade(true, billAmount); 
		
		oFacade1.calculateAmountToPay();
		oFacade1.displayItemsPurchased(); 
		
		/* Uncomment this to see the execution when Gift Certificate Does not exist 
		 * 
		 */
		//Sports2000SubSystemFacade oFacade2 = new Sports2000SubSystemFacade(false, (float) 10240.50); 
		
		//oFacade2.calculateAmountToPay();
		//oFacade2.displayItemsPurchased();
	}

}
