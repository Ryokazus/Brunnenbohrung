
public class Bohrung {
	private Adresse brunnenAdresse;
	private int anzahlBohrungen;
	private String beginn; 
	private float geplanteTiefe; 
	private String ende;
	
	private Verfahren bohrverfahren;
	private String bemerkung;
	
	public enum Verfahren{
		Spühlbohrung, 
		Trockenbohrung, 
		Seilkernbohrung
	};
	
	public Bohrung(Adresse brunnenAdresse, int anzahlBohrungen, String beginn, float geplanteTiefe, String ende, Verfahren bohrverfahren, String bemerkung) {
		this.brunnenAdresse = brunnenAdresse;
		this.anzahlBohrungen = anzahlBohrungen;
		this.beginn = beginn;
		this.geplanteTiefe = geplanteTiefe;
		this.ende = ende;
		this.bohrverfahren = bohrverfahren;
		this.bemerkung = bemerkung;
	}
	
	public Verfahren getBohrverfahren() {
		return this.bohrverfahren;
	}
	
	public Adresse getBrunnenAdresse() {
		return this.brunnenAdresse;
	}
	
	public String toString() {
		return "Bohrung:\n\t\t" + 
						"Adresse \t = " + brunnenAdresse.toString() + "\n\t\t" +
						"Anzahl Bohrungen = " + anzahlBohrungen + "\n\t\t" +
						"Beginn \t\t = " + beginn + "\n\t\t" +
						"geplante Tiefe   = " + geplanteTiefe + "\n\t\t" +
						"Ende \t\t = " + ende +  "\n\t\t" +
						"Bohrverfahren \t = " + bohrverfahren + "\n\t\t" +
						"Bemerkung \t = " + bemerkung;
	}
	
	public static void main(String[] args) {
		
	}

}
