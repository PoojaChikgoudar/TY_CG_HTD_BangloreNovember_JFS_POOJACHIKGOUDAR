package NestedHandlingException;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started..");
		ExceptionA e1=new ExceptionA();
		e1.exception(2,null);
		e1.exception(0,"Pooja" );
		System.out.println("main ended...");

	}

}
