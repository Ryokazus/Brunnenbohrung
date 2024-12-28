import java.util.ArrayList;
import java.util.List;

public class Mitarbeiter extends Person{

private List<Antrag> angenommeneAnträge;
private List<Antrag> abgeschlosseneAnträge;
	
	public Mitarbeiter(String eMail, String passwort, Adresse adresse, String telefonnummer) {
        super(eMail, passwort, adresse, telefonnummer, 1);
        this.angenommeneAnträge = new ArrayList<>();
        this.abgeschlosseneAnträge = new ArrayList<>();
    }
	
	public List<Antrag> getAngenommeneAnträgeListe() {
        return angenommeneAnträge;
    }

    public void setAngenommeneAnträgeListe(List<Antrag> angenommeneAnträge) {
        this.angenommeneAnträge = angenommeneAnträge;
    }
	
    public List<Antrag> getAbgeschlosseneAnträgeListe() {
        return abgeschlosseneAnträge;
    }

    public void setAbgeschlosseneAnträgeListe(List<Antrag> abgeschlosseneAnträge) {
        this.abgeschlosseneAnträge = abgeschlosseneAnträge;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
