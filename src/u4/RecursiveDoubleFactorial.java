package u4;

public class RecursiveDoubleFactorial {

	public static long fac(long i) {
		if (i - 2 >= 2) {
			return i * fac(i - 2);
		}
		else {
			return i;
		}
	
	}
	
	public static void main(String[] args) {
		try {

			System.out.println(fac(100000));

		} catch (StackOverflowError e){
			System.out.println(fac(50));
		}
		System.out.println(fac(6));
		System.out.println(fac(50));
		System.out.println(fac(1));
		System.out.println(fac(2));
		
	}	
}
