
-- DISTINCT (unterschiedlich, eindeutig)

USE erdkunde;

-- Suche alle verschiedenen Länder-IDs der Städte
SELECT laender_id FROM staedte;
SELECT DISTINCT laender_id FROM staedte;

-- Gib die Anzahl der verschiedenen Länder-IDs aus
SELECT COUNT(laender_id) FROM staedte; -- 18
SELECT COUNT(DISTINCT laender_id) FROM staedte; -- 6

-- Die Funktion COUNT() ist praktisch

