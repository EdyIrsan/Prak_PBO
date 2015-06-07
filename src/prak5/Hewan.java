package prak5;

public class Hewan {
	
	public static int Jumlah_hewan = 0;
	public String Spesies;
	
	public static void tambahHewan (){
		Jumlah_hewan++;
	}

	public static void main(String[] args) {
		Hewan objekHewan = new Hewan();
		objekHewan.Spesies = "kucing";
		Hewan.tambahHewan();
		System.out.println(Hewan.Jumlah_hewan);
		
		Hewan objekHewan2 = new Hewan();
		objekHewan2.Spesies = "Kelinci";
		Hewan.tambahHewan();
		System.out.println(Hewan.Jumlah_hewan);
		
		System.out.println(Hewan.Jumlah_hewan);
		System.out.println(Hewan.Jumlah_hewan);
		
	}

}
