package chapter_1;



// In Java sind Klassen in sogenannten Packages organisiert
// Packages können wir uns wie Ordner in einem Dateisystem vorstellen
// Packages haben mehrere Vorteile:
// 1. Die Klassen können logisch geordnet werden (Übersichtlichkeit)
// 2. Klassen in unterschiedlichen Packages können strikt voneinander getrennt werden
// 3. Namenskonflikte verhindern
// Klassen die nicht einem spezifischen Package zugeordnet werden, befinden sich im sogenannten
// default Package - auch "Package without name"
// Klassen im default Package sind nicht in anderen Packages grundsätzlich nicht benutzbar!
// Für alle anderen Packages gilt: um Klassen aus anderen Packages zu verwenden, importieren wir diese
// Es können nur Klassen importiert werden, die mit "public" gekennzeichnet sind
// Alle Klassen aus dem Package java.lang werden automatisch importiert - und nur diese

// Die Klasse Date existiert zweimal - über den Import geben wir bekannt, welche wir haben wollen
import java.util.Date;

// Das Sternchen importiert alle Klassen aus einem Package
import java.util.*;

// Kann nicht zwei gleichnamige Klassen importieren
//import java.sql.Date;						//Kompiliert nicht, weil bereits eine Date-Klasse importiert wurde

// Unnötige oder redundante imports sind gestattet - diese Klasse steht auch ohne import zur Verfügung
import chapter_1.Main_Method;

// Falsche imports:
// import java.util;					Kompiliert nicht, weil kein ganzes Package importiert werden darf
// import java.*.*						Kompiliert nicht, nur ein Sternchen erlaubt (am Ende)

public class Package_Declarations {

	public static void main(String[] args) {
		// Klasse wurde per import-statement importiert - es handelt sich um ein java.util.Date
		Date date = new Date();
		
		// Klasse muss nicht importiert werden, weil String in java.lang liegt
		String string = new String("Hello");
		
		// Klassen, die nicht importiert wurden, können über ihren voll qualifizierten Klassennamen verwendet werden
		java.sql.Date SqlDate = new java.sql.Date(0);

	}

}

// Für die Prüfung:
// 1. Das Package-Statement muss, sofern vorhanden, an erster Stelle in der Datei stehen
// 2. Das Package-Statement gilt für alle Klassen in der Datei
// 3. Import-Statements müssen, sofern vorhanden, nach dem Package-Statement, aber vor den Klassendeklarationen stehen
// 4. Import-Statements gelten für alle Klassen in der Datei
// 5. Es können nur Klassen importiert werden, die sichtbar sind (public)
// 6. Es dürfen nicht zwei Klassen des gleichen Namens ausdrücklich über ihren Klassennamen importiert werden 
// 7. Wird eine Klasse per * importiert, kann sie von einer gleichnamigen Klasse, die über
// ihren Namen direkt importiert wurde, verdeckt werden (spezifischer Import hat Vorrang)
// 8. Werden zwei oder mehr Packages mit einem * importiert, gilt dies nur für Klassen mit einzigartigem Namen
// 9. Folglich kann auch keine Klasse importiert werden, deren Name bereits von einer im selben Package
// befindlichen Klasse belegt ist
// 10. Klassen, welche nicht importiert wurden, können verwendet werden, indem wir ihren
// voll qualifizierten Namen mit Package angeben (jedes Mal) 
// 11. Unnötige, redundante, aber syntaktisch korrekte imports sind erlaubt
// 12. Es können nur Typen (Klasse, Enum, Interface) importiert werden, keine Packages
// 13. Es ist nur ein * Sternchen pro Import-Statement erlaubt (am Ende)
