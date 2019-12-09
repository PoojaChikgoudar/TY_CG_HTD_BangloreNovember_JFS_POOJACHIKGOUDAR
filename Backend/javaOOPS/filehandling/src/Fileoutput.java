
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutput {

	public static void main(String[] args) {
		try {
			FileOutputStream f1=new FileOutputStream("anu.txt");
			String s1="Pooja Chikgoudar";
			byte b1[]=s1.getBytes();
			f1.write(b1);
			System.out.println("sucess...");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
