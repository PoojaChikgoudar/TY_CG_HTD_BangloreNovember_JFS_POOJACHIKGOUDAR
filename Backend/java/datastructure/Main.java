import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int a1[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			a1[i]=sc.nextInt();
		}
		BubbleSort b1=new BubbleSort();
		b1.bsort(a1);
		System.out.println("sorted array");
		b1.printArray(a1);
		System.out.println("---------");
		
		
	}

}
