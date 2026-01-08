package typecasting;

class Widening1 {
	
	public static void main(String[] args) {
		
		// WIDENING TYPE CASTING

        byte b = 10;
        short s1 = b;
        System.out.println("byte to short: " + s1);

        short s = 100;
        int i1 = s;
        System.out.println("short to int: " + i1);

        int i = 5000;
        long l1 = i;
        System.out.println("int to long: " + l1);

        long l = 10000L;
        float f1 = l;
        System.out.println("long to float: " + f1);

        float f = 99.99f;
        double d1 = f;
        System.out.println("float to double: " + d1);

        char c = 'A';
        int ascii = c;
        System.out.println("char to int: " + ascii);


        // NARROWING TYPE CASTING

        double d = 88.88;
        float f2 = (float) d;
        System.out.println("double to float: " + f2);

        float f3 = 1234.5f;
        long l2 = (long) f3;
        System.out.println("float to long: " + l2);

        long l3 = 99999L;
        int i2 = (int) l3;
        System.out.println("long to int: " + i2);

        int i3 = 120;
        short s2 = (short) i3;
        System.out.println("int to short: " + s2);

        short s3 = 50;
        byte b2 = (byte) s3;
        System.out.println("short to byte: " + b2);

        int i4 = 66;
        char c2 = (char) i4;
        System.out.println("int to char: " + c2);
				
	}

}
