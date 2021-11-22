package Chapter_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists_and_Mutable_Objects {

	public static void main(String[] args) {
		// Wenn wir Listen oder Arrays per Kopie erzeugen, ist es wichtig darauf zu achten,
		// ob sich in diesen Listen/Arrays mutable Objects befinden oder nicht
		
		// Liste mit immutable Objects:
		// Hier sehen wir einen kleinen Trick, mit dem sich eine ArrayList direkt mit Literalen
		// füllen lässt, ohne dass wir mehrmals add() aufrufen müssen!
		ArrayList<String> strings = new ArrayList<>(Arrays.asList("Eins", "Zwei", "Drei"));
		System.out.println(strings);
		// Kopie der Liste erzeugen:
		ArrayList<String> strings2 = new ArrayList<>(strings);
		System.out.println(strings2);
		// Die Listen haben den "gleichen" Inhalt - aber sind es auch die selben Objekte, die referenziert
		// werden? 
		System.out.println(strings.get(0) == strings2.get(0));
		// Ja, es sind tatsächlich die selben Strings in beiden Listen!
		// Die Listen an sich sind aber verschiedene Objekte:
		strings.remove("Eins");
		System.out.println(strings);
		System.out.println(strings2);	
		// Da Strings immutable sind, können wir die Listen wie komplett unterschiedliche behandeln.
		// Es kann uns im Prinzip egal sein, dass sie beide auf die selben Objekte deuten.
		
		// Jetzt das ganze nochmal mit mutable Objects:
		ArrayList<StringBuilder> stringBuilders = new ArrayList<>();
		stringBuilders.add(new StringBuilder("Eins"));
		stringBuilders.add(new StringBuilder("Zwei"));
		stringBuilders.add(new StringBuilder("Drei"));
		ArrayList<StringBuilder> stringBuilders2 = new ArrayList<>(stringBuilders);
		System.out.println(stringBuilders2.get(0) == stringBuilders.get(0));		// true
		stringBuilders.remove(0);
		System.out.println(stringBuilders);											// Zwei, Drei
		System.out.println(stringBuilders2);										// Eins, Zwei, Drei
		stringBuilders.get(0).append("Vier");
		System.out.println(stringBuilders);											// ZweiVier, Drei
		System.out.println(stringBuilders2);										// Eins, ZweiVier, Drei
		
		// Fazit: Mehrere, unterschiedliche Listen können Referenzen auf ein und dieselben Objekte im
		// Speicher verwalten. Handelt es sich um mutable Objects, ist eine Änderung an einem Object
		// dann natürlich in allen entsprechenden Listen zu sehen.
		
	}

}
