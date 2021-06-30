
-- MySQL-Funktionen
-- https://www.w3schools.com/sql/sql_ref_mysql.asp

/*
-- Runden - Kaufmännisches Runden
SELECT ROUND(4.49); -- 4
SELECT ROUND(4.5);  -- 5
SELECT ROUND(4.12345, 4);  -- 4.1235

-- Abrunden (Richtung Minus-Unendlich)
SELECT FLOOR(1.89); -- 1
SELECT FLOOR(-1.89); -- -2

-- Aufrunden (Richtung Unendlich)
SELECT CEIL(1.23); -- 2
SELECT CEIL(-1.23); -- -1
*/
-- CONCAT(str1, str2, ...)
# SELECT * FROM kunden.personen;
# SELECT nachname, vorname FROM kunden.personen;
# SELECT CONCAT(nachname, ', ', vorname) AS 'Name' FROM kunden.personen;

-- SUBSTRING(str, pos, len)
SELECT SUBSTRING(vorname, 1, 2) AS 'Ersten beiden Buchstaben des Vornamens'
FROM kunden.personen;

SELECT CONCAT(nachname, ', ', SUBSTRING(vorname, 1, 1), '.')
FROM kunden.personen;

# SELECT * FROM kunden.personen WHERE id=1;

-- UPPER - Großschreibung
# # SELECT UPPER(vorname), nachname FROM kunden.personen;

-- LEFT(str, len) - Holt von links die Anzahl der Zeichen
SELECT LEFT(vorname, 1) FROM kunden.personen;

USE grandhotel;
SHOW TABLES;
SELECT * FROM gast;
SELECT * FROM gast WHERE LEFT(g_plz, 1) = '3';












