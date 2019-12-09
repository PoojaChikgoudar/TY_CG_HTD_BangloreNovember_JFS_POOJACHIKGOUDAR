
public class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public boolean equals(Object obj) {
		Employee e1=(Employee)obj;
		if(e1.id==this.id)
			if(e1.name.equals(this.name)) {
				return true;
			}else {
				return false;
			}
		else {
			return false;
		}
	}

}
