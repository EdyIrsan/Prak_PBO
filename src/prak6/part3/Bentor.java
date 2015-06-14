package prak6.part3;
import prak6.part2.Becak;

public class Bentor  extends Becak{

		public String nama;
		public Bentor(){
			super();
		}
		public Bentor (String nama){
			super(nama);
		}
		public void cetak (String nama){
			super.nama = nama;
			this.nama="Bentor Lokal";
			System.out.println(nama);
			System.out.println(this.nama);
		}
		public void stater(){
			System.out.println("Stater Bentor");
		}

	public static void main(String args[]){
		Bentor bentor = new Bentor();
		bentor.cetak("BENTOR");
	}
		
}
