package myPackage;

/* Abstrakte Klassen (mit dem keyword abstract) k�nnen nicht instanziiert werden */
abstract class Tier {
	String food = "Bier";
	
	public void atmen() {
		System.out.println("Tier atmet");
	}
	
	/* Auch Methoden k�nnen abstrakt sein */
	abstract public void essen();
	
}

class S�ugetier extends Tier {
	
	/* abstrakte Methoden m�ssen implementiert (mit body versehen) werden wenn sie von konkreten
	 * (nicht-abstrakten) Klasse geerbt werden */
	
	public void essen() {
		System.out.println("S�ugetier isst");
	}
}

class Reptilie extends Tier {
	/* Auch Reptilie muss die abstrakte Methode implementieren */
	public void essen() {
		System.out.println("Reptilie isst");
	}
	
	/* Geerbte, nicht-abstrake Methoden k�nnen auch neu implementiert werden -
	 * das nennen wir �berschreibung (Overriding)*/
	public void atmen () {
		System.out.println("Reptilie atmet");
	}
	
	String food = "Fleisch";
}


public class Abstract {

	public static void main(String[] args) {
		/* Objekt kann nicht erzeugt werden, weil Klasse abstrakt ist */
//		Tier tier = new Tier();
		
		/* Subklasse S�ugetier kann normal erzeugt werden */
		S�ugetier s�ugetier = new S�ugetier();
		s�ugetier.food = "Gras";
		s�ugetier.atmen();			// Tier atmet
		s�ugetier.essen();			// S�ugetier isst
		
		/* Wenn eine vererbte Methode von Subklassen unterschiedlich implementiert wird, 
		 * kann �ber die Referenz vom Typ der Elternklasse die jeweils passende Methode aufgerufen werden */
		Tier tier = new S�ugetier();
		tier.essen();					// S�ugetier isst - Klasse S�ugetier hat eine eigene Methode essen
		tier.atmen();					// Tier atmet	- nimmt die Methode aus der Elternklasse
		tier = new Reptilie();
		tier.essen();					// Reptilie isst - Klasse Reptilie hat eine eigene Methode essen
		tier.atmen();               	// Reptilie atmet - Klasse Reptilie hat eine eigene Methode atmen
		System.out.println(tier.food);	// Bier - Variablen sind nicht polymorphisch
		
	}

}
