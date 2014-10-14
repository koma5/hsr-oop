package u1;
import java.util.Scanner;


public class Grundrechenarten {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Zahl 1: ");
		int n1 = scanner .nextInt();
		System.out.print("Zahl 2: ");
		int n2 = scanner .nextInt();
		
		System.out.println("Summe: " + (n1 + n2));
		System.out.println("Differenz: " + (n1-n2));
		System.out.println("Produkt: " + n1*n2);
		System.out.println("Quotient: " + (double)n1 / (double)n2 );
	}
}
