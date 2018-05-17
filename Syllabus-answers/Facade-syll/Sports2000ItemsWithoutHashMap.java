package pkgFacade.DecathlonExample;

import java.util.LinkedList;
import java.util.Scanner;//THis is used to facilitate user input from keyboard 

//These imports are required for the Collection Object "HashMap" 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//This class is OPTIONAL to demonstrate the FACADE pattern as per syllabus 
//It is used to display the details of items purchased using a HashMap Collection object 

class Items{ 
	
	String myItems; 
	int qty; 
	Items(String s, int q){ 
		myItems = s; qty = q; 
	}
	public String toString() { 
		return myItems + "\t" + qty; 
	}
}

public class Sports2000ItemsWithoutHashMap {
	
	Scanner scan; //Declares a scanner object to facilitate user input from keyboard 
	int itemTypes; 
	String iname; Integer iqty; //Used to enter into the HashMap the name-value pair of ItemName-Number of Items(qty) Purchased 
	LinkedList <Items> LLItems; 
	
	Sports2000ItemsWithoutHashMap(){ //Constructor 
		  //The following three statements are needed to create and later traverse a HashMap (Name-Value Pair) 
		  
		  LLItems = new LinkedList <Items>(); 
			scan = new Scanner(System.in); //creates the scanner object 
			
			//This method needs to be called inside the constructor, in order to get the value of number of items purchased. 
			storeItemsPurchaseDetails(); 
	  }//end of method Constructor
	  
	  int getNumItemTypes() { 
		  //This method is used to return the number of items purchased 
		//This is an important parameter to calculate because the Business Rule says that Gift Voucher can be applied to only ONE item can be purchased. 
		  return itemTypes; 
		  } 
	  
	  void getItemsPurchased() { 
		  //This method displayes the details of the items purchased from the HashMap as a Name-Value Pair 
		  System.out.println("Items you purchased are...."); 
		  
		  //This code is needed to traverse the HashMap and display its contents 
		  
		  for(Items I : LLItems) { 
				System.out.print(I+"\n"); 
			}
		  
		  
	  }//end of method "getItemsPurchased"
	  
	  void storeItemsPurchaseDetails() { 
		  
		  System.out.println("How many item types have you bought?"); 	
			itemTypes = scan.nextInt(); //This method of Scanner object is used to input integers 
			
			for(int i =0; i<itemTypes; i++) { 
				System.out.println("Enter the name of item#"+(i+1)); //Notice the bracket to calculate (i+1) 
				iname = scan.next(); //This method of Scanner object is used to input Strings 
				System.out.println("item#"+(i+1)+" How many did you buy?"); 
				iqty = scan.nextInt(); //This method of Scanner object is used to input integers
				
				LLItems.add(new Items(iname,iqty)); 
			} //end of for-loop 		
			
	  }//end of storeItemsPurchaseDetails method 
	  
}//end of class Sports2000ItemsPurchased