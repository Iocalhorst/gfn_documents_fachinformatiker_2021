
USE erdkunde;

### Gruppieren ###

-- Suche alle verschiedenen Länder-IDs
SELECT id from laender;

-- Suche alle verschiedenen Länder-IDs aus der Tabelle Städte
SELECT DISTINCT laender_id FROM staedte;

-- GROUP BY
SELECT laender_id FROM staedte GROUP BY laender_id;

-- Suche wieviele Städte von den einzelnen Länder-IDs vorhanden sind
-- SELECT COUNT(laender_id) FROM staedte;
SELECT laender_id, COUNT(laender_id) FROM staedte GROUP BY laender_id;

-- Suche die größte Stadt-Einwohnerzahl von jeder Länder-ID
SELECT laender_id, MAX(einwohnerzahl) FROM staedte
GROUP BY laender_id;

-- Suche die größte Stadt-Einwohnerzahl von jedem Land
SELECT laender.`name`, MAX(staedte.einwohnerzahl) FROM staedte
INNER JOIN laender ON staedte.laender_id=laender.id
GROUP BY laender.`name`;

-- Suche von jedem Land die Anzahl der Städte, die ein "A" im Namen haben.
-- Absteigend sortiert nach der Anzahl der Städte
SELECT laender.`name`, COUNT(staedte.id) FROM staedte
INNER JOIN laender ON staedte.laender_id=laender.id
WHERE staedte.`name` LIKE '%A%'
GROUP BY laender.`name`
ORDER BY COUNT(staedte.id) DESC;

-- Bedingung bei GROUP BY: HAVING

-- Suche von allen Ländern mit einem "I" im Namen
-- die Anzahl der Städte, die ein "A" im Namen haben.
-- Absteigend sortiert nach der Anzahl der Städte.
SELECT laender.`name`, COUNT(staedte.id) FROM staedte
INNER JOIN laender ON staedte.laender_id=laender.id
WHERE staedte.`name` LIKE '%A%'
GROUP BY laender.`name` HAVING laender.`name` LIKE '%I%'
ORDER BY COUNT(staedte.id) DESC;

-- WHERE filtert die "Ursprungszeilen" (vor dem Gruppieren)
-- HAVING filtert einzelne Gruppen raus

USE feuerloescher;
-- 6. Schreibe eine SQL-Anweisung, die ausgibt welche Löschmittel bei Feuerlöschern,
--    die vor 2006 in Betrieb genommen wurden, zum Einsatz kommen
--    und wieviele Feuerlöscher es je Löschmittel in der Datenbank gibt.
SELECT ft.loeschmittel, COUNT(ft.loeschmittel)
FROM t_feuerloescher f INNER JOIN t_feuerloeschertyp ft ON f.typ=ft.typ
WHERE f.inbetriebnahme_jahr < 2006
GROUP BY ft.loeschmittel;
































