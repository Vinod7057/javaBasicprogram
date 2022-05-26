
import java.util.Scanner;
class Findpower 
{
	public static void main(String[] args) 
	{
		int x,y,z=1;

		Scanner sc =new Scanner("System.in");
		System.out.println("Enter No");
		x=sc.nextInt();
		System.out.println("Enter No");
		y=sc.nextInt();
		while(y>0){
			z=z*x;
			y--;
			System.out.println(z);
		}
		
	}
}
