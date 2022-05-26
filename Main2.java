public class Main2
{
	static void checkAge(int age){
		if (age < 18){
			throw new ArithmeticException("18 years old");
		}
		else{
			System.out.println("you are old");
		}
	}

	public static void main(String[]args){
		checkAge(17);
	}



}