
public class TestInstanceIntialiserBlock {

	public static void main(String[] args) {
		
		InstanceIntialiserBlock i1=new InstanceIntialiserBlock();
		System.out.println(i1.MAXIMUM);
		System.out.println(InstanceIntialiserBlock.PI);
		
		System.out.println("--------------");
		
		
		InstanceIntialiserBlock i2=new InstanceIntialiserBlock(22);
		System.out.println(i2.MAXIMUM);
	}

}
