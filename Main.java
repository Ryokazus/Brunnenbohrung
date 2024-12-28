
public class Main {

	public static void main(String[] args) {
		// Singleton-Instanz holen
        OffeneAntragListe oAListe = OffeneAntragListe.getInstance();
        
    	// Erstellt zuerst zwei Anträge für Hans
        Adresse adresseA = new Adresse("Musterstraße 25", "06118", "Halle");
        Customer Hans = new Customer("HansImGlück@gmail.com", "Glück5pil5", adresseA, "+4915205322267");

        Bohrung bohrungA = new Bohrung(adresseA, 1, "26.01.2025", (float) 5.0, "01.04.2025", Bohrung.Verfahren.Trockenbohrung, "");
        Antrag Antrag1 = new Antrag(Hans, "23.12.2024", bohrungA);

        Adresse adresseB = new Adresse("Faradaystraße 25", "04159", "Leipzig");
        Bohrung bohrungB = new Bohrung(adresseB, 1, "15.03.2025", (float) 7.0, "04.06.2025", Bohrung.Verfahren.Spühlbohrung, "");
        Antrag Antrag2 = new Antrag(Hans, "24.12.2024", bohrungB);

        //Anträge zum Customer Hans hinzufügen
        Hans.addAntrag(Antrag1);
		Hans.addAntrag(Antrag2);
		
        //Ausgabe Liste
        oAListe.print();
        System.out.println("Anträge hinzugefügt\n");
        
        //ändern eines Antrages
        Antrag1.getBohrung().getBrunnenAdresse().setAdresse("Musterstraße 32", "06118", "Halle");
        Hans.changeAntrag(Antrag1);

        //Ausgabe Liste
        oAListe.print();
        System.out.println("Antrag1 geändert\n");
        
        //löschen eines Antrages
        Hans.deleteAntrag(Antrag1);
        
        //Ausgabe Liste
        oAListe.print();
        System.out.println("Antrag1 gelöscht\n");
	}

}
