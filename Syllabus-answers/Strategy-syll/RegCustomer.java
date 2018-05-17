package Strategy;

class RegCustomer extends DecathlonCustomer {

// Here the Regular Customer is always tied to 	DiscountType1 	
// The logic of DiscountType1 can vary, but the Regular Customer is always "tied" to it 
	
	RegCustomer() {
		super();
		iCC = new DiscountType1(); 
		
	} 
	
	public void display() { 
		
		System.out.println("\nHello Regular Customer! Welcome Back..."); 
		super.display(); 
	}

}
