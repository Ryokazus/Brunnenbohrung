
public class Person {
    private String eMail;
    private String passwort;
    private Adresse adresse;
    private String telefonnummer;
    private int berechtigungsRang;

    // Konstruktor
    public Person(String eMail, String passwort, Adresse adresse, String telefonnummer, int berechtigungsRang) {
        this.eMail = eMail;
        this.passwort = passwort;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
        this.berechtigungsRang = berechtigungsRang;
    }
    
    public Person getPerson() {
    	return this;
    }
    
    public String getEMail() {
    	return this.eMail;
    }
    public void setPerson(Person person) {
    	this.eMail = person.eMail;
        this.passwort = person.passwort;
        this.berechtigungsRang = person.berechtigungsRang;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
