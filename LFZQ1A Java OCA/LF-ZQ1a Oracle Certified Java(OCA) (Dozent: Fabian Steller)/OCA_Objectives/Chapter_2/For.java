package chapter_2;

// Die for-Schleife ist ebenfalls eine "kopfgesteuerte" Schleife
// Sie unterscheidet sich von der while-Schleife durch die Verwendung der runden Klammer

public class For {

	public static void main(String[] args) {
		// typische for-Schleife
		for (int i = 0; i < 10; i++) {
			System.out.println("Zählen...");
		}
		
		// Die Schleife hat 3 statements in der runden Klammer
		// Das erste statement wird genau einmal ausgeführt, bevor die Schleife beginnt
		// Das zweite statement wird vor jeder Iteration der Schleife ausgeführt (Bedingung)
		// Das dritte statement wird nach jeder Iteration der Schleife ausgeführt
		// Die 3 statement sind aber optional:
		
		for (/*optional*/;/*optional*/;/*optional*/) { // Diese Schleife ist endlos, Bedinung wird als true angenommen
			break;
		}
		
		// Die Semikola sind NICHT optional, es müssen genau 2 sein
		
//		for () {										// Kompiliert nicht, keine Semikola
//			
//		}
		
//		for (;) {										// Kompiliert nicht, nur 1 Semikolon
//			
//		}
		
//		for (;;;) {										// Kompiliert nicht, 3 Semikola
//			
//		}
		
		// Es können beliebig viele der 3 optionalen statements verwendet werden
		// Ihre Bedeutung ist aber fest und ändert sich nicht
		// Das mittlere statement MUSS zu einem boolean evaluiert werden
		
//		for (;System.out.println("Bedingung");) {		// Kompiliert nicht, Bedingung ist kein boolean
//			
//		}
		
		int a = 10;
		for (;a > 9;) {									// Ok, Bedingung ist boolean
	
		}
		
		// Das erste statement kann im Prinzip jede beliebige Anweisung beinhalten
		// Deklaration einer Variable, Zuweisung, oder Methodenaufruf
		// Das erste statement wird auch ausgeführt, wenn die Schleife nie startet
		for (System.out.println("Loop startet");a < 10;) {		// Ok, wird genau einmal ausgegeben
			
		}
		
		// Das letzte statement darf eine beliebige Anweisung enthalten, solange es
		// KEINE Variablendeklaration ist
		// Es wird erstmals NACH der ersten Iteration der Schleife ausgeführt, und dann nach jeder
		// weiteren Iteration
//		for (;;int b = 10) {									// Kompiliert nicht, darf keine Variable deklarieren
//			
//		}
		
		for (;a == 5;System.out.println("Loop hat eine Ausführung beendet")) {	// Ok!
			
		}
		
		// Es gelten die selben Regeln wie bei while was die runde Klammer und den Block {} angeht
		
//		for ;; {												// Kompiliert nicht, Klammer fehlt
//			
//		}
		
		for (;a > 0;) 
			System.out.println("In der Schleife");				// Ok, Schleife wird durch Semikolon beendet
		
		// Die for-Schleife kann mehr als eine Zählvariable verwenden
		for (int x = 1, y = 0; y < x; y++, x--) {
			
		}
		
		// Die for-Schleife darf keine Zählvariable deklarieren, wenn diese im selben Scope
		// bereits existiert
//		for (int a = 0;;) {										// Kompiliert nicht, a existiert bereits
//			
//		}
		
		// x ist nicht mehr in Scope, kann also neu deklariert werden
		for (int x = 10;x > 0;x--) {
			
		}
		
		// Bei Schleifen ohne Block {} ist der Scope schwer zu erkennen
		for (int x = 10;;)
				System.out.println(x);							// Ok
//				System.out.println(x);							// Kompiliert nicht, x nicht mehr in Scope

	}

}

// Für die Prüfung:
// 1. Die for-Schleife ist kopfgesteuert
// 2. Nach dem for MUSS eine runde Klammer folgen
// 3. Die runde Klammer darf nicht leer sein, sie MUSS wenigstens genau zwei Semikola enthalten
// 4. Vor dem ersten Semikolon darf eine beliebige Anweisung stehen, diese wird vor Beginn der
// Schleife genau einmal ausgeführt - auch wenn die Schleife nicht anläuft
// 5. Vor dem zweiten Semikolen darf NUR ein boolean stehen - ist dieser Teil leer, gilt die
// Bedingung der Schleife als "true". Die Bedingung wird VOR jeder Iteration geprüft.
// 6. Hinter dem zweiten Semikolon darf eine beliebige Anweisung stehen, solange es sich nicht
// um die Deklaration einer Variable handelt. Diese wird NACH jeder Iteration der Schleife ausgeführt.
// 7. Das erste statement darf mehrere Variablen, per Kommata getrennt, deklarieren
// 8. Das letzte statement darf mehrere Variablen, per Kommata getrennt, neu zuweisen! Dies ist eine
// Ausnahmeregel, weil die Syntax normalerweise nicht erlaubt ist
// 9. Der Block {} ist optional - gibt es keinen, wird die Schleife durch das nächste Semikolon beendet