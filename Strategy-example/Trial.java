mport java.util.*;

class Contact {
	String name,company;
	
	public void setContact(String n,String c){
		name = n;
		company = c;
	}
	
    public String toString() {
        return ("(" + name + ", " + company + ")");
    }
	
}


class ContactList {
	SummerizeStrategy s;
	public ContactList(SummerizeStrategy s){
		this.s = s;
	}
	public void doSummerize(List<Contact> a){
		s.summarize(a);
	}
}


interface SummerizeStrategy {
	public void summarize(List<Contact> a);
}

class SummarizeName implements SummerizeStrategy{

	@Override
	public void summarize(List<Contact> a) {
		// TODO Auto-generated method stub
		System.out.println("Summerise by name");
		Collections.sort(a, new Comparator<Contact>(){
			public int compare(Contact o1, Contact o2){
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println(Arrays.asList(a));
	}

}


class SummerizeOrganization implements SummerizeStrategy {

	@Override
	public void summarize(List<Contact> a) {
		// TODO Auto-generated method stub
		System.out.println("Summerize by organizastion");
		Collections.sort(a, new Comparator<Contact>(){
			public int compare(Contact o1, Contact o2){
				return o1.company.compareTo(o2.company);
			}
		});
		System.out.println(Arrays.asList(a));		
	}

}


public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Contact> c = new ArrayList<Contact>();
		Contact c1 = new Contact();
		c1.setContact("Niran","Google");
		Contact c2 = new Contact();
		c2.setContact("Zoro", "Apple");
		c.add(c1);
		c.add(c2);
		ContactList cl = new ContactList(new SummarizeName());
		cl.doSummerize(c);
		cl = new ContactList(new SummerizeOrganization());
		cl.doSummerize(c);
	}

}
