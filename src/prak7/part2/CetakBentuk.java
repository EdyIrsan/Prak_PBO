package prak7.part2;
import prak7.bentuk;
import prak7.Persegi;
import prak7.SegitigaSamaKaki;
import prak7.SegitigaSamaSisi;

public class CetakBentuk {

	public static void CetakBangun(bentuk B){
		System.out.println(B.HitungLuas());
		B.tulis();
		B.geser(5, 5);
	}
	
	public static void main(String[] args) {
		CetakBangun(new Persegi());
		CetakBangun(new SegitigaSamaKaki());
		CetakBangun(new SegitigaSamaSisi());

	}

}
