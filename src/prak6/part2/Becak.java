package prak6.part2;
import prak6.Rangka;


public class Becak {
	
	private Rangka rangka;
	protected prak6.Mesin mesin;
	private int nomer;
	protected String nama;
	

	public Becak(){
		setRangka(new Rangka());
		setMesin(new prak6.Mesin());
		System.out.println("Konstruktor Becak");
	}
	
	public Becak(String nama){
		this.nama=nama;
	}
	
	public void stater(){
		System.out.println("Gayung Becakmu");
	}
	
	
	
	

	public Rangka getRangka() {
		return rangka;
	}

	public void setRangka(Rangka rangka) {
		this.rangka = rangka;
	}

	public prak6.Mesin getMesin() {
		return mesin;
	}

	public void setMesin(prak6.Mesin mesin) {
		this.mesin = mesin;
	}

	public int getNomer() {
		return nomer;
	}

	public void setNomer(int nomer) {
		this.nomer = nomer;
	}

}
