

public class ObserverMainClientDecathlon {

	public static void main(String[] args) {
		
		AsiaFestivalSale mySale = new AsiaFestivalSale(22, "Diwali", "October", "November"); 
		
		AsiaCustomer indiaCust = new AsiaCustomer(mySale); 
		AsiaCustomer srilankaCust = new AsiaCustomer(mySale); 
		
		
		mySale.notifyObservers();
		System.out.println("Decathlon Discount for INDIAN Customers"); 
		indiaCust.display(); 
		System.out.println("\nDecathlon Discount for SRILANKAN Customers"); 
		srilankaCust.display(); 
		
		mySale.changeDiscountRate(25,"Dasherra", "August", "September"); 
		System.out.println("\nChanged Decathlon Discount for INDIAN Customers"); 
		indiaCust.display(); 
		System.out.println("\nChanged Decathlon Discount for SRILANKAN Customers"); 
		srilankaCust.display(); 
		
		
		
		
	}

}
