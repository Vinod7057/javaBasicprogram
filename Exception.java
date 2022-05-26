import java.util.*;

public class Exception {
	

	public static void main(String[] args) {
		try{
		int[]myNumber= {1,2,3};
		System.out.println(myNumber[10]);//error
		} catch(Exception e){
		System.out.println(" wrong.");
		} finally{
		System.out.println("finally block");
		}
	

	}

}
