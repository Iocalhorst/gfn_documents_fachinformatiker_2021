package chapter_2;

// Die foreach-Schleife wird in Java auch "enhanced for loop" genannt. 
// Sie wird verwendet, um ein Array oder eine Liste vom Anfang bis zum Ende durchzugehen
// Sie geht jedes Element des Arrays durch und läuft immer vorwärts
// Sie hat keine Zählvariable

public class For_Each {

	public static void main(String[] args) {
		// Jedes Element eines Arrays ausgeben
		String[] names = {"Bello", "Daisy", "Rufus", "Schnapper"};
		
		for (String name : names) {			// Lies: "für jeden String name aus names"
			System.out.println(name);
		}
		
		// Die foreach-Schleife funktioniert nur mit sog. "iterables"
		// In unserem Fall sind das vor allem Arrays und Listen
		String a = "Fabian";
//		for (char c : a) {					// Kompiliert nicht, String ist kein iterable
//			
//		}
		
		// Leeres Array ist kein Problem
		names = new String[0];
		for (String name : names) {
			
		}
		
		// Darüber hinaus gelten die bekannten Regeln:
		
		// Runde Klammer nicht weglassen!
//		for String name : names {					// Kompiliert nicht
//			
//		}
		
		// Block {} optional
		for (String name : names)
			System.out.println("In der Schleife");	// Ok, Semikolon beendet die Schleife
		
		// Doppelpunkt nicht vergessen!
//		for (String name names) {					// Kompiliert nicht
//			
//		}
		
		// Lokale Variable braucht den passenden Datentyp
//		for (int name : names) {					// Kompiliert nicht, im Array stecken Strings, keine ints
//			
//		}
		
	}

}
