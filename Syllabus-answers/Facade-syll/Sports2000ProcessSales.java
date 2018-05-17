package pkgFacade.DecathlonExample;

import java.util.Scanner;//THis is used to facilitate user input from keyboard 

//This class is REQUIRED as per syllabus 
//It is the Sub-System of Italian Company "Sports2000" which DecathlonPOS currently has no implementation details about 
//For the sake of demonstration of the Facade Pattern as per syllabus, this code code needs to be written 
/* In real-world scenario, this class would be part of a sub-system whose APIs (method signatures) are known to you , exposed to you, 
 * but NOT the implementation details of the methods within the sub-system. 
*/
public class Sports2000ProcessSales {
	boolean giftCert; int numItems; float billAmount; 
	
	Sports2000ProcessSales(boolean paramgiftCert, int paramnumItems, float parambillAmount){ 
		giftCert = paramgiftCert; 
        numItems = paramnumItems; 
        billAmount = parambillAmount; 
	}
	
	void processSale() {
		//This method implements the logic as per the syllabus question 
		float giftCertValue, cashToPay; 
		Scanner scan; //Declares a scanner object to facilitate user input from keyboard 
		
		if(!giftCert) {
			System.out.println("You dont have a Gift Certificate");
		    System.out.println("Therefore pay Rs."+billAmount); 
		}//end of major if 
		
		else { 
			System.out.println("What is the value of your Gift Certificate?"); 
			scan = new Scanner(System.in); 
			giftCertValue = scan.nextFloat(); 
			
			if(numItems > 1) { 
				System.out.println("You can purchase only ONE item with the Gift Certificate worth Rs." +giftCertValue );
			    System.out.println("You have bought "+ numItems+".Gift Voucher NOT Applicable!"); 
			    System.out.println("Either choose the item to avail voucher or avail it next time and currently pay full Bill Amount Rs."+billAmount+" as per policy"); 
			}
			else if(numItems <=0) 
				System.out.println("You have bought "+numItems+" items.You need to purchase items to avail Gift Voucher. Sorry! No Cash exchange for voucher! "); 
			
			else if(giftCertValue < billAmount) {
				cashToPay =  billAmount - giftCertValue; 
				System.out.println("Your Bill Amount is Rs."+billAmount+" Gift Certificate is worth Rs."+giftCertValue); 
				System.out.println("You need to pay Rs."+cashToPay); 
			}
			else if(giftCertValue > billAmount){ 
				System.out.println("You need not pay anything for your Bill Amount of Rs."+billAmount); 
				cashToPay =  giftCertValue - billAmount; 
				System.out.println("Sorry! No cash back as per store policy.You are wasting Rs."+cashToPay); 
				System.out.println("Only ONE item worth Rs."+giftCertValue+" or above allowed"); 
			}	
			
				
		} //end of major else 
		
	}//end of method processSale 


}//end of class Sports2000ProcessSales 
