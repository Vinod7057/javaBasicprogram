//Class and object program
   
import java.util.Scanner;
class ClassObject

{
	int a,b;
    void getdata()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		a=sc.nextInt();
		System.out.println("enter second no");
		b=sc.nextInt();
		}

		void putdata(){
			System.out.println("Addition="+(a+b));
			public static void main(String args[]){
				ClassObject a=new ClassObject();
				a.getdata();
				a.putdata();
			}
		}


}
