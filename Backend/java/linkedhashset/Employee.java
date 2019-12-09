
public class Employee {
	int empage;
	String empname;
	public Employee(int empage, String empname) {
		super();
		this.empage = empage;
		this.empname = empname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empage;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empage != other.empage)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [empage=" + empage + ", empname=" + empname + "]";
	}
	
	

}
