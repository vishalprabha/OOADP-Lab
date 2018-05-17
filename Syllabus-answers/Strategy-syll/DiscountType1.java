package Strategy;

//This class is one of the concrete implementation of Strategy Pattern, a discount scheme Type1
//It implements the algorithm / logic of "calculateBillAmount" method in "iDiscountCalculator" 
//This class is concerned about the type of discount to be applied. In this case 22% discount on MRP. 

//Strategy lets the algorithm vary independently from the clients that use it. 
//Logic of this algorithm can vary, oblivious to the client that uses it 

class DiscountType1 implements iDiscountCalculator {

	double billamount; double discount; 
	
	DiscountType1(){
	discount = 0.22; //The discount rate to be applied for DiscountType1 
	}
	
	public void calculateBillAmount(double mrptotal) {
			
			billamount = mrptotal - discount * mrptotal;
			System.out.println("\nYour MRP Amount is "+ mrptotal);
			System.out.println("After discount, Your Bill Amount is "+ billamount);
	}
	
	
}
