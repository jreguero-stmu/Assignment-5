import java.util.*;

public class Division {

	public static void main(String[] args) {
		
		double dividend = 1;
		double divisor = 1;
		double quotient;
		int i = 0;
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Division Program \nEnter dividend");
		try{
			dividend = scan1.nextDouble();
		}
		catch(InputMismatchException e){
			System.out.println("Exception: You did not enter an integer");
			i++;
		}
		
		
		System.out.println("Enter divisor");
		try{
			divisor = scan2.nextDouble();
		}
		catch(InputMismatchException e){
			System.out.println("Exception: You did not enter an integer");
			i++;
		}
		
		if(i != 0){
			System.out.println("Program was unable to divide user inputs");
			System.exit(0);
		}
		
		else{
			try{
				quotient = dividend/divisor;
				System.out.println("Quotient is " + quotient);
			}
			catch(ArithmeticException e){
				System.out.println("Cannot divide by zero");
			}
		}
	}

}
