
-- Aggregatfunktionen
-- Stehen im SELECT

USE erdkunde;

-- MAX(), MIN()
# SELECT MAX(einwohnerzahl) FROM staedte;  -- 8.175.133
# SELECT MIN(einwohnerzahl) FROM staedte;  --   479.803

-- COUNT()
# SELECT COUNT(einwohnerzahl) FROM staedte;  -- 18
# SELECT COUNT(`name`) FROM staedte;         -- 18
# SELECT COUNT(id) FROM staedte;             -- 18
# SELECT COUNT(*) FROM staedte;              -- 18

-- SUM()
-- Die Funktion SUM() summiert die Werte.
SELECT SUM(einwohnerzahl) FROM staedte;  -- 42.999.535

-- AVG() - Durchschnitt
SELECT AVG(einwohnerzahl) FROM staedte; -- 2.388.863,0556

-- Rechnen im SELECT
SELECT SUM(einwohnerzahl) / COUNT(einwohnerzahl) FROM staedte; -- 2.388.863,0556

-- Mehrere Aggregatfunktionen zusammen benutzen
SELECT MAX(einwohnerzahl), MIN(einwohnerzahl) FROM staedte;

-- Gibt die größte Stadt mit Einwohnerzahl und Name der Stadt aus
SELECT `name`, einwohnerzahl FROM staedte ORDER BY einwohnerzahl DESC LIMIT 1;

-- Bei Aggregatfunktionen können KEINE "normalen" Spalten im SELECT stehen !!!








