
public class TestVehicle {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle("Benz");
		Object o1=v1.clone();
		Vehicle v2=(Vehicle)o1;
		System.out.println(v2.name);

	}

}
