package u1;
import java.util.Scanner;

public class groessteZahl {


	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Zahl 1: ");
		int n1 = scanner .nextInt();
		System.out.print("Zahl 2: ");
		int n2 = scanner .nextInt();
		System.out.print("Zahl 3: ");
		int n3 = scanner .nextInt();
		
		/*int max;
		
		if(n1 > n2) {
			max = n1;
		}
		else {
			max = n2;
		}
		
		if(max < n3){
			max = n3;
		}*/
		
		int max = (n1 > n2)  ? n1 : n2;
		max     = (n3 > max) ? n3 : max;
		
		System.out.println("Die groesste Zahl ist: " + max);
	}
		
	

}
