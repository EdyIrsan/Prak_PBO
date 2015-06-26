package prak7;

public class Persegi extends bentuk {
	
	private float sisi;
	
	public Persegi(){
		setSisi(2);
	}

	@Override
	public float HitungLuas() {
		
		return sisi*sisi;
	}

	@Override
	public void tulis() {
		
		System.out.println("Persegi");
	}

	public float getSisi() {
		return sisi;
	}

	public void setSisi(float sisi) {
		this.sisi = sisi;
	}
	
	
}
