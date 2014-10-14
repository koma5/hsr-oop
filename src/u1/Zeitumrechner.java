package u1;
import java.util.Scanner;


public class Zeitumrechner {

	public static int readSeconds() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Seconds: ");
		return scanner.nextInt();
		
	}
	
	public static void main(String[] args) {
		
		int seconds = readSeconds();
		
		
		int hours = seconds / 3600;
		seconds = seconds % 3600;
		
		int minutes = seconds / 60;
		seconds = seconds % 60;
		
		System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
	}
	
}
