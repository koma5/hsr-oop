package u1;
import java.util.Scanner;


public class DoubleFacorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number: ");
		int input = scanner.nextInt();
		
		int i = (input %2 == 0) ? 2 : 1;
		int fac = 1;
		
		for(; i <= input; i += 2) {
			fac *= i;
			System.out.println(i);
		}
		
		System.out.println("Result: " + fac);
		
	}
}
