package u2;

public class TypKonversion {

	public static void main(String[] args) {
		
		char c = '!'; byte b = 0; short s = 1;
		int i = 3; long l = 4; float f = .5f;
		double d = 0.6;
		
		// a)
		long z = b;
		
		// b)
		int a = (int)(f * 2); //ex
		
		// c)
		float x = 0x12345678;
		
		// d)
		double y = 1 * 1;
		
		// e)
		z = (long)(y * y); //ex
		
		// f)
		s = (short)(b + 1); //ex
		
		// g)
		b = (byte) (c + 1);
		
		// h)
		b += 1;
		

	}

}
