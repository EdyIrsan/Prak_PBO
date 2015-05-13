package prak3;

public class Latihan4 {

	public static void main(String[] args) {
		System.out.println("Operator bitwise dan bitshift");
		bitwise();

	}
	
	public static void bitwise() {
		byte angka1 = 127; //"Di samping merupakan Nilai int tertinggi yg dapat Di_Bitwise"
		byte angka2 = -128; //"Di samping Nilai - tertinggi yg dapat Di_Bitwise"
		System.out.println(~angka1);
		System.out.println(~angka2);
		
		System.out.println(angka1 & 5);
		System.out.println(25 | 5);
		System.out.println(angka1 ^ 5);
		System.out.println(5 << -5);
		System.out.println(-217>>2);
		System.out.println(angka1<<3);
		System.out.println(217>>>2);
		System.out.println(angka2>>>5);
		
	}

}
