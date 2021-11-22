package chapter_1;

// Klassen sind die elementaren Bausteine f�r eine Anwendung in Java
// Ohne Klassen kann ein Programm nicht ausgef�hrt oder kompiliert werden
// Klassen werden mit folgenden Angaben deklariert:
// 1. das Keyword "class"
// 2. ein Bezeichner (selbst gew�hlt)
// 3. optional einem Modifier f�r die Sichtbarkeit
// 4. optionalen Specifiern (abstract, final)
// 5. einem class body {}
// 
// Im class body befinden sich in erster Linie Deklarationen von Variablen und Methoden
// Die in einer Klasse befindlichen Variablen und Methoden hei�en "member" (Mitglieder)
// Der class body kann keine Anweisungen (statement) enthalten, au�er es wird eine Variable direkt 
// bei ihrer Deklaration zugewiesen

// folgendes ist eine vollst�ndige Klassendeklaration:
class myClass {
	
}

// Als Modifier steht nur public zur Verf�gung:
public class Class_Structure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// Klassen mit private oder protected sind nicht erlaubt:
//private class invisible {				KOMPILIERFEHLER
//	
//}

// Klasse kann abstract sein - Instanziierung nicht erlaubt
abstract class Abstract {
	
}

// Klasse kann final sein - Vererbung nicht erlaubt
final class Final {
	
}

// Klasse kann nicht final UND abstract sein
//final abstract class Nonsense {				KOMPILIERFEHLER
//	
//}

// Reihenfolge beachten:
// Access-Modifier und Specifier m�ssen vor dem class Keyword stehen!
// Access-Modifier und Specifier k�nnen die Position tauschen - public abstract/ abstract public

// Klasse mit Membern - die Reihenfolge der Deklarationen innerhalb der Klasse ist gleichg�ltig
class Person {
	
	// Instanzvariablen - jedes Objekt der Klasse hat seine eigenen
	private int age;
	private String name;
	
	// Klassenvariable - alle Objekte teilen sich diese
	private static String species;
	
	// Instanzmethoden - bearbeiten ein Objekt
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Klassenmethode - funktioniert ohne Objekt
	public static String getSpecies() {
		return species;
	}
}

// Die Instanzvariablen einer Klasse bilden den Zustand eines Objektes ab
// Die Instanzmethoden k�nnen den Zustand eines Objektes bearbeiten oder dar�ber informieren

// F�r die Pr�fung:
// 1. H�chstens eine public class pro Datei 
// 2. Datei muss keine public class enthalten
// 3. Eine public class muss exakt den selben Namen tragen wie ihre Datei
// 4. Klassen d�rfen nicht private oder protected sein
// 5. Klassen d�rfen nicht abstract UND final sein