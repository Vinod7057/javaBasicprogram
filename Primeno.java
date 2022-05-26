import java.util.Scanner;

public class Primeno {
	public static void main(String[] args) {
		int number, i;
		System.out.println("enter no");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for (i = 2; i < number; i++) {
			if (number % i == 0)
				break;

		}
		if (i == number) {
			System.out.println(number + " number is prime ");
		}else{
			System.out.println(" number is not prime ");
		}
	}

}
