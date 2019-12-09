package checkedException;

public class ExceptionB {

	public static void main(String[] args) {
	System.out.println("main started....");
		Student s1=new Student();
		try {
			Object s2=s1.clone();
			System.out.println("object cloned");
			Class c1=Class.forName("checkedException.Student");
			System.out.println("class found");
		} catch (CloneNotSupportedException e) {
	System.out.println("object not cloned");
		} catch (ClassNotFoundException e) {
		
			System.out.println("class not found");
		}
		System.out.println("main ended....");

	}

}
