import java.util.HashSet;

public class Hashset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs=new HashSet<Student>();
		hs.add(new Student(22,"Pooja"));
		hs.add(new Student(23,"megha"));
		hs.add(new Student(24,"Poo"));
		hs.add(new Student(22,"Pooja"));
		for(Student s1:hs) {
			System.out.println(s1.name+ " and age is "+s1.age);
		}
		

	}

}
