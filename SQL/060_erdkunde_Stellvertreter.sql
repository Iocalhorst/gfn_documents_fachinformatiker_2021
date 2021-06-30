
-- Stellvertreter (Alias) für Tabellen

USE erdkunde;

-- Suche alle Städte mit ihrem Namen und dem Ländernamen
SELECT staedte.`name`, laender.`name` FROM staedte
INNER JOIN laender ON laender_id=laender.id;


-- Mit Stellvertretern:
-- Erster Buchstabe ist der Standard
-- Wird im FROM (oder INNER JOIN) hinter dem Tabellennamen definiert.
SELECT s.`name`, l.`name` AS 'Ländername' FROM staedte s
INNER JOIN laender l ON s.laender_id=l.id;

