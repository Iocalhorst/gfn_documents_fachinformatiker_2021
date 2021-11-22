package Smarties;

public class SmartieFabrik {
	
	
	public static void main(String[] args) {
		// Array f�r 100 Smarties - ist noch leer
		Smarties[] smarties = new Smarties[100];
		
		// Z�hler f�r die Farben
		int gelb = 0;
		int rot = 0;
		int gr�n = 0;
		int blau = 0;
		
		// Das Array mit Smarties f�llen - Konstruktor l�uft 100 mal
		for (int i = 0; i < smarties.length; i++) {
			smarties[i] = new Smarties();
		}
		
		// �ber das Array iterieren und die Farben z�hlen
		for (Smarties s : smarties) {
			switch(s.getFarbe()) {
			case gr�n: gr�n++;
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
		System.out.println("Gr�ne Smarties: "+gr�n);
		System.out.println("Blaue Smarties: "+blau);
		
		

	}

}
