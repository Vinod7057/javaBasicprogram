import java.util.Scanner;
public class Factorialno {
	public static void main(String[] args) {
		int x , y=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No"); 
		x=sc.nextInt();
		for(int i=1;i<=x;i++) { 
			y= y * i;
			
		}
		System.out.println(y);


		//array program
		System.out.println("Array");

		int arr[]={1,2,3,4};
		
		for (int i=4;i>=0 ;i-- ){

			System.out.println(arr[i-1]);
	
		}
	}
}
		


