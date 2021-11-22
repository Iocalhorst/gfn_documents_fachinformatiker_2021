package chapter_2;

// Die while-Schleife ist eine "kopfgesteuerte" Schleife
// Das bedeutet, die Schleife wird erstmals ausgeführt, nachdem die
// Bedingung zu true evaluiert wurde

public class While {

	public static void main(String[] args) {
		int a = 5;
		while (a>0) {									// Schleife startet nur, wenn die Klammer true ergibt
			// Body wird wiederholt ausgeführt
			System.out.println("Schäfchen zählen...");
			a--;
		} 	// Am Ende der Schleife geht es wieder nach oben, und die Bedingung wird erneut ausgewertet
			// Hier geht es weiter, sobald die Bedingung der Schleife false ergibt
		
		// Endlosschleifen sind grundsätzlich erlaubt
//		while (true) {
//			// Sofern die Schleife nicht manuell abgebrochen wird, endet sie nicht...
//		}
		
		// Schleifen, welche offensichtlich niemals starten, sind nicht erlaubt
		// Das ist nur der Fall, wenn die Schleife einen konstanten Ausdruck als Bedingung verwendet
//		final boolean b = false;
//		while (b) {								// Kompiliert nicht, weil b immer false ist
//			
//		}
		
		// Davon abgesehen gelten genau die gleichen Regeln wie für das if:
		
//		while a < 5 {							// Kompiliert nicht, Klammer fehlt
//			
//		}
		
//		while () {								// Kompiliert nicht, Klammer ist leer
//			
//		}
		
//		while ("true") {						// Kompiliert nicht, Klammer enthält keinen boolean
//			
//		}
		
		// Achtung: Zuweisungen in der Klammer für die Bedingung sind gestattet, sofern
		// es sich dabei um einen boolean handelt!
		boolean b = false;
		while (b = true) {						// b wird auf true zugewiesen, Schleife ist endlos
			
		}
		
		// In der Bedingung dürfen keine Variablen deklariert werden
//		while (boolean c = true) {				// Kompiliert nicht, darf keine Variable deklarieren
//			
//		}
		
		// Ebenso wie bei der Verzweigung, ist der Block {} optional
		while (b) 
			System.out.println("Schleife läuft");		// Semikolon beendet den Schleifen-body
		System.out.println("Schleife beendet");			// Nach der Schleife
	}

}

// Für die Prüfung:
// 1. Die kopfgesteuerte while-Schleife kann 0-mal ausgeführt werden
// 2. Die Schleife läuft, bis die Bedingung zu "false" evaluiert wird
// 3. Schleifen können endlos laufen
// 4. Konstante Ausdrücke, welche "false" ergeben, sind als Bedingung NICHT gestattet
// 5. Auf das while keyword MUSS eine runde Klammer folgen, diese darf nicht leer sein
// 6. Die runde Klammer MUSS zu einem boolean evaluiert werden
// 7. Der Block {} ist optional
// 8. Hat die Schleife keinen Block, kann sie maximal eine Anweisung enthalten (bis zum Semikolon)
