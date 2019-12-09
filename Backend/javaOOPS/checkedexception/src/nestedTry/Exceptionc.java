package nestedTry;

public class Exceptionc {

	public static void main(String[] args) {
		System.out.println("Main started...");
		Employee e1=new Employee();
		try {
			Object o1=e1.clone();
			System.out.println("object cloned");
		 
		try {
			Class c1=Class.forName("nestedTry.Employee");
			System.out.println("Class found");
		} catch (ClassNotFoundException e) {
			
			System.out.println("class not found");
		}
		}catch (CloneNotSupportedException e2) {
			System.out.println("object not cloned");
		}
		System.out.println("main ended...");
		

	}

}
