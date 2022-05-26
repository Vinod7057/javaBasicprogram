public class MultipleCatchBlock1
{
	public static void main (String[]args){
		try{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occur");
		}
		catch(ArrayIndexOutOfBondException e)
		{
			System.out.println("ArrayIndexOutOfBondException");
		}
		catch(Exception e)
		{
			System.out.println("prant Exception occurs");
		}
			System.out.println("rest of the code");

	}
}