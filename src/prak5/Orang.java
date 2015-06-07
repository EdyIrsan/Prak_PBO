package prak5;

public class Orang {
	
	public String nama;
	public String alamat;
	public int TinggiBadan;
	public float BeratBadan;
	public int no;
	

	public static void main(String[] args) {
		
		input();
		
		Orang objekOrang = new Orang();
				
		
		if (objekOrang instanceof Orang){
			System.out.println("objekOrang adalah instan dari kelas Orang");
		}
		

	}
	
	public static void input() {
		Orang objekOrang = new Orang();
		objekOrang.no=1;
		objekOrang.nama = "Edy Irsan";
		objekOrang.alamat = "polewali";
		objekOrang.TinggiBadan = 150;
		objekOrang.BeratBadan = 65.4f;
		objekOrang.cetakOrang();
		
		Orang objekOrangDua = new Orang();
		objekOrangDua.no=2;
		objekOrangDua.nama = "sadalia";
		objekOrangDua.alamat = "polewali";
		objekOrangDua.TinggiBadan = 150;
		objekOrangDua.BeratBadan = 70.0f;
		objekOrangDua.cetakOrang();	
		
	}
	
	public void cetakOrang(){
		if (no==1){
		System.out.println(" Object orang " +no+" \n nama : "+ nama +"\n alamat : "+ alamat +"\n Tinggi Badan :"+ 
							TinggiBadan +"\n Berat Badan : "+ BeratBadan+"\n");
		}else{
			System.out.println(" Object orang "+no+" \n nama : "+ nama +"\n alamat : "+ alamat +"\n Tinggi Badan :"+ 
					TinggiBadan +"\n Berat Badan : "+ BeratBadan+"\n");
		}
	}

}

