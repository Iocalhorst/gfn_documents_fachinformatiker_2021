/* Dies ist ein Kommentar */

/* Package-Statement */
package myPackage;

/* Klassendeklaration */
public class MyFirstClass {

	/* Deklaration einer Instanzvariable 
	 * wird erst mit einem Objekt der Klasse erzeugt */
	int x = 50;
	
	/* Deklaration einer statischen Variable 
	 * diese existiert unabh‰ngig von Objekten der Klasse */
	static String y = "Java";
	
	/* Main-Methode */
	public static void main(String[] args) {
		/* lokale Variablendeklarationen */
		int x;
		String y;
		
		/* Zuweisung von Variablen */
		x = 10;
		y = "Fabian";

		System.out.println(x);
		System.out.println(y);
		
		/* Diese Zeile gibt die statische Variable auﬂerhalb
		 * der Main-Methode aus */
		System.out.println(MyFirstClass.y);
		
		/* Deklaration und Zuweisung in einem Schritt */
		int z = 50;
		
		/* Deklaration mehrerer Variablen mit Zuweisung */
		int a, b, c; 
		a = b = c = 100; 
		/* a, b und c haben alle den Wert 100 bekommen, sind
		 * aber eigenst‰ndige Variablen */
		
		/* Neuzuweisung einer Variable */
		b = 0;
		System.out.println(a); // 100
		System.out.println(b); // 0
		System.out.println(c); // 100
	}
	
	
	
}
