package pkgFacade.DecathlonExample;
import java.util.Scanner;//THis is used to facilitate user input from keyboard 

//These imports are required for the Collection Object "HashMap" 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//This class is OPTIONAL to demonstrate the FACADE pattern as per syllabus 
//It is used to display the details of items purchased using a HashMap Collection object 

public class Sports2000ItemsPurchased {
	HashMap<String, Integer> hmItems; //Creates a name-value pair HashMap of Item Name and Number of Items purchased 
	Set<Map.Entry<String, Integer>> myset; //required to traverse the HashMap 
	Scanner scan; //Declares a scanner object to facilitate user input from keyboard 
	int itemTypes; 
	String iname; Integer iqty; //Used to enter into the HashMap the name-value pair of ItemName-Number of Items(qty) Purchased 
	
	
	  Sports2000ItemsPurchased(){ //Constructor 
		  //The following three statements are needed to create and later traverse a HashMap (Name-Value Pair) 
		  hmItems = new HashMap<String, Integer>();  
		  myset = hmItems.entrySet(); 
			Iterator itr= myset.iterator(); //required to iterate / traverse through a HashMap. 
			
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
		  for(Map.Entry<String, Integer> me : myset) { 
				System.out.print(me.getKey() + " : "); 
				System.out.print(me.getValue()+"\n"); 
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
				hmItems.put(iname, iqty);	//This method stores the name-value pair entered into the HashMap	
			} //end of for-loop 		
			
	  }//end of storeItemsPurchaseDetails method 
	  
}//end of class Sports2000ItemsPurchased
