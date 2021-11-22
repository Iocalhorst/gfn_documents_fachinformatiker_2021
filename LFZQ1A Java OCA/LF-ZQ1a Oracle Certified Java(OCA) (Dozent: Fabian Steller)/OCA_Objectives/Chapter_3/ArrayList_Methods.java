package Chapter_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Die Klasse ArrayList stellt zahlreiche Methoden zur Verf�gung
// Einige davon sollten f�r die Pr�fung bekannt sein

public class ArrayList_Methods {

	public static void main(String[] args) {
		// Die Anzahl der Elemente einer ArrayList erhalten wir mit der Methode size()
		// length() existiert f�r die ArrayList nicht!
		ArrayList<Integer> myList = new ArrayList<>();
		System.out.println(myList.size());				// 0 - Liste wurde leer erzeugt
//		System.out.println(myList.length());			// Kompiliert nicht!
		
		// Die Methode add() existiert in zwei Varianten und f�gt der Liste ein neues Element hinzu
		// Die Liste wird dabei l�nger!
		// boolean add(E element) 
		// void add(int index, E element)
		myList.add(15);									// F�ge die 15 am Ende der Liste hinzu
		// add() mit einem Parameter gibt einen boolean zur�ck, welcher grunds�tzlich immer true ist
		// f�r die ArrayList spielt dieser also keine Rolle! Die add() Methode existiert aber auch in
		// anderen Klassen, welche diesen R�ckgabewert ben�tigen.
		myList.add(0, 50);								// F�ge die 50 an die erste Position der Liste ein
		System.out.println(myList);						// 50, 15 - 15 ist nach rechts gerutscht
		// Wie immer wenn wir einen int als Index angeben, gibt es die Gefahr der Exception:
//		myList.add(3, 100);								// IndexOutOfBoundsException - n�chste freie
														// Position w�re die 2!
		// Die add() Methoden sind parameterisiert auf den Datentyp, welchen wir f�r die Elemente
		// mit dem diamond operator angegeben haben!
//		myList.add("1000");								// String ist kein Integer, kompiliert nicht!
		
		// Die Methode remove() existiert ebenfalls in 2 unterschiedlichen Varianten (�berladungen)
		// Mit remove() wird ein Element aus der Liste entfernt
		// boolean remove(Object obj)	- gibt true zur�ck, wenn obj in der Liste enthalten war
		// E remove(int index) 			- gibt das entfernte Element zur�ck
		myList.remove(new Integer(50));					// Entfernt das Objekt aus der Liste, welches
														// mit dem Argument "equal" ist
//		myList.remove(50);								// Entfernt das Element an der Position 50 aus
														// der Liste - Exception!
		System.out.println(myList);						// 15
		
		// Die Methode set() ersetzt ein Element der Liste mit einem anderen
		// Die L�nge der Liste wird dabei nicht ver�ndert!
		// E set(int index, E element)
		// Zur�ckgegeben wird dabei das ersetzte Element
		Integer i = myList.set(0, 5);
		System.out.println(i);							// die entfernte 15
		System.out.println(myList);						// 5
		// Genauso wie add() ist set() auf den richtigen Datentyp parameterisiert:
//		myList.set(0, "10");							// Kompiliert nicht
		// Die set() Methode darf nur einen bereits belegten Index benutzen - der n�chste freie
		// w�re hier nicht erlaubt!
//		myList.set(1, i);								// Exception
		
		// Die Methode isEmpty() gibt true zur�ck, wenn die Liste genau 0 Elemente enth�lt
		// sonst wird immer false zur�ck gegeben
		System.out.println(myList.isEmpty());			// false - Liste hat 1 Element
		
		// Die Methode clear() entfernt alle Elemente aus der Liste und gibt nichts zur�ck
		// Nach dem Aufruf von clear() ergibt isEmpty() immer true
		myList.clear();
		System.out.println(myList.isEmpty());			// true
		
		// Die Methode contains() gibt true zur�ck, wenn ein spezifisches Element in der Liste
		// enthalten ist. Es wird mit der equals() Methode nach dem Element gesucht.
		// boolean contains(Object obj)
		myList.add(25);
		System.out.println(myList.contains(25));		// true
		System.out.println(myList.contains(20));		// false
		
		// Die Klasse ArrayList hat die equals() Methode selbst �berschrieben, so dass wir
		// zwei Listen miteinander vergleichen k�nnen. Zwei Listen sind dann gleich, wenn
		// sie die gleichen Elemente in der selben Reihenfolge enthalten.
		ArrayList<Integer> otherList = new ArrayList<>(myList);
		System.out.println(myList.equals(otherList));	// true - Listen sind gleich	
		System.out.println(myList == otherList);		// false - nicht dasselbe Objekt
		
		// Mit der Methode toArray() kann aus einer Liste ein Array mit den gleichen Elementen erzeugt
		// werden. 
		myList.add(50);
		myList.add(75);
		myList.add(100);
		// Die Methode ben�tigt ein Argument, um das richtige Array instanziieren zu k�nnen
		// Wir m�ssen ein beliebiges Array vom richtigen Typ �bergeben
		Integer[] myArray = myList.toArray(new Integer[0]);
		System.out.println(Arrays.toString(myArray));	// 25, 50, 75, 100
		// �bergeben wir kein Argument, erhalten wir grunds�tzlich ein Array von Objekten!
//		myArray = myList.toArray();						// Kompiliert nicht
		Object[] myObjs = myList.toArray();				// Ok
		
		// Eine ArrayList kann nat�rlich, ebenso wie ein Array, sortiert werden. Voraussetzung ist dabei
		// wieder, dass die Elemente eine nat�rliche Ordnung besitzen. 
		// Wir verwenden daf�r die Methode Collections.sort()
		Collections.sort(myList);						// Liste myList wird sortiert
		
		
		
	}

}


// F�r die Pr�fung:
// 1. Die Methode zum herausgeben der Anzahl der Elemente einer ArrayList hei�t size(), nicht length()
// 2. Mit der Methode add() k�nnen Elemente entweder am Ende der Liste oder an einer bestimmten Position
// der Liste hinzugef�gt werden. 
// 3. Die Methode remove() entfernt entweder das Element an der angegebenen Position, oder das Element,
// welches dem Argument anhand der equals() Methode entspricht - je nach dem ob die Methode mit einem
// int oder einem Object aufgerufen wird.
// 4. Die Methode set() ersetzt das Element an der angegebenen Position mit einem anderen.
// 5. Die Methode isEmpty() gibt true zur�ck, wenn die Liste 0 Elemente enth�lt.
// 6. Die Methode clear() entfernt alle Elemente aus der Liste.
// 7. Die Methode contains() gibt true zur�ck, wenn das Argument anhand der equals() Methode in der Liste
// enthalten ist. Hierbei ist es wichtig, ob die equals() Methode von der Klasse der Listenelemente 
// sinnvoll �berschrieben wurde (da sie sonst die Referenzen vergleicht).
// 8. Die Klasse ArrayList selbst hat die equals() Methode so �berschrieben, dass zwei Listen gleich
// sind, wenn sie die gleichen(equals()) Elemente in der selben Reihenfolge enthalten.
// 9. Die Methode toArray() erzeugt ein neues Array mit den selben Elementen wie die Liste.
//10. Sortiert wird eine ArrayList mit Collections.sort().