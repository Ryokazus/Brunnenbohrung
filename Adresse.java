
public class Adresse {
	private String straße;
	private String postleitzahl;
	private String ort;
	
	public Adresse(String straße, String postleitzahl, String ort) {
		this.straße = straße;
		this.postleitzahl = postleitzahl;
		this.ort = ort;
	}
	
	public Adresse getAdresse() {
		return this;
	}
	
	public void setAdresse(String straße, String postleitzahl, String ort) {
		this.straße = straße;
		this.postleitzahl = postleitzahl;
		this.ort = ort;
	}
	
	public String getStraße() {
		return this.straße;
	}
	
	public String toString() {
		return straße + ", " + postleitzahl + " (" + ort + ")";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
