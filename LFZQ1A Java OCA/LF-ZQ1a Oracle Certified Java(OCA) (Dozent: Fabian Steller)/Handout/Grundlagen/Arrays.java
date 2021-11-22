package myPackage;

public class Arrays {

	public static void main(String[] args) {
		/* Arrays müssen den Datentyp für ihre Elemente angeben */
		int[] numbers;					// Variable nimmt nur Arrays mit int-kompatiblen Werten auf
		
		/* Arrays müssen auf eine feste Größe instanziiert werden */
		
		numbers = new int[5];			// Array mit 5 ints - Positionen 0 bis 4 können belegt werden
		
		System.out.println(numbers[3]); // 0 - Positionen werden mit Standardwerten gefüllten
		
		numbers[0] = 5;					// Positionen können neu zugewiesen werden
		
		System.out.println(numbers[5]); // Positionen außerhalb der Länge können nicht angesprochen werden
		// Es kommt zu einer ArrayIndexOutOfBoundsException
		
		// Der Variable können jederzeit neue Arrays zugewiesen werden - auch mit anderer Größe
		numbers = new int[10];
		
		// Es ist nicht gestattet, eine Array-Variable auf eine feste Größe zu beschränken
//		String[10] words;
		
		/* Wenn Arrays auf Klassen typisiert werden, können sie alle Zuweisungskompatiblen
		 * Objects aufnehmen */
		Object[] objects = new Object[10];
		/* String ist ein Objekt */
		objects[0] = "Hello World";
		/* Der String ist im Array als Object referenziert */
//		String word = objects[0];
		/* Downcast nötig - gefahr einer ClassCastException besteht */
		String word = (String)objects[0];
		
		/* Die selbe Variable könnte auch ein String-Array aufnehmen */
		objects = new String[10];
		objects[0] = "Hello World";
		/* Der Kompiler behandelt die Positionen des Arrays immer noch wie Instanzen von Object */
//		word = objects[0];
		/* Downcast weiterhin nötig */
		word = (String)objects[0];
		
		/* Das Problem besteht natürlich nicht bei einer Variable vom Typ String-Array */
		String[] words = new String[10];
		words[0] = "Hello World";
		word = words[0];
		
		/* Arrays können per Literal instanziiert werden */
		int[] count = {5, 10, 50};				// Array der Länge 3 mit den Werten 5, 10, 50
//		count = {100, 1000, 100000};			// Literale Arrays dürfen nur bei gleichzeitiger 
												// Deklaration einer Variable zugewiesen werden
		
		
	}

}
