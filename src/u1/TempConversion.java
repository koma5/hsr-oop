package u1;
import java.util.Scanner;


public class TempConversion {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Grad Celsius: ");
		double celsius = scanner.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		double kelvin     = celsius + 273.15;
		
		System.out.println(celsius + " Grad Celsius sind " + fahrenheit + "in Grad Fahrenheit \n und "+ kelvin + " in Grad Kelvin");

	}
}
