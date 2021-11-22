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
	
	int anzahlR�der;
}

class Boot extends Fahrzeug {
	
}

/* Vererbung funktioniert �ber mehrere Generationen - Kombi erbt �ber Auto auch von Fahrzeug */
class Kombi extends Auto{
	
}


public class Inheritance {

	public static void main(String[] args) {
		Auto auto = new Auto();
		/* Klasse Auto hat die Eigenschaft maxGeschwindigkeit von Fahrzeug geerbt */
		auto.maxGeschwindigkeit = 150;
		/* Statische Variable instanzen um 1 erh�hen */
		Auto.instanzen += 1;
		
		/* Die Eigenschaft anzahlR�der ist in der Klasse Auto definiert und steht in Fahrzeug nicht zur Verf�gung */
		auto.anzahlR�der = 4;
		Fahrzeug fahrzeug = new Fahrzeug();
//		fahrzeug.anzahlR�der = 6;
		/* Klasse Fahrzeug nutzt die selbe statische Variable instanzen wie Auto */
		System.out.println(Fahrzeug.instanzen); // 1
		
		/* Kombi hat Zugriff auf die Eigenschaften von Auto UND Fahrzeug */
		Kombi kombi = new Kombi();
		kombi.anzahlR�der = 4;
		kombi.treibStoff = "Super";
		
		/* Auto und Boot sind Geschwister - sie haben die selbe Elternklasse 
		 * Beide erben von Auto, aber sie erben NICHT voneinandner */
		Boot boot = new Boot();
		boot.treibStoff = "Diesel";
		/* Ein Boot hat keine R�der - die Klasse erbt nicht von Auto! */
//		boot.anzahlR�der = 8;
		
		/* Die Variable fahrzeug mit dem Datentyp Fahrzeug kann ein Auto-Objekt referenzieren */
		fahrzeug = new Auto();
		
		/* Die Variable auto mit dem Datentyp Auto kann KEIN Fahrzeug-Objekt referenzieren */
//		auto = new Fahrzeug();
		
		/* �ber die Variable fahrzeug k�nnen wir nur Eigenschaften benutzen, die der Klasse Fahrzeug
		 * auch bekannt sind - anzahlR�der befindet sich in der Klasse Auto und kann nicht verwendet werden */
//		System.out.println(fahrzeug.anzahlR�der);
		
		/* Weil wir wissen, das in der Variable fahrzeug ein Auto steckt, k�nnen wir dieses auch wieder
		 * herausholen - daf�r m�ssen wir casten. Ein cast gilt als Versprechen an den Kompiler */
		auto = (Auto)fahrzeug;
		/* Jetzt k�nnen wir wieder mit anzahlR�der arbeiten */
		System.out.println(auto.anzahlR�der);
		
			
	}

}