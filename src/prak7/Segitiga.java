package prak7;

public abstract class Segitiga extends bentuk{

	protected float alas;
	protected float tinggi;
	
	public Segitiga(){
		alas = 2;
		tinggi = 5;
	}
	
	public float hitungLuas(){
		return (alas*tinggi)/2;		
	}
	
	
}
