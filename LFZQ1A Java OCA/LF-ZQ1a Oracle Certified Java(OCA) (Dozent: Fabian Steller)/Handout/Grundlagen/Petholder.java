package myPackage;

/* Klasse mit Konstruktor */
class Pet {

	/* Ein Konstruktor hat keinen Rückgabewert und heisst genau wie seine Klasse */
	public Pet(String name, String species, int age) {
		/* Im Konstruktor werden typischerweise die Instanzvariablen initialisiert */
		this.name 		= name;
		this.species 	= species;
		this.age 		= age;
	}
	
	String name;
	String species;
	int age;
	
}

public class Petholder {
	public static void main(String[] args) {
		/* Der default-Konstruktor existiert nicht mehr, weil wir einen eigenen geschrieben haben */
//		Pet cat = new Pet();
		
		/* Aufruf des Konstruktors mit drei Argumenten */
		Pet cat = new Pet("Katti", "Katze", 5);
		Pet dog = new Pet("Bello", "Hund", 4);
		
		System.out.println(cat.name);
		System.out.println(cat.species);
		System.out.println(cat.age);
		System.out.println(dog.name);
		System.out.println(dog.species);
		System.out.println(dog.age);
				
	}	
}


