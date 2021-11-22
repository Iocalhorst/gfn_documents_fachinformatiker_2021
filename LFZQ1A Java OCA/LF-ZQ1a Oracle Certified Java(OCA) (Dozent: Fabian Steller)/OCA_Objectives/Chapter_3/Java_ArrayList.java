package Chapter_3;

import java.util.ArrayList;

// Eine ArrayList ist eine Art dynamisches Array
// Die ArrayList kann jederzeit ihre L�nge anpassen - es k�nnen Elemente hinzugef�gt oder komplett
// entfernt werden
// Die Arbeit mit ArrayList erfolgt ausschlie�lich �ber die bereitgestellten Methoden
// Einzelne Positionen k�nnen NICHT wie beim Array mit [] angesprochen werden

public class Java_ArrayList {

	public static void main(String[] args) {
		// Eine ArrayList erzeugen:
		// Der Datentyp der Elemente wird in den < > Klammern angegeben!
		ArrayList<Integer> numbers = new ArrayList<Integer>();			// Leere Liste mit L�nge 0 
		// Funktioniert genauso, wenn man den Datentyp RECHTS des Gleichheitszeichens ausl�sst:
		ArrayList<Integer> numbers2 = new ArrayList<>();
		// Theoretisch d�rfen wir auch die ganze <> Klammer rechts weglassen:
		ArrayList<Integer> numbers3 = new ArrayList();					// Kein Kompilierfehler, aber
																		// schlechter Stil...
		
		// Nicht-�bereinstimmende Datentypen erzeugen einen Kompilierfehler:
//		ArrayList<Integer> numbers3 = new ArrayList<String>();			// Unsinn!
		
		// Auch bei Datentypen in der gleichen Vererbungshierarchie geht es nicht!
//		ArrayList<CharSequence> chars = new ArrayList<String>();		// Kompiliert nicht
		// Bei einem Array w�rde das gleiche funktionieren:
		CharSequence[] chars = new String[5];							// Ok!
		
		// Dennoch kann ich in eine ArrayList vom Typ CharSequence Strings einf�gen:
		ArrayList<CharSequence> strings = new ArrayList<>();
		strings.add("Ich bin eine Zeichenfolge");
		// StringBuilder ist ebenfalls eine CharSequence, passt auch:
		strings.add(new StringBuilder("Ich passe auch in die Liste"));
		
		// Eine ArrayList ohne Datentyp ist noch kein Kompilierfehler:
		ArrayList list = new ArrayList<>();								// Ok, aber nicht unbedingt sinnvoll
		// Eine leere <> Klammer ist aber nicht gestattet!
//		ArrayList<> list2 = new ArrayList<>();							// Kompiliert nicht
		
		
		// Neben dem no-args Konstruktor hat die ArrayList noch zwei weitere Konstruktoren:
		// �bergeben wir einen int, k�nnen wir damit die Kapazit�t setzen. Diese spielt aber genau
		// wie beim StringBuilder keine gro�e Rolle, weil sie automatisch verwaltet wird.
		ArrayList<String> myList = new ArrayList<>(15);					// Leere Liste!
		System.out.println(myList.size());								// 0
		// �bergeben wir eine andere Liste, wird �ber den Konstruktor eine neue Liste mit genau
		// den gleichen Elementen erzeugt:
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(15);
		nums.add(20);
		System.out.println(nums);										// 10, 15, 20
		ArrayList<Integer> nums2 = new ArrayList<>(nums);				// Kopie der Liste wird erzeugt 
		System.out.println(nums2);										// 10, 15, 20
		
		// Die beiden Listen sind voneinander verschieden:
		nums.add(25);
		System.out.println(nums);										// 10, 15, 20, 25
		System.out.println(nums2);										// 10, 15, 20
		
		// ArrayLists arbeiten NICHT mit primitiven Datentypen!
//		ArrayList<int> ints = new ArrayList<>();						// Kompiliert nicht!
		
	}
}

// F�r die Pr�fung:
// 1. Im Gegensatz zu einem Array hat eine ArrayList keine feste Gr��e.
// 2. Die Klasse ArrayList liegt im Package java.util und muss daher importiert werden.
// 3. Der Datentyp der Elemente einer ArrayList wird mit dem diamond operator <> angegeben
// 4. Eine ArrayList kann ohne diamond operator verwendet werden - was letzlich gleichbedeutend
// ist mit ArrayList<Object>
// 5. Die Klasse ArrayList hat genau 3 Konstruktoren: ArrayList(), ArrayList(int capacity) und 
// ArrayList(Collection c) - letzterer nimmt z.B. eine andere Liste entgegen
// 6. ArrayLists arbeiten nicht mit primitiven Datentypen!
// 7. ArrayList-Variablen sind genau auf einen spezifischen Datentyp f�r die Elemente festgelegt:
// ArrayList<Object> list = new ArrayList<String>(); kompiliert nicht!
