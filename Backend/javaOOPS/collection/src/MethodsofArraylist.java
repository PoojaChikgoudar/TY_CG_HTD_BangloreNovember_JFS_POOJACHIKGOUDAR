import java.util.ArrayList;
import java.util.List;

public class MethodsofArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		l1.add(0,23);
		l1.add(1,22);
		l1.add(2,28);
		l1.add(1,110);
		System.out.println(l1);
		System.out.println(l1.remove(2));
		System.out.println(l1);
		System.out.println(l1.indexOf(23));
		System.out.println(l1.lastIndexOf(110));
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		List l2=new ArrayList();
		l2.add(0,24);
		l2.add(1,25);
		l2.add(2,26);
		l1.addAll(1,l2);
		System.out.println(l1);
		
		List l3=new ArrayList();
		l3.add(0,24);
		l3.add(1,25);
		l3.add(2,26);
		l3.set(1,112);
		System.out.println(l3);
		
		List l4=new ArrayList();
		l4.add(0,24);
		l4.add(1,25);
		l4.add(2,26);
		
		List l5=l4.subList(0,2);
		System.out.println(l5);
	}
		

}
