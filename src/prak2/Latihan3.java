package prak2;

public class Latihan3 {

	
	
	public static void main(String[] args) throws Exception {
		Boolean refBoolean = new Boolean(true);
		Boolean bool = refBoolean.booleanValue();
		
		Byte refByte = new Byte((byte) 123);
		Byte b = refByte.byteValue();
		
		Character refChar = new Character('x');
		char c = refChar.charValue();
		
		Short refShort = new Short((short) 123);
		short s = refShort.shortValue();
		
		Integer refInt = new Integer(123);
		int i = refInt.intValue();
		
		Long refLong = new Long(123L);
		long l = refLong.longValue();
		
		Float refFloat = new Float(12.3D);
		float f = refFloat.floatValue();
		
		Double refDouble = new Double(12.3D);
		double d = refDouble.doubleValue();
		
		System.out.println("boolean = "+ bool);
		System.out.println("byte    = "+ b);
		System.out.println("Char    = "+ c);
		System.out.println("short   = "+ s);
		System.out.println("integer = "+ i);
		System.out.println("long    = "+ l);
		System.out.println("float   = "+ f);
		System.out.println("double  = "+ d);

	}

}
