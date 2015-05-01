package prak2;

public class Laporan2 {
	
	static int a = 1;
	static float f4 = 1e-45f;
	static boolean bool;
	
	static Byte refByte = new Byte((byte) 123);
	static Byte b = refByte.byteValue();
	
	static Character refChar = new Character('x');
	static char c = refChar.charValue();
	
	public static void main(String[] args) {		
		
		tampil1();
		a();
		tampil2();
		
		
	}
		
	public static void tampil1()
	{
		if ( a == 1){
			System.out.println(b);
			System.out.println(f4);
		}
	}
	
	public static void tampil2()
	{
		if ( a == 2){
			System.out.println(c);
			System.out.println(bool);
		}
	}
	
	public static void a()
	{
		a+=1;
	}
	

}
