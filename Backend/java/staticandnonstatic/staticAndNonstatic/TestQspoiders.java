package staticAndNonstatic;

public class TestQspoiders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qspiders BTM=new Qspiders();
		BTM.swipe();
		BTM.swipe();
		Qspiders rajajinagar=new Qspiders();
		rajajinagar.swipe();
		rajajinagar.swipe();
		System.out.println(BTM.branchstdCount);
		System.out.println(rajajinagar.branchstdCount);
		System.out.println(Qspiders.totalstdCount);
        }

}
