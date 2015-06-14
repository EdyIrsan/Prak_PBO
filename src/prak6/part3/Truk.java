package prak6.part3;
import prak6.Mesin;
import prak6.part2.Becak;

public class Truk extends Becak{
	
	public Truk(){
	}

	public void angkut(){
		mesin = new Mesin();
		stater();
		nama = "Truk";
		System.out.println("Tongkang Becak Dalam Truk");
	}
	public void stater(){
		System.out.println("Stater Truk");
	}
	
	public static void main(String[] args) {
		Truk truk = new Truk();
		truk.angkut();
	}

}
