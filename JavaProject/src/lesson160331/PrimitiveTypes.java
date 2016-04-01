package lesson160331;

public class PrimitiveTypes {
	public static void main (String[] args) {
		byte b = 1;
		b = Byte.MAX_VALUE;
		b = Byte.MIN_VALUE;
		
		short s =34;
		s = Short.MAX_VALUE;
		s = Short.MIN_VALUE;
		
		int i = 10;
		i = Integer.MAX_VALUE;
		i = Integer.MIN_VALUE; 
		
		long l = 10L; // 64 bits == 8 bytes
		l = Long.MAX_VALUE;
		l = Long.MIN_VALUE; 
		
		char c = 10;
		c = 'A';
		c = 65; c++;
		System.out.println(c);;
		c = '\002';
		
		float f = 10.3f;
		f = 10E2f;
		f = 10;
		System.out.println(f);
		f = Float.MAX_VALUE;
		f = Float.MIN_VALUE;
		
		double d = 10.3;
		d = Double.MAX_VALUE;
		d = Double.MIN_VALUE;
		
		
	}

}
