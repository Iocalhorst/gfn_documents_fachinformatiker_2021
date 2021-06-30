
-- LIKE

USE erdkunde;

-- LIKE mit Wildcards
-- % (0 bis unendlich beliebige Zeichen)
-- _ (genau ein beliebiges Zeichen)

-- LIKE nie ohne Wildcards benutzen,
-- da es weniger performant
SELECT * FROM staedte WHERE `name`='Berlin';
SELECT * FROM staedte WHERE `name` LIKE 'Berlin';

-- Suche alle Städte, die mit B anfangen
SELECT * FROM staedte WHERE `name` LIKE 'B%';

-- Suche alle Städte mit sechs Buchstaben
# SELECT * FROM staedte WHERE `name` LIKE '______';

-- Finde auch "Bärlin" und Co.
# SELECT * FROM staedte WHERE `name` LIKE 'B_rlin';

-- Suche alle Städte, die mit B anfangen und auf N enden
# SELECT * FROM staedte WHERE `name` LIKE 'B%n'; -- Berlin

-- Suche alle Städte, die ein B im Namen haben
# SELECT * FROM staedte WHERE `name` LIKE '%B%';

-- Suche die Anzahl der Städte, die auf a enden
SELECT * FROM staedte;
SELECT * FROM staedte WHERE `name` LIKE '%a';
SELECT COUNT(id) FROM staedte WHERE `name` LIKE '%a';

-- Suche die größte Einwohnerzahl von den Städten, die ein D im Namen haben
SELECT MAX(einwohnerzahl) FROM staedte WHERE `name` LIKE '%D%';  -- 7.825.200

-- Suche den Städtenamen und die Einwohnerzahl
-- von der Stadt mit der größten Einwohnerzahl
-- von den Städten, die ein D im Namen haben
SELECT `name` AS 'Städtename',
	   einwohnerzahl AS 'Einwohnerzahl'
FROM staedte WHERE `name` LIKE '%D%'
ORDER BY einwohnerzahl DESC LIMIT 1;

# Synonyme für: SHOW COLUMNS FROM table_name
DESCRIBE staedte;
DESC staedte;
EXPLAIN staedte;


