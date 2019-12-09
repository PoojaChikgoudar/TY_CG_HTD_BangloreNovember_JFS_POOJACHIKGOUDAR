import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAge a1=new EmployeeAge();
		EmployeeSal a2=new EmployeeSal();
		Ename a3=new Ename();
		TreeSet<Employee> t1=new TreeSet<Employee>(a3);
		t1.add(new Employee(22,40444,"Pooja"));
		t1.add(new Employee(23,30444,"Megha"));
		t1.add(new Employee(24,20444,"Shashank"));
		
		for(Employee e1:t1) {
			System.out.println("enmae is "+e1.ename);
			System.out.println("salary is "+e1.salary);
			System.out.println("age is "+e1.age);

		}



	}

}
