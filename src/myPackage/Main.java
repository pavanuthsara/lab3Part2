package myPackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p = new Pet("Lissie", "Smith", 3);
		p.showDetails();
		
		Cat c = new Cat("Kyan", "Silva", 4, 4);
		c.showDetails();
		
		Pet p2 = new Pet("Bruno", "Pavan");
		p2.showDetails();
		
		Cat c2 = new Cat("Sambolaya", "Kalani");
		c2.showDetails();
		
		Dog d1 = new Dog("Hill", "Kumari");
		d1.showDetails();
		
		Dog d2 = new Dog("Max", "Kamal", 5, 2);
		d2.showDetails();
	}
}// end of demo class
