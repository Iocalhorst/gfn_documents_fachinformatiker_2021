package chapter_1;

// Klassen sind die elementaren Bausteine für eine Anwendung in Java
// Ohne Klassen kann ein Programm nicht ausgeführt oder kompiliert werden
// Klassen werden mit folgenden Angaben deklariert:
// 1. das Keyword "class"
// 2. ein Bezeichner (selbst gewählt)
// 3. optional einem Modifier für die Sichtbarkeit
// 4. optionalen Specifiern (abstract, final)
// 5. einem class body {}
// 
// Im class body befinden sich in erster Linie Deklarationen von Variablen und Methoden
// Die in einer Klasse befindlichen Variablen und Methoden heißen "member" (Mitglieder)
// Der class body kann keine Anweisungen (statement) enthalten, außer es wird eine Variable direkt 
// bei ihrer Deklaration zugewiesen

// folgendes ist eine vollständige Klassendeklaration:
class myClass {
	
}

// Als Modifier steht nur public zur Verfügung:
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
// Access-Modifier und Specifier müssen vor dem class Keyword stehen!
// Access-Modifier und Specifier können die Position tauschen - public abstract/ abstract public

// Klasse mit Membern - die Reihenfolge der Deklarationen innerhalb der Klasse ist gleichgültig
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
// Die Instanzmethoden können den Zustand eines Objektes bearbeiten oder darüber informieren

// Für die Prüfung:
// 1. Höchstens eine public class pro Datei 
// 2. Datei muss keine public class enthalten
// 3. Eine public class muss exakt den selben Namen tragen wie ihre Datei
// 4. Klassen dürfen nicht private oder protected sein
// 5. Klassen dürfen nicht abstract UND final sein