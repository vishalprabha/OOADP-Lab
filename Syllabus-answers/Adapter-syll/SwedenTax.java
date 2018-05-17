
public class SwedenTax implements CalcTax {
	//NewMauritiusTax mt = new NewMauritiusTax();
	double tax_amount=0.0;
	@Override
	public double taxAmount(String item, int qty, double price) {
		// TODO Auto-generated method stub
		
		tax_amount = price*qty*0.05f;
		return tax_amount;
	}

}