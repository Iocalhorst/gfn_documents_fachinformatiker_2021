package chapter_1;

// Die main-methode ist der Startpunkt für ein jedes Java-Programm
// Sie wird aufgerufen von der JVM (Java Virtual Machine)
// Dies funktioniert nur, wenn die Methode bestimmten Regeln gehorcht 
// Diese speziellen Regeln werden vom Kompiler nicht durchgesetzt
// Daher kann es "richtige" und "falsche" main-methode geben

public class Main_Method {

	// So sieht die "richtige" main aus 
	public static void main(String[] args) {
		System.out.println(args[0]);
		
	}
	
	// Das aussehen kann sich leicht verändern - die folgenden sind alle "richtige":
//	static public void main(String[] args) {
//		
//
//	}	
//	public static void main(String[] params) {
//		
//
//	}	
//	public static final void main(String[] params) {
//	
//
//}
//	public static final void main(String... params) {		Varargs-Parameter(steht für 0 bis beliebig viele Strings)
//	
//
//}
	
	// Folgendes sind Beispiele für "falsche" main-methoden (keine Kompilierfehler):
//	static void main(String[] params) {						ist nicht public
//	
//
//}
	
//	public void main(String[] params) {						ist nicht static
//	
//
//}
	
//	public static int main(String[] params) {				hat falschen Rückgabetyp
//	
//
//}
	
//	public static void main(String params) {				hat falschen Parametertyp
//	
//
//}
	
//	public static void main(String[] params, String[] params2) {	hat zu viele Parameter
//	
//
//}
	
//	public static void main() {										kein Parameter
//	
//	}
	
}

// Für die Prüfung:
// 1. Die main-Methode wird von der JVM aufgerufen
// 2. Die main-Methode muss public sein
// 3. Die main-Methode muss static sein
// 4. Die main-Methode muss void als Rückgabetyp angeben
// 5. Die main-Methode muss einen Parameter vom Typ String-Array oder String Varargs haben
// 6. "Falsche" main-Methoden sind keine Kompilierfehler
// 7. Eine Anwendung darf beliebig viele main-Methoden haben
// 8. Die main-Methode kann überladen werden (mit "falschen" main-Methoden)
// 9. Ausführen einer Klasse ohne "richtige" main-Methode führt zu einer Fehlerausgabe
// 10. Der Befehl "javac" ruft in der Kommandozeile den Kompiler auf
// 11. Der Kompiler erwartet eine .java-Datei (mit Dateiendung angeben)
// 12. Der Befehl "java" startet die JVM über die Kommandozeile
// 13. Der JVM muss eine Klasse mit main-Methode genannt werden (ohne Dateiendung)
// 14. Argumente werden der main-Methode hinter dem Klassennamen ohne Kommata durch Leerstellen getrennt übergeben
// 15. Der main-Methode müssen keine Argumente übergeben werden
// 16. Die main-Methode bekommt, wenn keine Argumente übergeben werden, ein LEERES Array - immer
// 17. Die main-Methode darf final sein