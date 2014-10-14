package u1;
import java.util.Scanner;


public class Kreis {

	public static double readRadius() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Radius: ");
		return scanner .nextDouble();
		
	}
	
	public static void main(String[] args) {
		
		final double PI = Math.PI;
		double radius = readRadius();
		
		System.out.println("Flaeche: " + (Math.pow(radius, 2) * PI));
	}
}
