package myPackage;

/* Eine Klasse darf mehrere Methoden gleichen Namens besitzen, sofern diese sich 
 * in ihrer Parameterliste unterscheiden */
public class Overloading {

	public static void main(String[] args) {
			
		/* Überladene Methoden werden anhand des Datentyps des Argumentes ausgewählt */
		
		count();				//Zählen
		count(10);				//Ganzzahlen Zählen...
		count(10.0);			//Kommazahlen Zählen
		count(10, 10.0);		//Ganzzahlen und Kommazahlen zählen
//		count(10, 10);			//Kompiliert nicht, weil der Aufruf uneindeitig ist
		
		byte a = 10;
		count(a);				//Ganzzahlen Zählen...
	}
	
	/* Methode ohne Parameter */
	public static void count() {
		System.out.println("Zählen...");
	}
	
	/* Überladung mit 1 int Parameter */
	public static void count(int x) {
		System.out.println("Ganzzahlen Zählen...");
	}
	
	/* Überladung mit 1 double Parameter */
	public static void count(double x) {
		System.out.println("Kommazahlen Zählen...");
	}
	
	/* Überladung mit 1 float Parameter */
	public static void count(float x) {
		System.out.println("kleine Kommazahlen Zählen...");
	}
	
	/* Überladung mit 1 double und 1 int Parameter */
	public static void count(double x, int y) {
		System.out.println("Kommazahlen und Ganzzahlen Zählen...");
	}
	
	/* Überladung mit 1 int und 1 double Parameter */
	public static void count(int x, double y) {
		System.out.println("Ganzzahlen und Kommazahlen Zählen...");
	}
	
	/* Bei der Überladung müssen die Parameterlisten der Methoden sich unterscheiden!
	 * Daran lässt sich der Unterschied zur Überschreibung deutlich machen:
	 * Bei Überschreibung muss die Paramterliste die selbe bleiben
	 */

}
