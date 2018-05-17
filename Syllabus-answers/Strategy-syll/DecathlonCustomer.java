package Strategy;

//This is the DOMAIN Class 
//It is the Parent of the inheritance hierarchy consisting of "Regular Customers", "First Time Customers", "Senior Citizen Customers" etc 
//It sets the logic for passing the correct context. In this case, the correct Discount Type object. 

abstract class DecathlonCustomer {
	
	static String name; 
	static int age;
	
	iDiscountCalculator iCC; 
	
	DecathlonCustomer(){}
	
	
	public void calculateDiscount(double mrptotal) { 
		iCC.calculateBillAmount(mrptotal); 
	}
	
	public void display() { 
		System.out.println("Name is "+ name + " \nAge is " + age); 
	}

}

