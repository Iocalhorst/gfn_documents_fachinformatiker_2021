package myPackage;

/* Ein Interface ist eine Art abstrakter Klasse -
 * es dient der Umgehung der Einfachvererbung */

public class Interfaces {

	public static void main(String[] args) {
		/* Konstanten aus Interfaces ansprechen */
		System.out.println(Zählbar.x);			/* 100 */
//		Zählbar.x = 150;						/* Darf Konstante nicht neu zuweisen */
		
		/* Instanz der implementierenden Klasse erzeugen */
		Geld geld = new Geld();
		/* Auch über die Instanz können die Konstanten angesprochen werden */
		System.out.println(geld.z);				/* 300 */
		/* Geht auch über die implementierende Klasse selbst */
		System.out.println(Geld.z);				/* 300 */
		
		/* Die geerbten Instanzmethoden verhalten sich ganz normal */
		geld.runterZählen();
		geld.hochZählen();
		
		/* Statische Interface-Methode kann nur über das Interface angesprochen werden */
		Zählbar.gesamt();
//		Geld.gesamt();							/* Kompiliert nicht */
	}

}

/* Interfaces werden mit dem Keyword interface deklariert */
interface Zählbar {
	
	/* Interfaces können Variablen deklarieren - diese sind aber immer public static und final */
	/* Die folgenden Variablen sind ALLE public static und final */
	int x = 100;
	static int y = 200;
	final int z = 300;
	
//	private String a = "Konstante";		Kompiliert nicht, weil Variablen in Interfaces nicht private sein dürfen
	
	/* Methoden in Interfaces gelten zunächst als abstract - und sind IMMER public */
	void hochZählen();
	
	/* Soll die Methode nicht abstract sein, ist sie als default zu kennzeichnen */
	default void runterZählen() {
		System.out.println("Zählt herunter...");
	}
	
	/* Methoden im Interface dürfen auch statisch sein */
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

class Geld implements Zählbar, Druckbar {
	
	/* Die Klasse erbt die abstrakte Methode hochZählen und muss diese implementieren */
	public void hochZählen() {
		System.out.println("Kontostand erhöhen...");
	}
}


