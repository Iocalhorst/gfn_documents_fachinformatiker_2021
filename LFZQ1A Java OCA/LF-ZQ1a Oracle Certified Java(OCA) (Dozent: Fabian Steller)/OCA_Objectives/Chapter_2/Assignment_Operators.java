package chapter_2;

// Der Zuweisungsoperator ist das =
// Außerdem gibt es eine Reihe von zusammengesetzen Zuweisungsoperatoren:
// +=, -=, /=, *=, %=
// Diese kombinieren jeweils eine Neuzuweisung mit einer arithmetischen Operation
// a += b ist identisch zu a = a + b usw.

public class Assignment_Operators {

	public static void main(String[] args) {
		// Zuweisungen erfordern immer als linken Operanden eine Variable!
		int a = 10;
//		10 = a;									// Nein! 10 kann nicht neu zugewiesen werden
		
		// Der rechte Operand kann ein Literal, eine Variable, ein Ausdruck, oder ein Methodenaufruf
		// mit Rückgabewert sein. Der zuzuweisende Wert muss dabei mit dem Typ der Variable kompatibel sein.
		
		// Die Folgenden Zeilen sind gültige Zuweisungen, deren Ergebnis dem Datentyp int entspricht
		int b = 50;
		b = a; 
		b = a * a;
		b = Integer.parseInt("1");
		
		// Zuweisungen können an unerwarteten Orten auftauchen
		// Das Ergebnis einer Zuweisung ist der Zugewiesene Wert
		System.out.println(b = 10);				// 10
		
		// Folgendes Beispiel kann verwirren:
		boolean c = false;
		if (c = true) {							// Ergebnis der Klammer ist true, weil true zugewiesen wird!
			System.out.println("Immer true!");
		} 
		
		// Für Referenzvariablen gilt, dass das referenzierte Objekt von der selben Klasse sein muss
		// wie die Referenzvariable, oder aber von einer Subklasse 
		String d = new String("");									// Ok
		d = null;													// null geht immer für Referenzen
//		d = new Object();											// Object ist KEINE Subklasse von String

		Object e = new String("Ist ein Object");					// String IST eine Subklasse von Object
		
		// Die zusammengesetzen Zuweisungsoperatoren beinhalten eine arithmetische Operation
		// Sie funktionieren daher nur mit Zahlen
		// Die einzige Ausnahme bildet wiederum += (geht auch mit Strings)
		int f = 10;
		f += 10;													// Lies: f = (int) (f + 10)
		
		// Ähnlich wie bei Inkrementer/Dekrementor beinhalten diese Zuweisungen bereits einen
		// expliziten Cast
		byte g = 1;
//		g = g + 2;													// Geht nicht ohne Cast
		
		g += 2;														// Cast schon beinhaltet
		
		// Mit Strings:
		String h = "Hello ";
		h += "World";
		System.out.println(h);										// Hello World
		
		// Die zusammengesetzten Zuweisungsoperatoren können Variablen nicht initialisieren
//		int i += 10;												// Kompiliert nicht, i hat noch
																	// keinen Wert bekommen
		
		// Merke, dass auch Kettenzuweisungen gültig sind:
		int i;
		int j;
		i = j = 5;													// i und j bekommen beide die 5
		i += j += 10;												// Lies: j = j + 10; i = i + j;						
		System.out.println(i);										// 20
		System.out.println(j);										// 15
	}

}

// Für die Prüfung:
// 1. Unterscheide immer zwischen = (Zuweisung) und == (Vergleich)
// 2. Links des Zuweisungsoperators darf nur eine Variable stehen 
// 3. Rechts des Zuweisungsoperators ist jeder beliebige Ausdruck erlaubt, dessen Ergebnis mit
// der Variable links zuweisungskompatibel ist
// 4. Zuweisungen sind grundsätzlich überall zulässig
// 5. Zusammengesetzte Zuweisungsoperatoren beinhalten einen expliziten Cast - daher kann es
// zum overflow/underflow kommen (z.B. byte a = 120; a += 10;) 
// 6. Bei Kettenzuweisungen immer von rechts nach links auswerten!