package prak3;

public class Latihan2 {

	public static void main(String[] args) {
		
		System.out.println("ini operator Unary" );
		unary();
		System.out.println("\nini operator PrePostDemo");
		PrePostDemo();
	}

	public static void unary(){
		int hasil = +1;
		System.out.println(hasil);
		hasil--;
		System.out.println(hasil);
		
		hasil++;
		System.out.println(hasil);
		
		hasil = -hasil;
		System.out.println(hasil);
		
		boolean sukses = false;
		System.out.println(sukses);
		System.out.println(!sukses);
	}
	
	public static void PrePostDemo(){
		int i = 3;
		i++;
		System.out.println(i); //"4"
		++i;
		System.out.println(i); //"5"
		System.out.println(++i); //"6"
		System.out.println(i++); //"6"
		System.out.println(i); //"7"
		
	}
}
