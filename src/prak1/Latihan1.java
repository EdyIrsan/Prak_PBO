package prak1;

public class Latihan1 {

		static String nama = "Edy Irsan";
		static String nim = "60200112043";
		static String kelas = "C";
		static String jurusan = "Teknik informatika";
		
		static int a = 6;
		static int b = 2;
		static int c;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			biodata();
			tambah();
			kurang();
			kali();
			bagi();
			

		}
		
		public static void biodata()
		{
			System.out.println(nama +"\n"+ nim +"\n"+ kelas +"\n"+ jurusan);
		}

		public static void tambah()
		{
			c = a+b;
			System.out.println( a +" + "+ b +" = "+ c);	
		}
		
		public static void kurang()
		{
			c = a-b;
			System.out.println( a +" - "+ b +" = "+ c);	
		}
		
		public static void kali()
		{
			c = a*b;
			System.out.println( a +" x "+ b +" = "+ c);
		}
		
		public static void bagi()
		{
			c = a/b;
			System.out.println( a +" : "+ b +" = "+ c);	
		}

}
