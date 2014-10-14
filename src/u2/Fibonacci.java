package u2;
import java.io.IOException;
import java.util.Scanner;


public class Fibonacci {
	
	public static long readLong() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input: ");
		return scanner.nextLong();
	}

	public static void main(String[] args) {
		
		long n = readLong();
		
		long[] fibArray = {0, 1, 1};

		for (int i = 3; i <= n; i++) {
			fibArray[i] = fibArray[i-1] + fibArray[i-2];
			System.out.println(i);
		}
		
		for (long r : fibArray)
		{
			System.out.println(r);
		}

	}

}
