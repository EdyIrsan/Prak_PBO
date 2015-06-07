package prak5;

public class Main {

	public static void main(String[]args){
		System.out.println("Contoh Penerapan UML Pada Java");
		System.out.println("======================================");
		PembelianTiket beliTiket= new PembelianTiket();
		Tiket tiketku= new Tiket();
		tiketku.setHarga(50000);
		tiketku.setKelasGerbong("Bisnis");
		Pembeli baruBeli= new Pembeli();
		baruBeli.setNama("Edy Irsan");
		baruBeli.setnoId(5302413);

		beliTiket.Beli(tiketku , baruBeli);
		beliTiket.DataPembelian();
		}

}
