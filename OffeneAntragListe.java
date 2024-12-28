import java.util.ArrayList;
import java.util.List;

public class OffeneAntragListe implements Observer {

    private List<Antrag> offeneAnträgeListe = new ArrayList<>();

    // Singleton-Instanz
    private static OffeneAntragListe instance;

    // Privater Konstruktor
    private OffeneAntragListe() {}

    // Singleton-Getter
    public static OffeneAntragListe getInstance() {
        if (instance == null) {
            instance = new OffeneAntragListe();
        }
        return instance;
    }

    public List<Antrag> getOffeneAnträgeListe() {
        return offeneAnträgeListe;
    }

    public void addAntrag(Antrag antrag) {
    	offeneAnträgeListe.add(antrag);
    }
    
    public void changeAntrag(Antrag neuAntrag) {
    	int neuId = neuAntrag.getId();
    	int i = 0;
    	List<Antrag> liste = this.getOffeneAnträgeListe();
    	for (Antrag antrag : liste) {
    		if (antrag.getId() == neuId) {
    			liste.set(i, neuAntrag);
    			break;
    		}
    		i++;
    	}
    }
    
    public void deleteAntrag(Antrag antrag) {
    	offeneAnträgeListe.remove(antrag);
    	
    }
    
    @Override
    public void aktualisiere(Antrag antrag, String action) {
    	if (action == "add") {
        	OffeneAntragListe.getInstance().addAntrag(antrag);
        	return;
        }
        else {
        	int i = 0;
            int id = antrag.getId();
            int idList;

            for (Antrag anträge : offeneAnträgeListe) {
                idList = anträge.getId();
                if (id == idList) {
                    if (action.equals("change")) {
                        offeneAnträgeListe.set(i, antrag);
                    } else if (action.equals("delete")) {
                        offeneAnträgeListe.remove(antrag);
                    } else {
                        System.err.println("Falsche Werte übergeben");
                    }
                }
                i++;
            }
        }
    	
    	
    }

    public void print() {
    	System.out.println("Offene AntragsListe:\n" + "  ID  |\t\t Beschreibung \t\t    |     Datum");
    	for(Antrag antrag : this.getOffeneAnträgeListe()) {
        	System.out.println(antrag.toString2());
        }
    }
    
    public static void main(String[] args) {
    	
    }
}
