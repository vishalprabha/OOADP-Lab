package Strategy;

public class StrategyClientMain {

	public static void main(String[] args) {
		
		double mrptotal = 8000.50; 
		//The Regular Customer is tied to 'DiscountType1' always 
		//'DiscountType1' can vary independently from the client which uses it - Regular Customer 
		
		RegCustomer oRC = new RegCustomer(); 
		oRC.calculateDiscount(mrptotal);	
		oRC.display();
		
		//The FirstTimeCustomer is tied to 'DiscountType2' always 
		//'DiscountType2' can vary independently from the client which uses it - FirstTimeCustomer 
				
		FirstTimeCustomer oFTC = new FirstTimeCustomer(); 
		oFTC.calculateDiscount(mrptotal);	
		oFTC.display(); 
	}

}
