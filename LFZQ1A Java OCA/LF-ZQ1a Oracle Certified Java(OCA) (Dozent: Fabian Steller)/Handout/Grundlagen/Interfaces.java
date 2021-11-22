package myPackage;

/* Ein Interface ist eine Art abstrakter Klasse -
 * es dient der Umgehung der Einfachvererbung */

public class Interfaces {

	public static void main(String[] args) {
		/* Konstanten aus Interfaces ansprechen */
		System.out.println(Z�hlbar.x);			/* 100 */
//		Z�hlbar.x = 150;						/* Darf Konstante nicht neu zuweisen */
		
		/* Instanz der implementierenden Klasse erzeugen */
		Geld geld = new Geld();
		/* Auch �ber die Instanz k�nnen die Konstanten angesprochen werden */
		System.out.println(geld.z);				/* 300 */
		/* Geht auch �ber die implementierende Klasse selbst */
		System.out.println(Geld.z);				/* 300 */
		
		/* Die geerbten Instanzmethoden verhalten sich ganz normal */
		geld.runterZ�hlen();
		geld.hochZ�hlen();
		
		/* Statische Interface-Methode kann nur �ber das Interface angesprochen werden */
		Z�hlbar.gesamt();
//		Geld.gesamt();							/* Kompiliert nicht */
	}

}

/* Interfaces werden mit dem Keyword interface deklariert */
interface Z�hlbar {
	
	/* Interfaces k�nnen Variablen deklarieren - diese sind aber immer public static und final */
	/* Die folgenden Variablen sind ALLE public static und final */
	int x = 100;
	static int y = 200;
	final int z = 300;
	
//	private String a = "Konstante";		Kompiliert nicht, weil Variablen in Interfaces nicht private sein d�rfen
	
	/* Methoden in Interfaces gelten zun�chst als abstract - und sind IMMER public */
	void hochZ�hlen();
	
	/* Soll die Methode nicht abstract sein, ist sie als default zu kennzeichnen */
	default void runterZ�hlen() {
		System.out.println("Z�hlt herunter...");
	}
	
	/* Methoden im Interface d�rfen auch statisch sein */
	static int gesamt() {
		return 0;		
	}
}

interface Druckbar {
	public default void drucken() {
		System.out.println("Druckt...");
	};
}

/* Soll ein Interface zur Vererbung mit Klassen verwendet werden, wird es von einer oder
 * mehreren KLassen implementiert - eine Klasse darf auch mehrere Interfaces implementieren */

class Geld implements Z�hlbar, Druckbar {
	
	/* Die Klasse erbt die abstrakte Methode hochZ�hlen und muss diese implementieren */
	public void hochZ�hlen() {
		System.out.println("Kontostand erh�hen...");
	}
}


