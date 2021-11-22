package myPackage;

public class Arrays {

	public static void main(String[] args) {
		/* Arrays m�ssen den Datentyp f�r ihre Elemente angeben */
		int[] numbers;					// Variable nimmt nur Arrays mit int-kompatiblen Werten auf
		
		/* Arrays m�ssen auf eine feste Gr��e instanziiert werden */
		
		numbers = new int[5];			// Array mit 5 ints - Positionen 0 bis 4 k�nnen belegt werden
		
		System.out.println(numbers[3]); // 0 - Positionen werden mit Standardwerten gef�llten
		
		numbers[0] = 5;					// Positionen k�nnen neu zugewiesen werden
		
		System.out.println(numbers[5]); // Positionen au�erhalb der L�nge k�nnen nicht angesprochen werden
		// Es kommt zu einer ArrayIndexOutOfBoundsException
		
		// Der Variable k�nnen jederzeit neue Arrays zugewiesen werden - auch mit anderer Gr��e
		numbers = new int[10];
		
		// Es ist nicht gestattet, eine Array-Variable auf eine feste Gr��e zu beschr�nken
//		String[10] words;
		
		/* Wenn Arrays auf Klassen typisiert werden, k�nnen sie alle Zuweisungskompatiblen
		 * Objects aufnehmen */
		Object[] objects = new Object[10];
		/* String ist ein Objekt */
		objects[0] = "Hello World";
		/* Der String ist im Array als Object referenziert */
//		String word = objects[0];
		/* Downcast n�tig - gefahr einer ClassCastException besteht */
		String word = (String)objects[0];
		
		/* Die selbe Variable k�nnte auch ein String-Array aufnehmen */
		objects = new String[10];
		objects[0] = "Hello World";
		/* Der Kompiler behandelt die Positionen des Arrays immer noch wie Instanzen von Object */
//		word = objects[0];
		/* Downcast weiterhin n�tig */
		word = (String)objects[0];
		
		/* Das Problem besteht nat�rlich nicht bei einer Variable vom Typ String-Array */
		String[] words = new String[10];
		words[0] = "Hello World";
		word = words[0];
		
		/* Arrays k�nnen per Literal instanziiert werden */
		int[] count = {5, 10, 50};				// Array der L�nge 3 mit den Werten 5, 10, 50
//		count = {100, 1000, 100000};			// Literale Arrays d�rfen nur bei gleichzeitiger 
												// Deklaration einer Variable zugewiesen werden
		
		
	}

}
