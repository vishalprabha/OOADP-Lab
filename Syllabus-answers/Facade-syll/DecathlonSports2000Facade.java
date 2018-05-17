package pkgFacade.DecathlonExample;
import java.util.Scanner; //THis is used to facilitate user input from keyboard 

/* This is the FACADE Pattern 
 * It does not know the details of the implementation of the objects it composes namely "Sports2000ItemsPurchased" and "Sports2000ProcessSales" 
 * 
 */
public class DecathlonSports2000Facade {
	
	Sports2000ItemsPurchased oItempurchased; 
	Sports2000ProcessSales oProcesssales; 
	
	DecathlonSports2000Facade(boolean paramgiftCert, float parambillAmount){ 
		oItempurchased = new Sports2000ItemsPurchased(); 
		//This method returns the number of items purchased
		//This is an important parameter to calculate because the Business Rule says that Gift Voucher can be applied to only ONE item can be purchased. 
		
		int paramnumItems = oItempurchased.getNumItemTypes(); 
		
		System.out.println("Number of Items Purchased is "+paramnumItems); 
		System.out.println("Gift Certificate exists "+paramgiftCert); 
		oProcesssales = new Sports2000ProcessSales(paramgiftCert, paramnumItems, parambillAmount); 
	}
	
	// This is the wrapper method of the facade to display the details of items purchased 
	void displayItemsPurchased() { 
		oItempurchased.getItemsPurchased(); 
	}
		
	// This is the wrapper method of the facade to calculate the amount to be paid 
	void calculateAmountToPay() { 
		oProcesssales.processSale(); //How "processSale()" is implemented is unknown to this Facade 
	}
}//end of class Sports2000SubSystem
