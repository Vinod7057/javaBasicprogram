
import java.util.Scanner;
class Rectangal  
{
	public static void main(String[] args) 
	{
		int l,w,are;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a length : ");
		l=sc.nextInt();
		System.out.println("Enter a width");
		w=sc.nextInt();
		are=l*w;
		System.out.println(are);
	}
}
