
public class Antrag implements Subjekt{
	
	public enum Status{
		ausstehend,
		inBearbeitung,
		angenommen,
		abgelehnt
	}
	
	private static int globalID = 0;
	private int id;
	private Status status;
	private Mitarbeiter mitarbeiter;
	private Customer antragsteller;
    private String erstellDatum;
    private Bohrung bohrung;
    private Observer observer;

    // Konstruktor
    public Antrag(Customer antragsteller, String erstellDatum, Bohrung bohrung) {
    	this.id = ++globalID;
    	this.status = status.ausstehend;
        this.mitarbeiter = null;
        this.antragsteller = antragsteller;
        this.erstellDatum = erstellDatum;
        this.bohrung = bohrung;
        this.observer = OffeneAntragListe.getInstance();
    }
    
    public int getId() {
    	return id;
    }
    
    public Bohrung getBohrung() {
        return bohrung;
    }
    
    public String toString(int i) {
        return "Antrag " + i + "{\n\t" +
        				"ID: " + id + "\n\t" +
        				"Status: " + status + "\n\t" +
        				"zuständiger Mitarbeiter: " + mitarbeiter + "\n\t" +
        				"Erstelldatum: " + erstellDatum + "\n\t" +
        				bohrung + "\n" +
        				"}\n\n";
    }

    public String toString2() {
    	return "  " + id + "  \t  " + 
    	getBohrung().getBohrverfahren() + " (" + 
    	getBohrung().getBrunnenAdresse().getStraße() + ") \t  " +
    	this.erstellDatum;
    }
    
    //wenn Antrag erstellt wird, wird es von Antrag aus bei Observer regestriert
    @Override
    public void registriereObserver() {
    	 benachrichtigeObserver(this, "add");
    }
    
    @Override
    public void entferneObserver() {
    	benachrichtigeObserver(this, "delete");
    }

    @Override
    public void benachrichtigeObserver(Antrag antrag, String action) {
        this.observer.aktualisiere(antrag, action);
    }
 
    
	public static void main(String[] args) {
	}
}