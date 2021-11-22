package Chapter_3;

// Zu jedem primitiven Datentyp gibt es eine passende Wrapper-Klasse
// Aufgabe einer solchen Klasse ist es, einen primitiven Wert als Objekt darzustellen
// Variablen vom Typ einer Wrapper-Klasse sind also Referenzvariablen
// Die Wrapper-Klassen hei�en:
// Byte
// Short
// Character
// Integer
// Long
// Float
// Double
// Boolean
// Alle Wrapper-Klassen au�er Boolean haben die gemeinsame Elternklasse Number

public class Wrapper_Classes {

	public static void main(String[] args) {
		// Wrapper-Klassen sind mit ihren primitiven Typen weitestgehend kompatibel
		// Wir k�nnen daher einfach Literale zuweisen, wenn Variablen vom Typ einer
		// Wrapper-Klasse initialisiert werden.
		Integer a = 10;
		Byte b = 50;
		// An dieser Stelle greift das sogennante "Autoboxing"
		// Es wird automatisch ein Objekt der Wrapper-Klasse erzeugt
		// Zeile 23 k�nnen wir uns so vorstellen:
		// Integer a = Integer.valueOf(10);
		// Grunds�tzlich gilt, dass �berall dort wo ein primitive erwartet wird, auch ein Objekt
		// seiner Wrapper-Klasse akzeptabel ist, und umgekehrt.
		// Ein int kann also als Integer verwendet werden - und ein byte kann als int verwendet werden.
		// Bedauerlicherweise folgt daraus NICHT, dass ein byte als Integer verwendet werden kann.
		byte c = 0;
		int d = c;							// Lies: int d = (int)c;
		a = d;								// Lies: a = Integer.valueOf(d);

		// Betrachten wir nun folgende Zeile, welche nicht kompiliert:
//		a = c;								
		// Damit sie kompiliert, m�sste der Kompiler daraus folgendes machen:
		a = Integer.valueOf((int)c);
		// Leider ist ihm das zu viel, und er verweigert die Arbeit. 
		// Grunds�tzlich gilt, dass der Kompiler nicht Autoboxing und einen impliziten Cast in
		// einer Anweisung anwenden wird.
		// Es reicht aus, einen Teil der Anweisung explizit zu machen:
		a = (int)c;							// Ok, Kompiler f�gt Integer.valueof() hinzu
		a = Integer.valueOf(c);				// Ok, Kompiler f�gt cast von c auf int hinzu
		
		// Bedenke, dass ein impliziter Cast immer nur von einem kleineren zu einem gr��eren
		// Primitive m�glich ist.
		
		// Alle Wrapper-Klassen au�er dem Character haben genau zwei Konstruktoren, welche
		// eigentlich �berfl�ssig sind. Sie werden von der valueOf() Methode ersetzt.
		// Einen Konstruktor, der einen String akzeptiert, und einen, welcher einen passenden
		// primitive akzeptiert.
		a = new Integer("10");			
		a = new Integer(10);
		// Beim Konstruktor mit einem String gilt grunds�tzlich, dass es zu einer NumberFormatException
		// oder IllegalArgumentException kommen kann.
		// Die Klasse Character hat nur einen Konstruktor, der einen char erwartet.
		Character e = new Character('g');
	}

}
