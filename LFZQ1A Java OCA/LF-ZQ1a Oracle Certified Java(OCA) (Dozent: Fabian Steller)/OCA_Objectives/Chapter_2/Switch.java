package chapter_2;

// Ein Switch-Case ist ein Entscheidungskonstrukt, welches einer Abzweigung �hnelt
// Hierbei wird eine Variable �berpr�ft, ob sie einem aus einer vordefinierten Reihe von Werten entspricht
// Sinnvoll ist dies nur, wenn wir genau wissen welche Werte f�r eine Variable infrage kommen

public class Switch {

	public static void main(String[] args) {
		// Es darf nur �ber bestimmte Werte geswitched werden
		// �ber int kann geswitched
		int x = 10;
		switch (x) {							// Variable x soll �berpr�ft werden
		case 0 : 								// Wird ausgef�hrt, wenn x 0 ist
			break;
		case 1 :								// Wird ausgef�hrt, wenn x 1 ist
			break;
		case 2 :								// Wird ausgef�hrt, wenn x 2 ist
		}
		
		// Es kann �ber alle Zahlentypen geswitched werden, die hierarchisch unter long stehen
		// Damit scheiden float, double und long aus
		float f = 25.0F;
//		switch (f) {							// Darf nicht �ber float switchen
//		
//		}
		
		Object o = new Object();
//		switch (o) {							// Darf nicht �ber Object switchen
//		
//		}
		
		String s = new String("Switch me");		// �ber String DARF geswitched werden
		switch (s) {
		case "switch me":
			break;
		}
		
		// Dar�ber hinaus kommt nur ein Enum infrage!
		
		
		// Die runde Klammer hinter dem switch keyword darf nicht fehlen und nicht leer sein!
//		switch s {								// Kompiliert nicht, Klammer fehlt
//		
//		}
		
//		switch () {								// Kompiliert nicht, Klammer ist leer
//		
//		}
		
		// Beim switch darf auch der Block {} nicht fehlen!
//		switch (s) 
//		case "":break ;							// Kompiliert nicht, Block fehlt
		
		switch (5) {							// Switchen �ber Literale ist erlaubt, macht aber 
												// keinen Sinn!!
		case 1:
		}
		
		// Cases m�ssen Literale sein oder Konstanten
		// Au�erdem m�ssen Cases zum Datentyp des switch-Wertes passen
		
//		switch (x) {
//		case "1":								// Kompiliert nicht, weil x ein int ist aber der Case ein String
//		}
		
//		int y = 10;
//		switch (x) {
//			case y:								// Kompiliert nicht, weil y eine Variable ist
//		}
		
		final int y = 10;
		switch (x) {
			case y:								// Ok, y ist eine Konstante - lies: case 10
		}
		
		// Bei switches �ber int sind cases von allen "kleineren" Datentypen erlaubt
		
		switch (x) {
		case (byte)5:							// Ok, byte ist kompatibel mit int
		case (short)3:							// Ok, short ist kompatibel mit int
		case 'i':								// Ok, char ist kompatibel mit int
		}
		
		// Bei switches �ber char sind entsprechend nur cases von byte und char erlaubt
		// Allerdings kennt der Kompiler den Wertebereich f�r char (und alle Zahlen)
		final short z = 0;
		switch ('b') {
		case 1:									// Ok, 1 ist ein int, aber 1 passt auch in char
		case z:									// Ok, z ist ein short, aber 0 passt auch in char
//		case 70000:								// Kompiliert nicht, weil 70000 nicht in char passt
		}

		// Cases m�ssen einzigartig sein
		switch (x) {
		case 1:
		case 2:
//		case 1:									// Kompiliert nicht, weil es bereits einen case 1 gibt
		}
		
		// Ein switch kann einen default case angeben - dieser trifft genau dann zu
		// wenn kein anderer case zutrifft. Der default case kann an beliebiger Stelle stehen.
		// Auch ein switch nur mit default case ist gestattet:
		switch (x) {
		default:
		}
		
		// Wenn cases nicht mit einem break abgeschlossen werden, wird der Block so lange
		// weiter ausgef�hrt, bis ein break erscheint oder der Block beendet wurde
		// Der Eintrittspunkt ist immer der zutreffende case, von dort aus geht es nach unten.
		
		switch (5) { 
		case 3: System.out.println("Drei");
		case 5: System.out.println("F�nf");					// Wird ausgegeben
		case 7: System.out.println("Sieben");				// Wird ausgegeben
		break;
		case 10: System.out.println("Zehn");
		break;
		}
	}

}

// F�r die Pr�fung:
// 1. Es darf nur �ber die Datentypen byte, short, char, int, String und Enum geswitched werden
// 2. Nach dem switch keyword muss eine runde Klammer folgen, diese darf NICHT leer sein
// 3. Nach der runden Klammer muss ein Block {} folgen, dieser darf leer sein
// 4. Cases d�rfen keine Variablen und keine Ausdr�cke sein
// 5. Cases D�RFEN Konstanten sein (Variablen mit final) - meist sind es aber Literale
// 6. Cases m�ssen vom Datentyp kompatibel mit dem switch-Wert sein (in der runden Klammer)
// 7. Cases m�ssen einzigartig sein
// 8. Ausgehend vom zutreffenden Case wird der switch-Block bis zum n�chsten break oder bis zum
// Ende des Blockes durchlaufen
// 9. Der default case ist optional und kann an jeder beliebigen Stelle stehen
