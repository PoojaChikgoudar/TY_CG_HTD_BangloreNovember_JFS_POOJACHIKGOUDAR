
public class Car extends Vehicle {
	int cost=30000;
	
	void details() {
		int cost=20000;
		System.out.println("local variable is "+cost);
		System.out.println("global variable is "+this.cost);
		System.out.println("superclass variable is "+ super.cost);
	}

}
