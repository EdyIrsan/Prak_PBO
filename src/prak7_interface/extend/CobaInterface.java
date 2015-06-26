package prak7_interface.extend;

import prak7_interface.BentukKeliling;
import prak7_interface.BentukLuas;

public class CobaInterface {
	
	public static double hitungLuasBentuk(BentukLuas b){
		return b.hitungLuas();
	}
	
	public static double hitungLuasKeliling(BentukKeliling b){
		return b.hitungKeliling();
	}

	public static void main(String[] args) {
		BentukInterface bInterface = new Lingkaran(3.0);
		System.out.println(hitungLuasBentuk((BentukLuas)bInterface));
		System.out.println(hitungLuasKeliling((BentukKeliling)bInterface));
	}

}
