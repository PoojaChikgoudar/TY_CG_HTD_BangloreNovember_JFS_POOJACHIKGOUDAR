
public class InstanceIB {
	
		final int MAXIMUM;
		 InstanceIB()){
			System.out.println("Constructor is executed");
			
		}
		 InstanceIB(int v1){
			System.out.println("Constructor overloaded");
		}
		{
			System.out.println("Instance block is executed");
			this.MAXIMUM=3000;
		}
		

	}
}
