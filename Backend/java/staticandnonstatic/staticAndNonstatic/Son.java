package staticAndNonstatic;

public class Son extends Father {
	Son(){
		super("Sachhi",22);
		System.out.println("C");
		
	}
	Son(String name,int age){
		this();
		System.out.println("D");
		
	}

}


