import java.util.*;

abstract class address {
	String housename,city,street,state;
	public abstract String getcountry();

	public void inputdata() {
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE HOUSENAME:\t");
		housename = in.nextLine();
		System.out.println("ENTER THE CITY:\t");
		city = in.nextLine();
		System.out.println("ENTER THE STREET:\t");
		street = in.nextLine();
		System.out.println("ËNTER THE STATE:\t");
		state = in.nextLine();
	}
		public void display() {
		System.out.println("\n\tTHE DETAILS ARE..");
		System.out.println(housename+"\n"+street+"\n"+city+"\n"+state);
	 }
}

class InAddress extends address {
	String coun="IND";
	InAddress() {
		super.inputdata();
		super.display();
		printAddr();
	}

	public String getcountry() {
		return coun;
	}

	public void printAddr() {
		System.out.println(coun);
	}
}

class UsAddress extends address {
	String coun="USA";
	UsAddress() {
		super.inputdata();
		super.display();
		printAddr();
	}

	public String getcountry() {
		return coun;
	}

	public void printAddr(){
		System.out.println(coun);
	}
}

abstract class phoneno {
	long pnum;
	public abstract int getlen();
	public void getnum() {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE PHONENUM:\t");
		pnum=in.nextLong();
	}

	public void displaynum(){
		System.out.println("\n\tTHE PHONENUMBER IS..");
		System.out.println(pnum);
	}
}

class InPhone extends phoneno {
	int len=10;
	public int getlen() {
		return len;
	}
		InPhone(){
			super.getnum();
			super.displaynum();
		}
}

class USPhone extends phoneno {
	int len=10;
	public int getlen(){
		return len;
	}
	USPhone(){
		super.getnum();
		super.displaynum();
	}
}

interface contactFactory {
	public address createAddr();
	public phoneno createphno();
}

class IncontactFactory implements contactFactory{
		public address createAddr(){ return new InAddress();}

		public phoneno createphno(){ return new InPhone();}
}

class UScontactFactory implements contactFactory {
	public address createAddr() {
		return new UsAddress();
	}

	public phoneno createphno(){
		return new USPhone();
	}
}

public class testAbstract {
	public static void main(String args[]) {
		UScontactFactory nameusa = new UScontactFactory();
		IncontactFactory nameind = new IncontactFactory();
		System.out.println("ENTER THE AMERICAN ADDRESS AND PHONE NUMBER:\t");
		nameusa.createAddr();
		nameusa.createphno();
		System.out.println("ENTER THE INDIAN ADDRESS AND PHONE NUMBER:\t");
		nameind.createAddr();
		nameind.createphno();
	}
}