package chapter_2;

// Auf ein if darf ein else if oder else folgen, muss es aber nicht

public class If_then_else {

	public static void main(String[] args) {
		// Bei if mit else handelt es sich um zwei Bl�cke, von denen auf jeden
		// Fall genau einer ausgef�hrt wird
		int a = 0;
		if (a > Integer.MIN_VALUE) {
			System.out.println(a + " ist gr��er als der kleinstm�gliche Wert");
		} else {
			System.out.println(a + " ist nicht gr��er als der kleinstm�gliche Wert");
		}

		// Auch hier k�nnen die Bl�cke {} ausgelassen werden
		// Es gilt wieder, dass der unsichtbare Block dann mit dem n�chsten Semikolon beendet ist
		if (a == 0) 
			System.out.println(a + " ist 0");
		else
			System.out.println(a + " ist nicht 0");
		
		// Das else keyword ist nur erlaubt, wenn es direkt auf einen if-Block oder 
		// einen else if-Block folgt
//		if (true) {
//			
//		}
//		System.out.println("Verzweigung beendet");
//		else {							// Kompiliert nicht, weil das else nicht direkt auf das if folgt
//			
//		}
		
		// Der Kompiler wei�, dass auf jeden Fall entweder der eine oder der andere Block
		// ausgef�hrt wird
		int b;
		if (a < 10) {
			b = 20;
		} else {
			b = 30;
		}
		System.out.println(b);			// Darf b benutzen, weil es auf jeden Fall initialisiert worden ist
		
		// Das else if folgt den selben Regeln wie das if, nur dass es auf ein if oder ein anderes
		// else if folgen muss
		
		if (a > 0) {
			
		} else if (a < 0) {
			
		} else if (a == 0) {
			
		} else {
			System.out.println("Diese Zeile wird niemals ausgef�hrt");
		}
		
		// Grunds�tzlich sind sogar Konstrukte erlaubt, bei denen selbst f�r den Kompiler
		// offensichtlich ist, dass ein Fall niemals zutreffen kann
		if (true) {
			
		} else if (false) {
			
		} else {
			
		}
		
		// Ein else if darf niemals auf ein else folgen!!
//		if (a < 0) {
//			
//		} else {
//			
//		} else if (a == 0) {		// Kompiliert nicht, weil das else if auf else folgt
//			
//		}
		
	}

}

// F�r die Pr�fung:
// 1. Bei else if gelten die bekannten Regeln f�r das if
// 2. Ein else if MUSS auf ein if oder else if folgen
// 3. Bei else wird keine Bedingung mehr angegeben
// 4. Ein else MUSS auf ein if oder else if folgen
// 5. Bei if-else Konstrukten wird immer h�chstens 1 Block ausgef�hrt
// 6. Schlie�t die Abfolge mit einem else ab, wird immer genau 1 Block ausgef�hrt
// 7. Fehlt das abschlie�ende else, k�nnen 0 Bl�cke ausgef�hrt werden
// 8. Else trifft genau dann zu, wenn ALLE vorangehenden Bedingungen zu "false" evaluiert wurden
