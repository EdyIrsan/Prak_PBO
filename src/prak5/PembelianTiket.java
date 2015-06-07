package prak5;

public class PembelianTiket {

	Tiket TiketDibeli;
	Pembeli Pemesan;

	public PembelianTiket(){
	TiketDibeli =new Tiket();
	Pemesan=new Pembeli();
	}
	
	public void DataPembelian(){
	System.out.println("Nama Pembeli    : "+Pemesan.getNama() );
	System.out.println("No Id           : "+Pemesan.getnoId() );
	System.out.println("Kelas           : "+TiketDibeli.getKelasGerbong());
	System.out.println("Gerbong         : "+Pemesan.getnoId() );
	System.out.println("No kursi        : "+Pemesan.getnoId() );
	System.out.println("Harga Pembelian : "+TiketDibeli.getHarga());
	}
	
	public void Beli(Tiket Tiketku, Pembeli User){
	TiketDibeli=Tiketku;
	Pemesan=User;
	}

}
