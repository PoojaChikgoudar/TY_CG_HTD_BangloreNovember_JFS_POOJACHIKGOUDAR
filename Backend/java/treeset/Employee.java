
public class Employee implements Comparable<Employee> {
	int age;
	double salary;
	String ename;
	public Employee(int age, double salary, String ename) {
		super();
		this.age = age;
		this.salary = salary;
		this.ename = ename;
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.ename.compareTo(o.ename);
	}
	//@Override
	/*public int compareTo(Employee o) {
		if(this.salary>o.salary) {
			return 1;
		}
		else if(this.salary<o.salary) {
			return -1;
		}
		else {
			return 0;
		}
	}
	*/
	

}
