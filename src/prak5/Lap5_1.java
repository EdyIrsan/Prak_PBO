package prak5;

public class Lap5_1 {

	static String hidung;  
    static String mata;  
    static String warnakulit;  
    static String rambut;
	
	public static void main(String[] args) {
		Lap5_1 tampil = new Lap5_1();
		tampil.set("sedang", "hitam Putih", "coklat", "hitam");
		tampil.lihat();

	}
	
	
	public void set(String hidung, String mata, String warnakulit, String rambut) {  
        Lap5_1.hidung = hidung;  
        Lap5_1.mata = mata;  
        Lap5_1.warnakulit = warnakulit;  
        Lap5_1.rambut = rambut;  
    }
	
	public void lihat() {
		System.out.println("contoh pengimplementasian Class, Method, Atribut, Constructor");
		System.out.println("=================================================================="+"\n");
		System.out.println("Ciri - Ciri Edy Irsan");  
        System.out.println("Hidung      : " + hidung);  
        System.out.println("Mata        : " + mata);  
        System.out.println("Warna kulit : " + warnakulit);  
        System.out.println("Rambut      : " + rambut);  
    }

}
