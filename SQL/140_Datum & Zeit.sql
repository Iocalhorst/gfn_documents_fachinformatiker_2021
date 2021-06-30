
-- Datum & Zeit

DROP DATABASE IF EXISTS exkurse;
CREATE DATABASE exkurse;
USE exkurse;

-- Datentypen für Datum & Zeit:
CREATE TABLE zeiten
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	uhrzeit TIME,
	datum DATE,
	zeitpunkt DATETIME,
	jahr YEAR
);

# SHOW COLUMNS FROM zeiten;

INSERT INTO zeiten (uhrzeit, datum, zeitpunkt, jahr)
VALUES ('09:48:37', '2021-06-25', '2021-06-25 09:48:37', 2021);

# SELECT * FROM zeiten;

-- Funktionen für Datum & Zeit:
# SELECT CURTIME(); -- 09:48:37
# SELECT CURDATE(); -- 2021-06-25
# SELECT NOW();     -- 2021-06-25 09:48:37

# SELECT YEAR('2021-06-25'); -- 2021
# SELECT YEAR('2021-06-25 09:48:37'); -- 2021
# SELECT YEAR(NOW()); -- 2021


INSERT INTO zeiten (uhrzeit, datum, zeitpunkt, jahr)
VALUES (CURTIME(), CURDATE(), NOW(), YEAR(NOW()));

# SELECT * FROM zeiten;
/*
SELECT TIME('2021-06-25 09:48:37');  -- 09:48:37
SELECT DATE('2021-06-25 09:48:37');  -- 2021-06-25
SELECT HOUR('2021-06-25 09:48:37');  -- 9
SELECT MONTH('2021-06-25 09:48:37'); -- 6
SELECT DAY('2021-06-25 09:48:37');   -- 25
SELECT WEEKDAY('2021-06-25 09:48:37');   -- 4 (Montag -> 0)
*/
SELECT YEAR(zeitpunkt) AS 'Jahr',
       DATE(zeitpunkt) AS 'Datum',
       TIME(zeitpunkt) AS 'Zeit'
FROM zeiten;

SELECT DATEDIFF('2020-03-01', '2020-02-28'); -- 2
SELECT DATEDIFF('2021-03-01', '2021-02-28'); -- 1

SELECT ADDDATE('2020-02-28', 1); -- 2020-02-29
SELECT ADDDATE('2021-02-28', 1); -- 2021-03-01
































