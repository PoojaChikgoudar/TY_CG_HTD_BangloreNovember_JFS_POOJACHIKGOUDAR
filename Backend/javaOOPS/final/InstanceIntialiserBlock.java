
public class InstanceIntialiserBlock {
	final int MAXIMUM;
	static final Double PI;
	InstanceIntialiserBlock(){
		System.out.println("Constructor is executed");
		
	}
	InstanceIntialiserBlock(int v1){
		System.out.println("Constructor overloaded");
	}
	{
		System.out.println("Instance block is executed");
		this.MAXIMUM=3000;
	}
	static {
		System.out.println("static intialiser block");
		PI=3.14;
	}

}
