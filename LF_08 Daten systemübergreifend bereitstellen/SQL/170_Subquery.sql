
USE erdkunde;

-- Subquery

-- Hole die durchschnittliche Einwohnerzahl aller Städte
SELECT AVG(einwohnerzahl) FROM staedte; -- 2388863.0556

-- Hole alle Städte, deren Einwohnerzahl größer als
-- 2.388.863,0556 ist (sortiert nach Einwohnerzahl)
SELECT * FROM staedte
WHERE einwohnerzahl>2388863.0556 ORDER BY einwohnerzahl;

-- Hole alle Städte, deren Einwohnerzahl größer als der Durchschnitt ist
SELECT * FROM staedte
WHERE einwohnerzahl>(SELECT AVG(einwohnerzahl) FROM staedte) ORDER BY einwohnerzahl;


