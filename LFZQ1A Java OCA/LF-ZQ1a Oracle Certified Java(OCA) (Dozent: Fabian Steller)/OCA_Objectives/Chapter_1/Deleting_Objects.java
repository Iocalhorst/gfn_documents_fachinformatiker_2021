package chapter_1;

// Wann und in welchem Fall werden Objekte gel�scht?
// In Java lautet die Antwort auf diese Frage stets: "Wir wissen es nicht"

public class Deleting_Objects {

	public static void main(String[] args) {
		// Objekt wird erzeugt
		Garbage g = new Garbage();
		
		// Solange die Referenz auf das Objekt in der Variable g gespeichert bleibt, wird es im Speicher (Heap) verweilen
		for (int i = 0; i < 10000; i++) {
			System.out.println("Java is busy");
		}
		
		// Nach der (sinnlosen) Schleife wird das Objekt immer noch da sein!
		System.out.println(g);							// Gibt Hashwert f�r die Objektreferenz aus
		
		// Objekt bleiben erhalten, so lange mindestens eine g�ltige Variable auf das Objekt zeigt!
		Garbage h = g;									// Kopiert die Referenz
		g = null;										// Variable g zeigt nicht mehr auf das Objekt
		
		// Das Objekt lebt noch! Es wird weiterhin �ber die Variable h referenziert
		// Jetzt geben wir die Referenz in eine Methode...
		doStuff(h);
		h = null;										// Variable h zeigt nicht mehr auf das Objekt
		
		// An dieser Stelle wissen wir nicht, ob das Objekt noch lebt oder schon verstorben ist!
		// Sicher ist nur, dass wir jetzt nicht mehr daran herankommen - es k�nnte jederzeit gel�scht werden
		
		// Es ist m�glich, die Garbage Collection per Methode anzufordern - aber das hei�t nicht, dass sie auch aktiv wird
		// In aller Regel funktioniert der Aufruf wie erwartet 
		for (int i = 0; i < 1000; i++) {
			new Garbage();								// 1000 Garbage-Objekte werden erzeugt
		}
		System.gc();									// 0-1000 Garbage-Objekte werden gel�scht
		
		
	}
	
	public static void doStuff(Garbage g) {
		System.out.println("Method received Object" + g);
		// Am Ende der Methode verf�llt die lokale Referenz g
	}

}

class Garbage {
	// Um zu sehen, ob das Objekt gel�scht wird, k�nnen wir die Methode finalize (geerbt aus Object) �berschreiben
	// Diese Methode wird von der Garbage Collection f�r jedes Objekt einmal aufgerufen direkt bevor sie es l�scht
	@Override
	public void finalize() {
		System.out.println("Object being deleted...");
	}
}

// F�r die Pr�fung:
// 1. Objekte verweilen im Speicher, solange eine g�ltige Referenz auf das Objekt besteht
// 2. Objekte k�nnen jederzeit von der GC gel�scht werden, sobald keine g�ltige Referenz mehr darauf besteht
// 3. Objekte k�nnen NICHT manuell per Befehl gel�scht werden
// 4. Mit System.gc() kann die Garbage Collection angefordert werden - es ist aber nicht sicher, dass sie auch aktiv wird
// 5. L�scht die GC ein Objekt, ruft sie direkt davor die Methode finalize() darauf auf
// 6. Die Methode finalize() wird von der GC h�chstens einmal f�r jedes Objekt aufgerufen
