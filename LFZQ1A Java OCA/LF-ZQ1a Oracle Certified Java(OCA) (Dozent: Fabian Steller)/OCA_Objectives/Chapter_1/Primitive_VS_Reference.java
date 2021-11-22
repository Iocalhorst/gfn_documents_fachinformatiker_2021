package chapter_1;

import java.util.Scanner;

// Im Folgenden geht es um die elementaren Unterschiede zwischen den zwei 
// Typen von Variablen: Referenzvariablen und primitive Variablen
// Referenzvariablen zeigen auf einen Speicherort, wo ein Objekt liegt (oder sind null)
// Primitive Variablen enthalten direkt einen literalen Wert (eine Binärzahl)

public class Primitive_VS_Reference {

	public static void main(String[] args) {
		// primitive Variablen - erkennbar am Datentyp
		int number = 100;
		boolean flag = false;
		
		// Referenzvariablen - erkennbar am Datentyp, der einer Klasse entspricht
		String word = "Hello";
		Scanner sc = new Scanner(System.in);
		
		// NUR Referenzvariablen akzeptieren den Wert null
//		word = null;								// Ok, Variable zeigt nicht länger auf ein Objekt
//		number = null;								// Kompilierfehler, weil ein int nicht null sein darf
		
		// NUR Referenzvariablen dürfen den . als Operator verwenden
		word.charAt(0);								// Ok, ruft Methode auf dem Objekt auf - kann allerdings NullPointerException werfen
//		flag.toString();							// Kompilierfehler, weil der Punkt als Operator hier nicht gültig ist
		
		// Die meisten anderen Operatoren wie +, -, *, / funktionieren nur mit Zahlen!
		// Die Klasse String hat allerdings eine spezielle Überladung für das +
		
		// Ein entscheidender Unterschied besteht auch, wenn wir Variablen als Argument verwenden
		takePrimitive(number);						// Übergibt eine Kopie der Zahl in der Variable
		System.out.println(number);					// 100  
		
		Mutable m = new Mutable();
		System.out.println(m.getString());
		takeReference(m);							// Übergibt eine Kopie der Referenz (zeigt auf das SELBE Objekt)					
		System.out.println(m.getString());
		
		// Ein weiterer Unterschied besteht beim Vergleichen mit ==
		// Vergleichen zweier Zahlen vergleicht den Zahlenwert
		// Vergleichen zweier Referenzen vergleicht die Referenz
	}
	
	public static void takePrimitive(int x) {
		x++;										// Die Veränderung der Variable x wirkt sich nicht auf die Variable aus
													// welche als Argument verwendet wurde!!
	}
	
	public static void takeReference(Mutable m) {	// Methode kann das Objekt direkt verändern, wenn es mutable ist!
		m.setString("String wurde verändert");
	}
	
	

}

// Mutable Class
class Mutable {
	private String string = "Veränderbarer String";
	
	public void setString(String arg) {
		string = arg;
	}
	public String getString() {
		return string;
	}
}

// Für die Prüfung:
// 1. Alle Referenzvariablen dürfen als Wert null bekommen, primitive Variablen niemals
// 2. Der Punkt-Operator ist mit primitiven Variablen unzulässig
// 3. Rechnerische Operationen sind mit Referenzvariablen unzulässig (Ausnahme String und +)
// 4. Primitive Werte und immutable Objects ändern sich nur, wenn ihre Variable neu zugewiesen wird (++ ist auch Neuzuweisung)
// 5. Mutable Objects ändern sich evtl. ohne Neuzuweisung