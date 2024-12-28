import java.util.ArrayList;
import java.util.List;


public class Customer extends Person {
	private List<Antrag> anträgeListe;
	
	public Customer(String eMail, String passwort, Adresse adresse, String telefonnummer) {
        super(eMail, passwort, adresse, telefonnummer, 1);
        this.anträgeListe = new ArrayList<>();
    }
	
	public List<Antrag> getAnträgeListe() {
        return this.anträgeListe;
    }
	
	public void addAntrag(Antrag antrag) {
    	this.getAnträgeListe().add(antrag);
    	antrag.registriereObserver();
    }
    //List<Antrag> antragsListe = 
    public void changeAntrag(Antrag neuAntrag) {
    	int neuId = neuAntrag.getId();
    	
    	int i = 0;
    	for(Antrag antrag : this.getAnträgeListe()) {
    		if (antrag.getId() == neuId) {
    			this.getAnträgeListe().set(i, neuAntrag);
    			antrag.benachrichtigeObserver(neuAntrag, "change");
    			break;
    		}
    		i++;
    	}
    }
    
    public void deleteAntrag(Antrag antrag) {
    	this.getAnträgeListe().remove(antrag);
    	antrag.entferneObserver();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
