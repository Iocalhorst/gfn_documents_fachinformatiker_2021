package chapter_1;

// Scope bedeutet so viel wie "Wirkungsbereich" und bezieht sich dabei auf Variablen
// Der Wirkungsbereich entscheidet sich nach dem Ort der Deklaration
// Wir unterscheiden grunds�tzlich zwischen 3 Scopes:
// 1. statisch
// 2. instanzabh�ngig
// 3. lokal

public class Scope {
	
	// statische Variablen haben den "gr��ten" Wirkungsbereich
	// die Lebensdauer von statischen Variablen reicht vom Beginn des Programmes bis zu seiner Beendigung
	// statische Variablen k�nnen grunds�tzlich von jeder Position im Code aus angesprochen werden
	public static int global;

	public static void main(String[] args) {
		// Zugriff auf statische Variable der selben Klasse
		System.out.println(global);
		
		// Auch �ber den KLassennamen kommen wir an die statische Variable heran
		System.out.println(Scope.global);
		
		// Zugriff auf die statische Variable einer anderen Klasse
		System.out.println(AnotherScope.global);
		
		// Im statischen Kontext (wir befinden uns in einer statischen Methode) stehen Instanzvariablen nicht zur Verf�gung
//		System.out.println(instanceNumber);							// Kompilierfehler, weil Variable nur mit einer Instanz verwendet werden kann
//		System.out.println(Scope.instanceNumber);					// Kompilierfehler, weil Variable nur mit einer Instanz verwendet werden kann
		Scope s = new Scope();										// Instanzvariablen werden mit dem Konstruktor ins Leben gerufen
		System.out.println(s.instanceNumber);						// korrekter Zugriff auf Instanzvariable instanceNumber
		
		// Ohne Zugriff auf die Instanz gibt es auch keine Instanzvariable mehr
		s = null;													// Instanz von Scope ist nicht mehr referenziert
		
		// F�r den Kompiler ist die Variable s weiterhin eine g�ltige Referenz
		System.out.println(s.instanceNumber);						// Kompiliert, aber wirft NullPointerException
		
		// F�r lokale Variablen gilt: g�ltig bis zur schlie�enden Klammer des Blockes in dem sie deklariert wurden
		
		if (true) {
			int x = 10;
		} else {
//			System.out.println(x);									// x ist hier schon out of Scope
		}

	}
	
	public void example() {
		// Eine nicht-statische Methode kann auch auf statische Variablen zugreifen
		System.out.println(global);
		
		// Eine nicht-statische Methode kann auf nicht-statische Variablen der selben Klasse zugreifen
		System.out.println(instanceNumber);
		
		// Funktioniert auch mit this - Kompiler w�rde sich das this ohnehin dazudenken
		System.out.println(this.instanceNumber);
	}
	
	// Instanzvariablen haben einen Scope, der Komplett von ihrer zugeh�rigen Instanz abh�ngig ist
	// Sie existieren erst, wenn eine Instanz erzeugt wird und sterben gemeinsam mit ihrer Instanz
	// Zugriff auf Instanzvariablen ist nur �ber ihre zugeh�rige Instanz m�glich
	int instanceNumber;

}

class DifferentScope {
	
	// Aus dieser Klasse ist der Zugriff auf die statische Variable global der Klasse Scope nur mit Klassennamen g�ltig
	public static void useVariables() {
		System.out.println(Scope.global);
	}
	
	public void useVariables(int x) {
		System.out.println(Scope.global);
		
	// Aus einer Instanzmethode k�nnen wir selbstverst�ndlich nicht auf Instanzvariablen anderer Klassen zugreifen
//		System.out.println(instanceNumber);						// Kompilierfehler, weil Variable zu einer anderen Klasse geh�rt
	}
	
	public void useVariables(byte x) {
//		System.out.println(global);								// Kompilierfehler, weil die Variable nicht in dieser Klasse steht
	}
	
}

class AnotherScope {

	// Mehrere statische Variablen mit dem gleichen Namen sind kein Problem, solange sie in unterschiedlichen Klassen deklariert sind
	public static int global;
}

// F�r die Pr�fung:
// 1. Der Ort der Deklaration einer Variable bestimmt ihren Wirkungsbereich
// 2. Statische Variablen existieren f�r die gesamte Laufzeit des Programmes
// 3. Statische Variablen sind grunds�tzlich �ber ihren Klassennammen anzusprechen - innerhalb der selben Klasse auch ohne Klassennammen
// 4. Es gibt keinen Kontext, in dem statische Variablen nicht angesprochen werden k�nnen (au�er sie sind nicht sichtbar)
// 5. Instanzvariablen leben und sterben mit ihrer Instanz
// 6. Instanzvariablen sind grunds�tzlich �ber ihre Instanz anzusprechen - niemals �ber den Klassennamen!
// 7. Instanzvariablen DER SELBEN Klasse k�nnen in Instanzmethoden direkt angesprochen werden (Kompiler setzt "this" ein)
// 8. Lokale Variablen sind ansprechbar, bis ihr Block geschlossen wird (meist an der Klammer {} erkennbar)
// 9. Lokale Variablen d�rfen keine Bezeichner verwenden, die von einer anderen lokalen Variable, welche noch g�ltig ist, bereits belegt sind
//10. Lokale Variablen D�RFEN Bezeichner verwenden, welche innerhalb der SELBEN Klasse bereits von Instanz- oder statischen Variablen verwendet werden (�berschattung)
//11. Instanzvariablen und statische Variablen m�ssen in ihrem Bezeichner nur f�r die jeweilige Klasse einzigartig sein
