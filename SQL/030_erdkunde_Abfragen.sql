
-- Erdkunde

USE erdkunde;

-- Kreuzprodukt
# SELECT * FROM staedte, laender;

-- Equi-Join
# SELECT * FROM staedte, laender WHERE laender_id=laender.id;

-- Spalten auswählen
# SELECT staedte.name, staedte.einwohnerzahl, laender.name
# FROM staedte, laender WHERE laender_id=laender.id;

-- INNER JOIN
# SELECT staedte.name, staedte.einwohnerzahl, laender.name
# FROM staedte INNER JOIN laender ON laender_id=laender.id;

-- Sortieren - ORDER BY
-- Aufsteigend sortieren mit ASC (ascending)
-- ASC ist Standard und kann weggelassen werden
# SELECT * FROM staedte ORDER BY `name`;
# SELECT * FROM staedte ORDER BY einwohnerzahl;
# SELECT * FROM staedte ORDER BY einwohnerzahl ASC;
-- Absteigend sortieren mit DESC (descending)
# SELECT * FROM staedte ORDER BY einwohnerzahl DESC;
# SELECT * FROM staedte ORDER BY `name` DESC;

-- Mehrere Sortierkriterium
# SELECT * FROM staedte ORDER BY laender_id, `name`;

-- Limitieren - LIMIT-- 
-- SELECT * FROM staedte ORDER BY id LIMIT 10;  # Bei uns der Standard
-- SELECT * FROM staedte LIMIT 10;   # Die ersten zehn Datensätze
-- SELECT * FROM staedte LIMIT 10, 5;  # Datensätze 11 bis 15

-- Schreibe eine Abfrage,
-- die von den vier größten Städten den Namen und die Einwohnerzahl ausgibt
# SELECT `name`, einwohnerzahl
# FROM staedte ORDER BY einwohnerzahl DESC LIMIT 4;

-- Stellvertreter (Alias) für Spalten - AS
SELECT `name` AS 'Name', einwohnerzahl AS 'Einwohnerzahl'
FROM staedte ORDER BY einwohnerzahl DESC LIMIT 4;





