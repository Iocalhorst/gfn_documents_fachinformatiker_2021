package Smarties;

public class SmartieFabrik {
	
	
	public static void main(String[] args) {
		// Array für 100 Smarties - ist noch leer
		Smarties[] smarties = new Smarties[100];
		
		// Zähler für die Farben
		int gelb = 0;
		int rot = 0;
		int grün = 0;
		int blau = 0;
		
		// Das Array mit Smarties füllen - Konstruktor läuft 100 mal
		for (int i = 0; i < smarties.length; i++) {
			smarties[i] = new Smarties();
		}
		
		// Über das Array iterieren und die Farben zählen
		for (Smarties s : smarties) {
			switch(s.getFarbe()) {
			case grün: grün++;
			break;
			case gelb: gelb++;
			break;
			case rot: rot++;
			break;
			case blau: blau++;		
			}
		}
		
		// Ergebnis ausgeben
		System.out.println("Gelbe Smarties: "+gelb);
		System.out.println("Rote Smarties: "+rot);
		System.out.println("Grüne Smarties: "+grün);
		System.out.println("Blaue Smarties: "+blau);
		
		

	}

}
