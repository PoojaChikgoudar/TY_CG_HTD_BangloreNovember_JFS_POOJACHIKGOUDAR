package staticAndNonstatic;

public class Teststd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		Student s2=new Student("Pooja",22);
		System.out.println(s2.name);
		System.out.println(s2.age);
		

	}

}
