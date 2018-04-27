package pkgObserverLab5;

import java.util.ArrayList;

public class AsiaFestivalSale implements DecathlonSubject {

	AsiaDiscountDecathlon mydiscount; 
	ArrayList<DecathlonObserver> myObservers; 
	
	public AsiaFestivalSale(int i, String fes, String start, String end) {
		
		mydiscount = new AsiaDiscountDecathlon(); 
		mydiscount.setAsiaDiscountDecathlon(i, fes, start, end);
		myObservers = new ArrayList<DecathlonObserver>(); 
	}//end constructor of AsiaFestivalSale


	public void attach(DecathlonObserver ob) {
		
		myObservers.add(ob); 
	}//end attach

	
	public void notifyObservers() {
		
		for(int i = 0; i<myObservers.size(); i++) { 
		
			DecathlonObserver decOb = (DecathlonObserver)myObservers.get(i); 
			decOb.update(mydiscount); 
			
		}//end for 
			
	}//end notifyObsrvers


	public void changeDiscountRate(int changedDis, String fes, String start, String end) {
		
		this.mydiscount.setAsiaDiscountDecathlon(changedDis, fes, start, end);
		this.notifyObservers();
		
	}


	

}
