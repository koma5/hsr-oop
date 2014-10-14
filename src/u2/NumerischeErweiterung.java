package u2;

public class NumerischeErweiterung {

	public static void main(String[] args) {
		// Integer.MAX_VALUE == 2147483647 (2^31-1)
		
		int i = 1; long l = 2; float f = .1f; double d = 0.2;
		
		// a)
		float x1 = i / 4; // int ganzzahlig teilbar
		//: 0.0
		
		// b)
		double x2 = i / 4.0; // oder 4f oder (float) i
		//: 0.25
		
		// c)
		float x3 = 1.0f / 1; // wie erwartet
		//: 1.0
		
		// d)
		double y1 = 123456789 + f; // Rechenfehler
		//: 1.23456792E8
		
		// e)
		double y2 = 123456789.0 + f;
		//: 1.234567891E8
		
		// f)
		long z1 = Integer.MAX_VALUE * i; // wie erwartet
		//: 2147483647
		
		// g)
		long z2 = Integer.MAX_VALUE * 2; // ?? overflow
		//: -2
		
		// h)
		float z3 = i / 0;
		//: ArithmeticException: / by zero
		
		// z)
		float z4 = (float)i / 0;
		//: Infinity
		
		System.out.println(z4);
		
	}

}
