import java.util.Scanner;
class OddEven 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no :");
		a=sc.nextInt();
		//System.out.printl("Enter no :");
		//b=sc.nextInt();
		if(a%2==0){
			System.out.println("A is Even no : "+a);
		}
		else{
			System.out.println("B is Odd no : "+a);
		}

	}
}
