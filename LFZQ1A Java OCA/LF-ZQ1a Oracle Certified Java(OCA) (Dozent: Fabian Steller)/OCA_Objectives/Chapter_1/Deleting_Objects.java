package chapter_1;

// Wann und in welchem Fall werden Objekte gelöscht?
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
		System.out.println(g);							// Gibt Hashwert für die Objektreferenz aus
		
		// Objekt bleiben erhalten, so lange mindestens eine gültige Variable auf das Objekt zeigt!
		Garbage h = g;									// Kopiert die Referenz
		g = null;										// Variable g zeigt nicht mehr auf das Objekt
		
		// Das Objekt lebt noch! Es wird weiterhin über die Variable h referenziert
		// Jetzt geben wir die Referenz in eine Methode...
		doStuff(h);
		h = null;										// Variable h zeigt nicht mehr auf das Objekt
		
		// An dieser Stelle wissen wir nicht, ob das Objekt noch lebt oder schon verstorben ist!
		// Sicher ist nur, dass wir jetzt nicht mehr daran herankommen - es könnte jederzeit gelöscht werden
		
		// Es ist möglich, die Garbage Collection per Methode anzufordern - aber das heißt nicht, dass sie auch aktiv wird
		// In aller Regel funktioniert der Aufruf wie erwartet 
		for (int i = 0; i < 1000; i++) {
			new Garbage();								// 1000 Garbage-Objekte werden erzeugt
		}
		System.gc();									// 0-1000 Garbage-Objekte werden gelöscht
		
		
	}
	
	public static void doStuff(Garbage g) {
		System.out.println("Method received Object" + g);
		// Am Ende der Methode verfällt die lokale Referenz g
	}

}

class Garbage {
	// Um zu sehen, ob das Objekt gelöscht wird, können wir die Methode finalize (geerbt aus Object) überschreiben
	// Diese Methode wird von der Garbage Collection für jedes Objekt einmal aufgerufen direkt bevor sie es löscht
	@Override
	public void finalize() {
		System.out.println("Object being deleted...");
	}
}

// Für die Prüfung:
// 1. Objekte verweilen im Speicher, solange eine gültige Referenz auf das Objekt besteht
// 2. Objekte können jederzeit von der GC gelöscht werden, sobald keine gültige Referenz mehr darauf besteht
// 3. Objekte können NICHT manuell per Befehl gelöscht werden
// 4. Mit System.gc() kann die Garbage Collection angefordert werden - es ist aber nicht sicher, dass sie auch aktiv wird
// 5. Löscht die GC ein Objekt, ruft sie direkt davor die Methode finalize() darauf auf
// 6. Die Methode finalize() wird von der GC höchstens einmal für jedes Objekt aufgerufen
