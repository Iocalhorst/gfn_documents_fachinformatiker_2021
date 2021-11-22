package myPackage;

/* Vererbung ist das Prinzip, nach dem Klassen ihre Variablen und Methoden an andere Klassen weitergeben */


/* Nicht gekapselte Klasse*/
class Fahrzeug {
	
	int maxGeschwindigkeit;
	String treibStoff;
	
	/* Statische Variablen existieren nur einmal, auch bei Vererbung */
	static int instanzen = 0;
	
}


/* Vererbung wird mit dem keyword "extends" eingeleitet */
class Auto extends Fahrzeug {
	
	int anzahlRäder;
}

class Boot extends Fahrzeug {
	
}

/* Vererbung funktioniert über mehrere Generationen - Kombi erbt über Auto auch von Fahrzeug */
class Kombi extends Auto{
	
}


public class Inheritance {

	public static void main(String[] args) {
		Auto auto = new Auto();
		/* Klasse Auto hat die Eigenschaft maxGeschwindigkeit von Fahrzeug geerbt */
		auto.maxGeschwindigkeit = 150;
		/* Statische Variable instanzen um 1 erhöhen */
		Auto.instanzen += 1;
		
		/* Die Eigenschaft anzahlRäder ist in der Klasse Auto definiert und steht in Fahrzeug nicht zur Verfügung */
		auto.anzahlRäder = 4;
		Fahrzeug fahrzeug = new Fahrzeug();
//		fahrzeug.anzahlRäder = 6;
		/* Klasse Fahrzeug nutzt die selbe statische Variable instanzen wie Auto */
		System.out.println(Fahrzeug.instanzen); // 1
		
		/* Kombi hat Zugriff auf die Eigenschaften von Auto UND Fahrzeug */
		Kombi kombi = new Kombi();
		kombi.anzahlRäder = 4;
		kombi.treibStoff = "Super";
		
		/* Auto und Boot sind Geschwister - sie haben die selbe Elternklasse 
		 * Beide erben von Auto, aber sie erben NICHT voneinandner */
		Boot boot = new Boot();
		boot.treibStoff = "Diesel";
		/* Ein Boot hat keine Räder - die Klasse erbt nicht von Auto! */
//		boot.anzahlRäder = 8;
		
		/* Die Variable fahrzeug mit dem Datentyp Fahrzeug kann ein Auto-Objekt referenzieren */
		fahrzeug = new Auto();
		
		/* Die Variable auto mit dem Datentyp Auto kann KEIN Fahrzeug-Objekt referenzieren */
//		auto = new Fahrzeug();
		
		/* Über die Variable fahrzeug können wir nur Eigenschaften benutzen, die der Klasse Fahrzeug
		 * auch bekannt sind - anzahlRäder befindet sich in der Klasse Auto und kann nicht verwendet werden */
//		System.out.println(fahrzeug.anzahlRäder);
		
		/* Weil wir wissen, das in der Variable fahrzeug ein Auto steckt, können wir dieses auch wieder
		 * herausholen - dafür müssen wir casten. Ein cast gilt als Versprechen an den Kompiler */
		auto = (Auto)fahrzeug;
		/* Jetzt können wir wieder mit anzahlRäder arbeiten */
		System.out.println(auto.anzahlRäder);
		
			
	}

}