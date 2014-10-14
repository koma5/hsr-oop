package u1;
import java.util.Scanner;


public class ZahlenVergleichen {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Zahl 1: ");
		int n1 = scanner .nextInt();
		System.out.print("Zahl 2: ");
		int n2 = scanner .nextInt();
		
		int biggerNummber  = (n1 > n2) ? n1 : n2;
		int smallerNummber = (n1 > n2) ? n2 : n1;
		
		System.out.println(biggerNummber + " ist groesser als " + smallerNummber);
	}
	
}
