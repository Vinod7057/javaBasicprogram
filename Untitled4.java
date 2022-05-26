import java.util.Scanner;
public class Factorialno {
	public static void main(String[] args) {
		int x , y=1;
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		for(int i=1;i<=x;i++) { 
			y= y * i;
			
		}
		System.out.println(y);
	}

}
