import java.util.Scanner;
class Max
  
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No a :");
		a=sc.nextInt();
		System.out.println("Enter No b :");
		b=sc.nextInt();
		System.out.println("Enter No c :");
		c=sc.nextInt();
		if( a>b){
			System.out.println("A is max number : "+a);
		}
		else if(b>c){
			System.out.println("B is max number : "+b);
		}
		else{
			System.out.println("C is max number : "+c);
		}

	}
}
