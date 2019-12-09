
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(22,"Pooja");
		//System.out.println(e1.hashCode());
		Employee e2=new Employee(22,"Megha");
		//System.out.println(e2.hashCode());
		//System.out.println(e2);
		Object o1=new Object();
		System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
	}

}
