package myPackage;

/* Abstrakte Klassen (mit dem keyword abstract) können nicht instanziiert werden */
abstract class Tier {
	String food = "Bier";
	
	public void atmen() {
		System.out.println("Tier atmet");
	}
	
	/* Auch Methoden können abstrakt sein */
	abstract public void essen();
	
}

class Säugetier extends Tier {
	
	/* abstrakte Methoden müssen implementiert (mit body versehen) werden wenn sie von konkreten
	 * (nicht-abstrakten) Klasse geerbt werden */
	
	public void essen() {
		System.out.println("Säugetier isst");
	}
}

class Reptilie extends Tier {
	/* Auch Reptilie muss die abstrakte Methode implementieren */
	public void essen() {
		System.out.println("Reptilie isst");
	}
	
	/* Geerbte, nicht-abstrake Methoden können auch neu implementiert werden -
	 * das nennen wir Überschreibung (Overriding)*/
	public void atmen () {
		System.out.println("Reptilie atmet");
	}
	
	String food = "Fleisch";
}


public class Abstract {

	public static void main(String[] args) {
		/* Objekt kann nicht erzeugt werden, weil Klasse abstrakt ist */
//		Tier tier = new Tier();
		
		/* Subklasse Säugetier kann normal erzeugt werden */
		Säugetier säugetier = new Säugetier();
		säugetier.food = "Gras";
		säugetier.atmen();			// Tier atmet
		säugetier.essen();			// Säugetier isst
		
		/* Wenn eine vererbte Methode von Subklassen unterschiedlich implementiert wird, 
		 * kann über die Referenz vom Typ der Elternklasse die jeweils passende Methode aufgerufen werden */
		Tier tier = new Säugetier();
		tier.essen();					// Säugetier isst - Klasse Säugetier hat eine eigene Methode essen
		tier.atmen();					// Tier atmet	- nimmt die Methode aus der Elternklasse
		tier = new Reptilie();
		tier.essen();					// Reptilie isst - Klasse Reptilie hat eine eigene Methode essen
		tier.atmen();               	// Reptilie atmet - Klasse Reptilie hat eine eigene Methode atmen
		System.out.println(tier.food);	// Bier - Variablen sind nicht polymorphisch
		
	}

}
