package chapter_1;

// Beim Initialisierungsablauf geht es um die Reihenfolge, in welcher Konstruktoren, Init-Blöcke und direkte 
// Zuweisungen von Instanzvariablen ausgeführt werden
// Zu diesem Thema gibt es Fragen in der Prüfung!
// Bei der Initialiserung spielt die Reihenfolge der Blöcke und Variablen in der Klasse eine Rolle

public class Order_Of_Initialization {

	public static void main(String[] args) {
		System.out.println("Vor der Initialisierung");		// An dieser Stelle existiert noch keine Variable nr im Speicher
		Robot rob;
//		System.out.println(rob.nr);							// Kompiliert nicht weil die Variable rob nicht initialisiert wurde
//		System.out.println(nr);								// Kompiliert nicht weil nr als Variable in diesem Kontext unbekannt ist
		rob = new Robot(2);									// Diese Zeile initialisiert die Variable rob und die Instanzvariable nr
		System.out.println(rob.nr);							// 2
		
		Drone drone = new Drone();
		System.out.println(drone.z);						// 10
	}

}

class Robot {
	
	public Robot(int nr) {
		System.out.println("Konstruktor wird ausgeführt");
		this.nr = nr;
	}
	
	int nr = 5;
	
	{ 
		System.out.println("Init-Block wird ausgeführt");
		nr = 10;
	}
	
}

// Auf die Reihenfolge von Deklaration und Zuweisung ist zu achten!

class Drone {
	
	int x = 10;
	int y = x;
	
	{
//		y = z; 				// Kompiliert nicht, weil z an dieser Stelle noch keinen Wert hat
//		z = y;				// z darf aber oberhalb der Deklaration zugewiesen werden
	}
	
	int z;
}

// So sollte eine solche Klasse eher aussehen - allerdings wird dies in der Prüfung nicht der Fall sein
// In diesem Fall gäbe es mit der Reihenfolge der Initialisierung weniger Probleme
class Scooter {
	int x;
	int y;
	int z;
	
	{
		x = 10;
		z = 20;
	}
}

// Für die Prüfung:
// 1. Instanzvariablen werden erst mit der Erzeugung eines Objektes initialisiert
// 2. Zuerst werden die Variablen und Initialisierungsblöcke in der Reihenfolge durchgegangen, in welcher
// sie in der Klasse auftauchen (oben nach unten)
// 3. Instanzvariablen, welche nicht auf einen spezifischen Wert zugewiesen wurden, bekommen ihren Standardwert (0, 0.0, null, false)
// 4. Instanzvariablen KÖNNEN NICHT vor ihrer Initialisierung verwendet werden
// 5. Instanzvariablen KÖNNEN "vor" (oberhalb) ihrer Deklaration zugewiesen werden
// 5. Zuletzt wird der Konstruktor ausgeführt
// 6. Nach Abschluss des Konstruktors sind mit Sicherheit alle Instanzvariablen der Klasse initialisiert
