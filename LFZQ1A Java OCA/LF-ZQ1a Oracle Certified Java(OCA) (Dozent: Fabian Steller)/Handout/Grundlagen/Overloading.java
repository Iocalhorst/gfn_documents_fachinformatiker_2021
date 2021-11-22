package myPackage;

/* Eine Klasse darf mehrere Methoden gleichen Namens besitzen, sofern diese sich 
 * in ihrer Parameterliste unterscheiden */
public class Overloading {

	public static void main(String[] args) {
			
		/* �berladene Methoden werden anhand des Datentyps des Argumentes ausgew�hlt */
		
		count();				//Z�hlen
		count(10);				//Ganzzahlen Z�hlen...
		count(10.0);			//Kommazahlen Z�hlen
		count(10, 10.0);		//Ganzzahlen und Kommazahlen z�hlen
//		count(10, 10);			//Kompiliert nicht, weil der Aufruf uneindeitig ist
		
		byte a = 10;
		count(a);				//Ganzzahlen Z�hlen...
	}
	
	/* Methode ohne Parameter */
	public static void count() {
		System.out.println("Z�hlen...");
	}
	
	/* �berladung mit 1 int Parameter */
	public static void count(int x) {
		System.out.println("Ganzzahlen Z�hlen...");
	}
	
	/* �berladung mit 1 double Parameter */
	public static void count(double x) {
		System.out.println("Kommazahlen Z�hlen...");
	}
	
	/* �berladung mit 1 float Parameter */
	public static void count(float x) {
		System.out.println("kleine Kommazahlen Z�hlen...");
	}
	
	/* �berladung mit 1 double und 1 int Parameter */
	public static void count(double x, int y) {
		System.out.println("Kommazahlen und Ganzzahlen Z�hlen...");
	}
	
	/* �berladung mit 1 int und 1 double Parameter */
	public static void count(int x, double y) {
		System.out.println("Ganzzahlen und Kommazahlen Z�hlen...");
	}
	
	/* Bei der �berladung m�ssen die Parameterlisten der Methoden sich unterscheiden!
	 * Daran l�sst sich der Unterschied zur �berschreibung deutlich machen:
	 * Bei �berschreibung muss die Paramterliste die selbe bleiben
	 */

}
