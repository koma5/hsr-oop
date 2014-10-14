package u2;
import java.io.IOException;


public class InverserHexConverter {

	public static void main(String[] args) {
		
		System.out.print("hex zahl (v.l.n.r):");
		
		char c = nextChar();
		
		int i = 1, x = 0;
		int decNummber = 0;
		
		while(c != '\r' && c != '\n') {
			if (c >= '0' && c <= '9')
			{
				x = c - '0';
			}
			else if (c >= 'a' && c <= 'f')
			{
				x = c - 'W';
			}
			else if (c >= 'A' && c <= 'F')
			{
				x = c - 55;
			}
			
			decNummber += x * i;
			i *= 16;
			c = nextChar();
		}
		
		System.out.println(":" + decNummber);
		
	}

	// returns the next ASCII character of a console line input
	private static char nextChar() {
		try {
			return (char)System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
			return '\0';
		}
	}
}
