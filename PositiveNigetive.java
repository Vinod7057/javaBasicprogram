import java.util.Scanner;

class PositiveNigetive 
{
	public static void main(String[] args) 
	{
		int a,b,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		a=sc.nextInt();
		System.out.println("Enter no ");
		b=sc.nextInt();
		System.out.println("Choice no 1 add,2 sub,3 mul,4 div");
		choice=sc.nextInt();
		if(choice==1){
			System.out.println("Add"a+b);
		}
		else if(choice==2){
			System.out.println("sub"a-b);
		}
		else if(choice==3){
			System.out.println("mul"a*b);
		}
		else if(choice==4){
			System.out.println("sub"a/b);
		}
		else{
			System.out.println("invalid no");
			}

	}
}
