import java.util.*;
class Fibonaci 
{
	public static void main(String[] args) 
	{
		int m1=0,m2=1,m3,count;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter NO");
		count=sc.nextInt();
		for(int i=0;i<count;i++){
			m3=m1+m2;
			m1=m2;
			m2=m3;


			System.out.println(m3);
		}
	}
}
