
public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();
		//int res1=c1.add(2);
		//System.out.println(res1);
		int res1=Calculator.add(2);
		System.out.println(res1);
		
		int res2=c1.add(2,4);
		System.out.println(res2);
		
		double res3=c1.add(20.3);
		System.out.println(res3);
		
		Calculator.multiply(20);
		Calculator.multiply(20,40);
		Calculator.multiply(20.3);
		



	}

}
