
public class BubbleSort {
	public  void bsort(int a1[]) {
		int n=a1.length;
		
		for(int i=0;i<=n-1;i++) 
			for(int j=0;j<n-i-1;j++) {
				if(a1[j]>a1[j+1]) {
					int temp=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
					
					
					
				}
			}
		}
	void printArray(int a1[]) {
		int n=a1.length;
		for(int i=0;i<n;i++)
			System.out.println(a1[i]+ " ");
		System.out.println();
	}
		
	}


