package prak4;

public class Latihan1 {

	public static void main(String[] args) {
		kondisional();
		kondisional2();

	}

	public static void kondisional(){
		int skor = 90;
		char grade;
		
		if (skor >= 90){
			grade = 'A';
		}
		else if (skor >= 80){
			grade = 'B';
		}
		else if (skor >= 70){
			grade = 'C';
		}
		else if (skor >= 60){
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("Grade = "+grade);
	}
	
	public static void kondisional2() {
		int nilai1 = 1;
		int nilai2 = 2;
		int hasil;
		boolean kondisi = true;
		hasil = kondisi ? nilai1 : nilai2;
		System.out.println(hasil);
	}
}
