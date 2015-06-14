package prak6.part2;
import prak6.part3.Bentor;
import prak6.part3.Truk;

public class BecakTest {
	
	public static void StaterBecak(Becak becak){
		becak.stater();
	}

	public static void main(String[] args) {
		Becak bentor = new Bentor();
		Truk truk = new Truk();
		
		StaterBecak(new Becak());
		
		StaterBecak(bentor);
		
		StaterBecak(truk);

	}

}
