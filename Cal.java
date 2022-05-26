import java.util.*;
class Cal 
{
	public static void main(String[] args) 
	{
		int a,b,ch;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no");
		a=sc.nextInt();
		System.out.println("Enter no");
		b=sc.nextInt();
		System.out.println("Chose 1 add,2sub,3mul,4div");
		ch=sc.nextInt();
		if(ch==1)
			System.out.println(a+b);
		else if(ch==2)
			System.out.println(a-b);
		else if(ch==3)
			System.out.println(a*b);
		else if(ch==4)
			System.out.println(a/b);
		else 
			System.out.println("invalid");



	}
}
