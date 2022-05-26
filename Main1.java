public class Main1
{
	static void checkAge(int age){
		if (age < 18){
			throw new ArithmeticException("18 years old.");
		}
		else{
			System.out.println("you are old enough");
		}
	}
	public static void main(String[] args){
		checkAge(20);
	}
}