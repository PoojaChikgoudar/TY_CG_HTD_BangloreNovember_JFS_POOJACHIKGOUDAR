package encapsulation;

public class Testperson {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setAge(22);
		p1.setName("Pooja");
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		

	}

}
