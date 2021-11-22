package chapter_1;



// In Java sind Klassen in sogenannten Packages organisiert
// Packages k�nnen wir uns wie Ordner in einem Dateisystem vorstellen
// Packages haben mehrere Vorteile:
// 1. Die Klassen k�nnen logisch geordnet werden (�bersichtlichkeit)
// 2. Klassen in unterschiedlichen Packages k�nnen strikt voneinander getrennt werden
// 3. Namenskonflikte verhindern
// Klassen die nicht einem spezifischen Package zugeordnet werden, befinden sich im sogenannten
// default Package - auch "Package without name"
// Klassen im default Package sind nicht in anderen Packages grunds�tzlich nicht benutzbar!
// F�r alle anderen Packages gilt: um Klassen aus anderen Packages zu verwenden, importieren wir diese
// Es k�nnen nur Klassen importiert werden, die mit "public" gekennzeichnet sind
// Alle Klassen aus dem Package java.lang werden automatisch importiert - und nur diese

// Die Klasse Date existiert zweimal - �ber den Import geben wir bekannt, welche wir haben wollen
import java.util.Date;

// Das Sternchen importiert alle Klassen aus einem Package
import java.util.*;

// Kann nicht zwei gleichnamige Klassen importieren
//import java.sql.Date;						//Kompiliert nicht, weil bereits eine Date-Klasse importiert wurde

// Unn�tige oder redundante imports sind gestattet - diese Klasse steht auch ohne import zur Verf�gung
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
		
		// Klassen, die nicht importiert wurden, k�nnen �ber ihren voll qualifizierten Klassennamen verwendet werden
		java.sql.Date SqlDate = new java.sql.Date(0);

	}

}

// F�r die Pr�fung:
// 1. Das Package-Statement muss, sofern vorhanden, an erster Stelle in der Datei stehen
// 2. Das Package-Statement gilt f�r alle Klassen in der Datei
// 3. Import-Statements m�ssen, sofern vorhanden, nach dem Package-Statement, aber vor den Klassendeklarationen stehen
// 4. Import-Statements gelten f�r alle Klassen in der Datei
// 5. Es k�nnen nur Klassen importiert werden, die sichtbar sind (public)
// 6. Es d�rfen nicht zwei Klassen des gleichen Namens ausdr�cklich �ber ihren Klassennamen importiert werden 
// 7. Wird eine Klasse per * importiert, kann sie von einer gleichnamigen Klasse, die �ber
// ihren Namen direkt importiert wurde, verdeckt werden (spezifischer Import hat Vorrang)
// 8. Werden zwei oder mehr Packages mit einem * importiert, gilt dies nur f�r Klassen mit einzigartigem Namen
// 9. Folglich kann auch keine Klasse importiert werden, deren Name bereits von einer im selben Package
// befindlichen Klasse belegt ist
// 10. Klassen, welche nicht importiert wurden, k�nnen verwendet werden, indem wir ihren
// voll qualifizierten Namen mit Package angeben (jedes Mal) 
// 11. Unn�tige, redundante, aber syntaktisch korrekte imports sind erlaubt
// 12. Es k�nnen nur Typen (Klasse, Enum, Interface) importiert werden, keine Packages
// 13. Es ist nur ein * Sternchen pro Import-Statement erlaubt (am Ende)
