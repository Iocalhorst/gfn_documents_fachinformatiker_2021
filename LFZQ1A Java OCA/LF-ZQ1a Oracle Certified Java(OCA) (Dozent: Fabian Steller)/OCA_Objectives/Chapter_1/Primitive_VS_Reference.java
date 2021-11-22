package chapter_1;

import java.util.Scanner;

// Im Folgenden geht es um die elementaren Unterschiede zwischen den zwei 
// Typen von Variablen: Referenzvariablen und primitive Variablen
// Referenzvariablen zeigen auf einen Speicherort, wo ein Objekt liegt (oder sind null)
// Primitive Variablen enthalten direkt einen literalen Wert (eine Bin�rzahl)

public class Primitive_VS_Reference {

	public static void main(String[] args) {
		// primitive Variablen - erkennbar am Datentyp
		int number = 100;
		boolean flag = false;
		
		// Referenzvariablen - erkennbar am Datentyp, der einer Klasse entspricht
		String word = "Hello";
		Scanner sc = new Scanner(System.in);
		
		// NUR Referenzvariablen akzeptieren den Wert null
//		word = null;								// Ok, Variable zeigt nicht l�nger auf ein Objekt
//		number = null;								// Kompilierfehler, weil ein int nicht null sein darf
		
		// NUR Referenzvariablen d�rfen den . als Operator verwenden
		word.charAt(0);								// Ok, ruft Methode auf dem Objekt auf - kann allerdings NullPointerException werfen
//		flag.toString();							// Kompilierfehler, weil der Punkt als Operator hier nicht g�ltig ist
		
		// Die meisten anderen Operatoren wie +, -, *, / funktionieren nur mit Zahlen!
		// Die Klasse String hat allerdings eine spezielle �berladung f�r das +
		
		// Ein entscheidender Unterschied besteht auch, wenn wir Variablen als Argument verwenden
		takePrimitive(number);						// �bergibt eine Kopie der Zahl in der Variable
		System.out.println(number);					// 100  
		
		Mutable m = new Mutable();
		System.out.println(m.getString());
		takeReference(m);							// �bergibt eine Kopie der Referenz (zeigt auf das SELBE Objekt)					
		System.out.println(m.getString());
		
		// Ein weiterer Unterschied besteht beim Vergleichen mit ==
		// Vergleichen zweier Zahlen vergleicht den Zahlenwert
		// Vergleichen zweier Referenzen vergleicht die Referenz
	}
	
	public static void takePrimitive(int x) {
		x++;										// Die Ver�nderung der Variable x wirkt sich nicht auf die Variable aus
													// welche als Argument verwendet wurde!!
	}
	
	public static void takeReference(Mutable m) {	// Methode kann das Objekt direkt ver�ndern, wenn es mutable ist!
		m.setString("String wurde ver�ndert");
	}
	
	

}

// Mutable Class
class Mutable {
	private String string = "Ver�nderbarer String";
	
	public void setString(String arg) {
		string = arg;
	}
	public String getString() {
		return string;
	}
}

// F�r die Pr�fung:
// 1. Alle Referenzvariablen d�rfen als Wert null bekommen, primitive Variablen niemals
// 2. Der Punkt-Operator ist mit primitiven Variablen unzul�ssig
// 3. Rechnerische Operationen sind mit Referenzvariablen unzul�ssig (Ausnahme String und +)
// 4. Primitive Werte und immutable Objects �ndern sich nur, wenn ihre Variable neu zugewiesen wird (++ ist auch Neuzuweisung)
// 5. Mutable Objects �ndern sich evtl. ohne Neuzuweisung