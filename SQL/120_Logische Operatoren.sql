
USE erdkunde;

-- Logische Operatoren

-- AND
-- Suche alle Städte mit der laender_id=1,
-- die mehr als 2.000.000 Einwohner haben.
# SELECT `name`, einwohnerzahl FROM staedte
SELECT * FROM staedte
WHERE laender_id=1 AND einwohnerzahl>2000000;
/*
SELECT 0 AND 0; -- 0
SELECT 1 AND 0; -- 0
SELECT 0 AND 1; -- 0
SELECT 1 AND 1; -- 1
*/
-- OR (und/oder)
-- Suche alle Städte aus Deutschland oder den USA.
SELECT * FROM staedte
INNER JOIN laender ON laender_id=laender.id
WHERE laender.`name`='Deutschland' OR laender.`name`='USA';
/*
SELECT 0 OR 0; -- 0
SELECT 1 OR 0; -- 1
SELECT 0 OR 1; -- 1
SELECT 1 OR 1; -- 1
*/
-- XOR (entweder oder)
-- Suche alle Städte, die entweder aus Deutschland sind
-- oder unter 2.000.000 Einwohner haben.
SELECT * FROM staedte
INNER JOIN laender ON laender_id=laender.id
WHERE laender.`name`='Deutschland' XOR staedte.einwohnerzahl<2000000;
-- 10 Städte -> Berlin und die ausländischen Städte unter 2 Millionen
/*
SELECT 0 XOR 0; -- 0
SELECT 1 XOR 0; -- 1
SELECT 0 XOR 1; -- 1
SELECT 1 XOR 1; -- 0
*/

SELECT * FROM staedte
INNER JOIN laender ON laender_id=laender.id;














