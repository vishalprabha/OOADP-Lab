package pkgObserverLab5;

import pkgObserverClubMtg.Appointment;

public class AsiaCustomer implements DecathlonObserver {
	
	DecathlonSubject mySubject; 
	AsiaDiscountDecathlon mydiscount; 

	public AsiaCustomer(DecathlonSubject mySale) {
		
		this.mySubject = mySale; 
		mySubject.attach(this); 
		
	}

	
	public void update(AsiaDiscountDecathlon a) {
		mydiscount = a; 
		
	}
	
	public void display(){
		
		System.out.println("\nFestive Discount details");
		System.out.println("Festival : " + this.mydiscount.festival );
		System.out.println("Discount : " + this.mydiscount.discount);
		System.out.println("Start Month : " + this.mydiscount.startMonth);
		System.out.println("End Month : " + this.mydiscount.endMonth);
		

}

}
