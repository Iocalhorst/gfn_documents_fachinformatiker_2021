/*

Führe für die nächsten Aufgaben zunächst folgendes SQL aus:


USE schmitz;
DROP TABLE IF EXISTS artikelliste;
CREATE TABLE artikelliste (
    artikelnummer INTEGER NOT NULL,
    artikelname VARCHAR(20),
    herstellername VARCHAR(30),
    herstellungsdatum DATE
) ENGINE=InnoDB;


Änderne die vorhandene Tabellenstruktur in folgender Weise:

1. Ändere den Tabellennamen 'artikelliste' in 'artikel'.
2. Ergänze die Tabelle um die Spalte 'preis'.
3. Lösche die Angaben zum Herstellungsdatum.
4. Erstelle einen Index über alle Artikelnamen.
5. Modifiziere die Spaltendefinition der Tabellenspalte 'artikelname' unter Beibehaltung des Spaltennamens.
   Vergrößere die Spaltengröße auf 100 Zeichen.
6. Ändere die Spaltendefinition der Tabellenspalte 'herstellername' in 'herstellernummer'.
7. Definieren Sie die Tabellenspalte 'artikelnummer' als PrimärschlüsseL
*/

