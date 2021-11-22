package chapter_1;

// Objekte sind Instanzen von Klassen 
// Zum Erzeugen von Objekten dient das Keyword "new"
// In Einigen Ausnahmefällen (String, Arrays) werden Objekte evtl. ohne new erzeugt
// Beim Erzeugen eines Objektes wird ein Konstruktor ausgeführt
// Ein Konstruktor ist eine spezielle Methode, die typischerweise verwendet wird, um Instanzvariablen zu setzen
// Jede Klasse (auch abstrakte Klassen) hat mindestens einen Konstruktor (kann aber mehrere haben - Überladung)
// Über den Konstruktoraufruf werden die Instanzvariablen der Klasse initialisiert
// Es ist auch möglich, eigene Initialisierungsblöcke für die Instanzvariablen zu schreiben

public class Creating_Objects {

	public static void main(String[] args) {
		// In der folgenden Zeile passieren 3 wichtige Dinge:
		// 1. Eine Variable wird im Speicher erzeugt und über den Bezeichner rabbit verfügbar gemacht
		// 2. Der Konstruktor ohne Argumente der Klasse Rabbit wird aufgerufen und erzeugt ein Rabbit-Objekt im Speicher
		// 3. In die Variable rabbit wird die "Adresse" des Rabbit-Objektes im Speicher geschrieben
		Rabbit rabbit = new Rabbit();
		
		// Die Klasse Rabbit kann nur ohne Argumente instanziiert werden
//		rabbit = new Rabbit("Klopfer");			Kompiliert nicht weil Klasse keinen Konstruktor mit String-Parameter hat
		
		// Die Klasse Rat kann NUR mit einem String-Argument erzeugt werden
		Rat rat = new Rat("Ratatouille");
//		rat = new Rat();						Kompiliert nicht weil Klasse keinen no-args Konstruktor hat
		
		// Instanzvariablen eines Objektes werden IMMER mit der Objektreferenz (in diesem Fall rat) angesprochen
		// Dies funktioniert nur, solange die Instanzvariable nicht private ist
		System.out.println(rat.name);			// Auslesen der Instanzvariable - "Ratatouille"
		
		rat.name = "Henry";						// Schreiben der Instanzvariable - das Objekt ändert seinen Namen
		System.out.println(rat.name);			// "Henry" - der Name "Ratatouille" ist nicht mehr vorhanden
		
		Rat rat2 = new Rat("Gisela");			// Ein zweites Rat-Objekt wird erzeugt
		
		// Beide Rat-Objekte sind einzigartig und voneinander verschieden - sie haben ihre eigenen Namen
		System.out.println(rat.name);			// "Henry"
		System.out.println(rat2.name);			// "Gisela"
		
		// Referenzvariablen können ebenso wie alle anderen Variablen (sofern nicht final) neu zugewiesen werden
		rat = rat2;								// Kopiert die Referenz aus der Variable rat2 in die Variable rat
		
		// Fortan verweisen beide Variablen auf genau das selbe Objekt
		System.out.println(rat.name);			// "Gisela"
		System.out.println(rat2.name);			// "Gisela"
	}

}

// Klasse ohne sichtbaren Konstruktor - kann trotzdem Instanziiert werden über den default Konstruktor 
class Rabbit {
	
	
}

// Klasse mit leerem Konstruktor (no-args) - aber kein default Konstruktor (weil nicht automatisch hinzugefügt)
class Hare {
	
	// Konstruktor trägt den Namen der Klasse und hat keinen Rückgabetyp
	public Hare() {
		
	}
}

// Klasse mit Instanzvariablen und Konstruktor, um diese zu setzen - Klasse hat keinen default-Konstruktor
class Rat {
	
	String name;
	
	public Rat(String name) {
		this.name = name;
	}
}

// Klasse mit Initialisierungsblock 

class Fawn {
	
	String name;
	
	// Initialisierungsblock - wird ebenfalls wie der Konstruktor immer ausgeführt wenn ein Objekt erzeugt wird
	{
		name = "Bambi";
	}
}

// Für die Prüfung:
// 1. Jede Klasse hat mindestens einen Konstruktor (auch abstrakte Klassen und Enums, aber NICHT Interfaces)
// 2. Gibt eine Klasse keinen Konstruktor in ihrem Body an, bekommt sie einen default Konstruktor (leer, ohne Argumente)
// 3. Gibt eine Klasse mindestens einen Konstruktor in ihrem Body an, bekommt sie KEINEN default Konstruktor
// 4. Ein Konstruktor MUSS genau so heißen wie seine Klasse (inkl. groß/klein) und DARF KEINEN Rückgabetyp deklarieren
// 5. Eine Methode (mit Rückgabetyp) mit dem selben Namen wie die Klasse ist gültig, aber kein Konstruktor
// 6. Konstrukoren werden grundsätzlich mit dem Keyword new aufgerufen 
// 7. Objekte müssen über eine Referenzvariable erreichbar sein, um verwendet werden zu können
// 8. Referenzvariablen enthalten die Adresse eines Objektes im Speicher (oder null) - nicht das Objekt selbst
