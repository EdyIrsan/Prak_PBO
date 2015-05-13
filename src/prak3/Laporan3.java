package prak3;

public class Laporan3 {

	public static void main(String[] args) {
		byte angka = 5;
		byte angka2 = -5;
		
		int hasil = angka++ >> 4 + 5 * 4 | 5 << angka2;
		System.out.println(hasil);
		
		int hasil4 = 6 >> 4 + 5 * 4 | 5 << -5;
		System.out.println(hasil4);
		
		int hasil3 = 5 << -5;
		System.out.println(hasil3);
		
		int hasil5 = 5 << -5 | 6 >> 4;
		System.out.println(hasil5);
		
		int hasil2 = 5 * 4 | 5 << angka2;
		System.out.println(hasil2);

	}

}
