package interfaceconcept;

public class Robot implements Moment,Sound {
	public void move() {
		System.out.println("Moving");
	}
	public void talk() {
		System.out.println("talking");
	}

}
