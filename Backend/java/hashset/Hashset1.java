import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(12);
		hs.add(24);
		hs.add(36);
		hs.add(48);
		hs.add(null);
		for(Object o:hs) {
			System.out.println(o);
		}
		HashSet hs1=new HashSet();
		hs1.add("Pooja");
		hs1.add("Megha");
		hs1.add("Shashank");
		hs1.add(null);
		for(Object o1:hs1) {
			System.out.println(o1);
		}

	}

}
