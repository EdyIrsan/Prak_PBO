package prak3;

public class Latihan3 {

	public static void main(String[] args) {
		
		System.out.println("Operator Perbandingan Dan Kondisional");
		System.out.println("Operator Perbandingan");
		perbandingan();
		System.out.println("\nOperator kondisional");
		kondisional();
	}
	
	public static void perbandingan () {
		int nilai1 = 1;
		int nilai2 = 2;
		if (nilai1 == nilai2){
			System.out.println("nilai1 == nilai2");
		}
		if (nilai1 != nilai2){
			System.out.println("nilai1 != nilai2");
		}
		if (nilai1 > nilai2){
			System.out.println("nilai1 > nilai2");
		}
		if (nilai1 < nilai2){
			System.out.println("nilai1 < nilai2");
		}
		if (nilai1 <= nilai2){
			System.out.println("nilai1 <= nilai2");
		}
		if (nilai1 >= nilai2){
			System.out.println("nilai1 >= nilai2");
		}
	}
	
	public static void kondisional () {
		int nilai1 = 1;
		int nilai2 = 2;
		if ((nilai1 == 1) && (nilai2 == 2))
			System.out.println("Nilai 1 Adalah 1 Dan Nilai 2 Adalah 2");
		
		if ((nilai1 == 1) || (nilai2 == 2))
			System.out.println("Nilai 1 Adalah 1 atau Nilai 2 Adalah 2");
		
	}

}
