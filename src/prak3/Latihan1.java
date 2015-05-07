package prak3;

public class Latihan1 {

	public static void main(String[] args) {

		aritmatika();
		concat();
		
		
	}

	public static void aritmatika() {
		
		int hasil = 1 + 2;
		System.out.println(hasil);

		hasil = hasil - 1;
		System.out.println(hasil);

		hasil = hasil * 2;
		System.out.println(hasil);

		hasil = hasil / 2;
		System.out.println(hasil);

		hasil = hasil + 8;
		hasil = hasil % 7;
		System.out.println(hasil);

		hasil += 1;
		System.out.println(hasil);

		hasil -= 2;
		System.out.println(hasil);

		hasil *= 4;
		System.out.println(hasil);		
	}
	
	public static void concat () {
		
		String stringPertama = "ini Edy";
		String stringKedua   = " dan Kiki";
		String stringketiga  = stringPertama + stringKedua;
		System.out.println(stringketiga);
		
	}
}
