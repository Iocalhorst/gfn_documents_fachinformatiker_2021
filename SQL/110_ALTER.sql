
# ALTER TABLE

USE erdkunde;

# Vier Möglichkeiten auf Spaltenebene (ADD, DROP, CHANGE, MODIFY)

-- ADD: Füge in der Tabelle staedte die Spalte Fläche hinzu
ALTER TABLE staedte ADD COLUMN flaeche INT;
SELECT * FROM staedte;
DESC staedte;

-- DROP: Lösche die Spalte flaeche
ALTER TABLE staedte DROP COLUMN flaeche;
# ALTER TABLE staedte DROP COLUMN einwohnerzahl;

-- CHANGE: Ändere den Namen der Spalte name zu staedtename
ALTER TABLE staedte CHANGE COLUMN `name` staedtename VARCHAR(255);

-- MODIFY: Modifiziere den Datentyp der Spalte einwohnerzahl zu FLOAT
ALTER TABLE staedte MODIFY COLUMN einwohnerzahl FLOAT;

# Eine Möglichkeit auf Tabellenebene (RENAME TO)
ALTER TABLE staedte RENAME TO cities;
SHOW TABLES;


