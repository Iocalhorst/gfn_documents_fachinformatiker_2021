package myPackage;

/* Klassen in Java k�nnen verwendet werden, um Objekte daraus zu machen 
 * Aber nicht jede Klasse muss diesem Zweck dienen
 * Klassen k�nnen auch nur "Beh�lter" f�r Methoden sein
 */

/* Klasse enth�lt lediglich die statische main-methode - Objekte von dieser Klasse sind nicht n�tig */
public class Main {

	public static void main(String[] args) {
		/* Verwendung einer eigene Klasse als Datentyp 
		 * Diese Variable kann nur Objekte der Klasse Customer enthalten 
		 * mit new wird ein Objekt einer Klasse erzeugt (auch Instanz genannt) */
		
		Customer customer 	= new Customer(); 
		customer.name 	 	= "Fabian";
		customer.address 	= "Alt-Moabit 93b";
		customer.tel 		= "1223458";
		
		System.out.println(customer.name); 			//"Fabian"
		System.out.println(customer.address);		//"Alt-Moabit 93b";
		System.out.println(customer.tel);			//"1223458"
		System.out.println(customer);				// Gibt die Objektreferenz als Hashwert heraus
		
		Customer customer1 	= new Customer();
		customer1.name 	 	= "Sven";
		customer1.address 	= "Alt-Moabit 93b";
		customer1.tel 		= "456746";
		
		System.out.println(customer1.name); 		//"Sven"
		System.out.println(customer1.address);		//"Alt-Moabit 93b";
		System.out.println(customer1.tel);			//"456746"
		
		/* Wir haben zwei unterschiedliche Objekte erzeugt, die �ber zwei unterschiedliche Variablen
		 * referenziert werden - jedes Objekt hat eigene Werte f�r name, adress und tel */
		
		/* Kopiert die Objektreferenz von customer1 in die Variable customer
		 * beide zeigen jetzt auf ein und dasselbe Objekt! 
		 * Es handelt sich NICHT um zwei identische Objekte 
		 * Das alte Objekt aus customer ist verloren gegangen und wird gel�scht */
		customer = customer1;
		
		System.out.println(customer.name); 		//"Sven"
		System.out.println(customer.address);	//"Alt-Moabit 91b";
		System.out.println(customer.tel);		//"456746"
		System.out.println(customer1.name); 	//"Sven"
		System.out.println(customer1.address);	//"Alt-Moabit 91b";
		System.out.println(customer1.tel);		//"456746"
		
		/* Auf die Variable customer wird ein NEUES Objekt zugewiesen - customer1 bleibt aber wie es ist */
		customer = new Customer();
		
		/* Das neue Objekt bekommt Standardwerte, solange wir die Eigenschaften nicht direkt zuweisen */
		/* Der Standardwert f�r alle Objektreferenzen ist immer null */
		System.out.println(customer.name); 		//null
		System.out.println(customer.address);	//null
		System.out.println(customer.tel);		//null
		System.out.println(customer1.name); 	//"Sven"
		System.out.println(customer1.address);	//"Alt-Moabit 91b";
		System.out.println(customer1.tel);		//"456746"
				
		
	}

}

/* Klasse, die f�r Objekte genutzt werden soll */
/* Sie dient als Bauplan f�r Objekte einer Art */
class Customer {
	
	/* Instanzvariablen - sie beschreiben die Eigenschaften eines Objektes */
	String name;
	String address;
	String tel;
	
}