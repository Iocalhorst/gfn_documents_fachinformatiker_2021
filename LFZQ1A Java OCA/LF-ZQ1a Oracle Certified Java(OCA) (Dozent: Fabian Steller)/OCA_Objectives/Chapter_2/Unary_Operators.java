package chapter_2;

// Un‰re Operatoren haben nur einen Operanden
// Es handelt sich dabei um ++, --, ! sowie die mathematischen Vorzeichen + und -
// Die beiden Operatoren ++ und -- heiﬂen Inkrementor und Dekrementor
// Das ! heiﬂt Negierungsoperator oder auch Invertierungsoperator (negation or logical complement operator)
public class Unary_Operators {

	public static void main(String[] args) {
		
		// ein mathematisches Vorzeichen (-) wird verwendet, um das Vorzeichen einer Zahl umzudrehen 
		// Beim + als Vorzeichen bleibt das Vorzeichen das gleiche!
		int a = -5;
		System.out.println(-a);									// 5 - Vorzeichen wurde umgedreht
		
		// Vorzeichen nur mit Zahlen verwenden!
		String b = "keine Zahl";
//		System.out.println(-b);									// Nein, kann keinen String umkehren

		// Char ist ein Zahlentyp ohne Vorzeichen!
		char c = 10;
//		c = -c;													// -10 kann nicht als char gespeichert werden
		System.out.println(-c);									// kann die 10 aber umkehren zu -10
		
		// Das ! kehrt einen boolean in sein Gegenteil um - aus true wird false und aus false wird true
		// Es ist ausschlieﬂlich mit booleans verwendbar 
		
		boolean d = true;
		System.out.println(!d);									// false
		
		// Bedenke, dass booleans h‰ufig das Ergebnis von Ausdr¸cken sind
		System.out.println(! (4 < 3));							// true
		// Kann sich nat¸rlich auch um Methodenaufrufe handeln - sofern die Methode einen boolean zur¸ckgibt
		char e = 'ﬂ';
		System.out.println(! Character.isLetter(e));			// false
//		System.out.println(! Character.toUpperCase(c));			// Kompiliert nicht, Methode gibt keinen boolean zur¸ck
		
		// ! und das Vorzeichen - sind nicht austauschbar!
		int f = 7;
		boolean g = true;
//		System.out.println(!f);									// Nicht erlaubt
//		System.out.println(-g);									// Nicht erlaubt
		
		// Inkrementor und Dekrementor sind spezielle Operatoren, welche immer auch eine Zuweisung beinhalten
		// Der Inkrementor a++ ist identisch zu a = a + 1
		// Der Dekrementor a-- ist identisch zu a = a - 1
		// Inkrementor und Dekrementor existieren auﬂerdem in zwei Varianten
		// ++a ist NICHT in jedem Fall identisch zu a++
		
		// Steht der Inkrementor/Dekrementor VOR dem Operanden, sprechen wir von einem Pr‰fix-Operator
		// In diesem Fall f¸hren wir erst die Neuzuweisung durch, bevor der Operand im Ausdruck verwendung findet
		int h = 12;
		int i = ++h;										// Erhˆhe erst h auf 13 und weise dann i auf h zu
		
		// Steht der Inkrementor/Dekrementor NACH dem Operanden, sprechen wir von einem Postfix-Operator
		// In diesem Fall verwenden wir erst den Operanden im Ausdruck, und f¸hren dann die Neuzuweisung durch
		i = h++;											// Weise erst i auf h zu und erhˆhe dann h um 1
		
		// Auch bei Methodenaufrufen gilt dieses Prinzip
		System.out.println(h++);							// Gib den Wert von h aus und erhˆhe DANACH h um 1
		System.out.println(--h);							// Verringere h um 1 und gib DANACH h aus
		
		// Der Unterschied ist nur bei Ausdr¸cken erheblich, in denen der Operand noch verwendet wird
		// Folgende Zeilen sind identisch:
		++a;
		a++;
		
		// In Ausnahmef‰llen kann es zu unbeabsichtigen Ergebnissen kommen
		byte j = 127;
//		j = j + 1;											// Kann das Ergebnis nicht ohne Cast zuweisen
		j++;												// lies: j = (byte)(j + 1)
		System.out.println(j);								// -128
		
		// Der explizite Cast muss bei Inkrementor und Dekrementor nicht angegeben werden!
		
		// Noch ein Beispiel zur Verdeutlichung:
		int x = 1;
		System.out.println(x + ++x);			// 1 + (1 + 1)
												// Ergebnis der Ausgabe ist also 3, x ist 2!
		
		System.out.println(x + x++);			// 2 + 2, danach x auf 3 erhˆhen
												// Ergebnis der Ausgabe ist also 4, x ist 3!
		
		System.out.println(++x + x);			// (3 + 1) + 4

	}

}

// F¸r die Pr¸fung:
// 1. + und - kˆnnen sowohl bin‰re als auch un‰re Operatoren sein
// 2. + als un‰rer Operator dreht das Vorzeichen einer Zahl NICHT um, und kann somit ausgelassen werden
// 3. - als un‰rer Operator dreht das Vorzeichen einer Zahl um 
// 4. Nur Zahlen kˆnnen Vorzeichen haben, aber char darf keine negativen Werte annehmen
// 5. Das ! dreht einen boolean in sein Gegenteil um
// 6. ! ist nur mit booleans erlaubt (und Ausdr¸cken, welche einen boolean zum Ergebnis haben)
// 7. Inkrementor und Dekrementor weisen eine primitive Variable (auﬂer boolean) auf den um 1 
// ver‰nderten Wert neu zu
// 8. Literale Zahlen kˆnnen nicht neu zugewiesen werden, daher auch nicht inkrementiert oder dekrementiert
// 9. Steht der Inkrementor/Dekrementor VOR der Variable, weisen wir erst neu zu und setzen dann den Wert der Variable ein
// 10. Steht der Inkrementor/Dekrementor NACH der Variable, setzen wir erst den (unver‰nderten) Wert
// der Variable ein und weisen dann neu zu
// 11. Inkrementor/Dekrementor beinhalten einen expliziten Cast 
