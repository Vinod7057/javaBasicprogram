import java.util.Scanner;

public class Armstrong {

	public static void main(String args[]) {
		int number, sum = 0, original, remainder;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = sc.nextInt();
		original = number;
		while (number != 0) {
			remainder = number % 10;
			sum = sum + (remainder * remainder * remainder);
			number /= 10;
		}
		if (sum == original) {
			System.out.println("number is amstrong");
		} else {
			System.out.println("number is not amstrong");
		}
	}
}

