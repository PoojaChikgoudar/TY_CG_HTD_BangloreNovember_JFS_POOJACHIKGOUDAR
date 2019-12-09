package staticAndNonstatic;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FirstGen fs=new FirstGen();
		//fs.call();
		//fs.msg();
		//SecondGen sg=new SecondGen();
		//sg.call();
		//sg.msg();
		//sg.radio();
		//ThirdGen tg=new ThirdGen();
		//tg.call();
		//tg.msg();
		//tg.radio();
		//tg.camera();
		FirstGen fs=new ThirdGen();
		fs.call();
		fs.msg();
		SecondGen sg=new ThirdGen();
		sg.call();
		sg.msg();
		sg.radio();
		
		
		
		

	}

}
