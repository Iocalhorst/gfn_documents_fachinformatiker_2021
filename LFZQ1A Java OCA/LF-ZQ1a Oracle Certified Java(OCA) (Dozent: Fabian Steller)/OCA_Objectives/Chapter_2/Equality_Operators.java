package chapter_2;

import java.util.Date;

// Die Gleichheitsoperatoren in Java sind == und !=
// Sie haben zwei Operanden und geben einen boolean heraus
// Diese Operatoren funktionieren mit allen Datentypen, aber die Operanden m�ssen 
// kompatibel und vergleichbar sein

public class Equality_Operators {

	public static void main(String[] args) {
		// Primitive Zahlentypen k�nnen ohne Einschr�nkung miteinander verglichen werden
		int a = 10;
		byte b = 10;
		System.out.println(a == b);									// true - 10 ist gleich 10
		
		double c = 10.0;
		System.out.println(a == c);									// true - 10 ist gleich 10.0
		
		// booleans k�nnen nur mit anderen booleans gleich sein!
		boolean d = true;
//		System.out.println(a == d);									// Kompiliert nicht!
		
		boolean e = true;
		System.out.println(d == e);									// true - true ist gleich true
		
		// Achtung:
		// Komplexere Ausdr�cke k�nnen verwirrend wirken!
		// In folgendem Beispiel ist der Vergleich gestattet, weil sich sowohl links als auch rechts
		// des ersten Gleichheitsoperators booleans befinden (in der Klammer sind es zwei Zahlen)
		System.out.println(d == (a == b));	
		
		// Ohne Klammer ist der Ausdruck nicht gestattet, weil jetzt zun�chst boolean mit int
		// verglichen w�rde
//		System.out.println(d == a == b);
		
		// Vergleichen von Referenzvariablen ist etwas anders:
		// Zwei Referenzvariablen sind NUR dann gleich, wenn sie auf das selbe Objekt im Speicher deuten
		Object f = new Object();
		Object g = f;
		System.out.println(f == g);									// true
		
		g = new Object();
		System.out.println(f == g);									// false
		
		Object h = new Date();
		Date i = (Date)h;
		System.out.println(h == i);									// true!
		
		// Vergleich ist nur bei Klassen in einer Vererbungshierarchie g�ltig
		String j = "Gleich?";
//		System.out.println(j == i);									// Kompiliert nicht, weil
																	// String und Date nicht verwandt sind
		
		// Gleichheit von Strings ist wieder komplizierter:
		String k = "Hello!";
		String l = "Hello!";
		System.out.println(k == l);									// true - ein und dasselbe Objekt!
		
		l = new String("Hello!");
		System.out.println(k == l);									// false - nicht dasselbe Objekt
		
		// Der Gleichheitsoperator ist bei Strings nur bedingt sinnvoll 
		// Strings haben einen eigenen Speicherbereich auf dem Heap und verhalten sich anders als
		// andere Klassen
		// Um Strings sinnvoll zu Vergleichen, k�nnen wir die Methode equals() verwenden
		System.out.println(l.equals(k));							// true - beide Strings haben die
																	// Zeichenfolge "Hello!"
		
		// Die Methode equals() stammt aus der Klasse Object - sie steht daher in allen Klassen
		// zur Verf�gung
		Equality m = new Equality();
		Equality n = new Equality();
		System.out.println(m.equals(n));							// false - zwei Objekte
		System.out.println(m == n);									// false - zwei Objekte
		// Die Methode equals() vergleicht in ihrer Standardausf�hrung die Referenzen -
		// genauso wie der Gleichheitsoperator! Sie muss �berschrieben werden, wenn sie
		// etwas anderes tun soll
	}

}

// Eigene Klasse um die equals() - Methode zu demonstrieren
class Equality {
	
}

// F�r die Pr�fung:
// 1. Die Gleichheitsoperatoren == und != vergleichen zwei Operanden und geben einen boolean heraus
// 2. Sind die Operanden nicht vergleichbar, gibt es einen Kompilierfehler
// 3. Alle Zahlen sind miteinander vergleichbar - aber nicht mit anderen Typen
// 4. Booleans sind nur mit booleans vergleichbar
// 5. Referenzvariablen sind vergleichbar, wenn die deklarierten Typen beider Operanden 
// in einer Vererbungshierarchie stehen 
// 6. Bei Referenzvariablen wird die Objektreferenz verglichen - es kommt nur "true" heraus,
// wenn beide Variablen auf ein und dasselbe Objekt zeigen
// 7. Vergleiche zwischen Strings mit dem Gleicheitsoperator sind fehleranf�llig, weil nicht
// offensichtlich ist, ob es sich um ein oder zwei Objekte handelt
// 8. Strings k�nnen inhaltlich mit der Methode equals() verglichen werden
// 9. Alle Klassen haben eine equals()-Methode, aber sie muss �berschrieben werden, damit sie
// etwas anderes tut als der Gleichheitsoperator (f�r Strings wurde sie �berschrieben)
