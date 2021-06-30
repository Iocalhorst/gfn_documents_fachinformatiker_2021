
-- UNION [ALL]

DROP DATABASE IF EXISTS exkurse;
CREATE DATABASE exkurse;
USE exkurse;

CREATE TABLE personen1
(
	id INT PRIMARY KEY AUTO_INCREMENT,
   vorname VARCHAR(255)
);

CREATE TABLE personen2
(
	id INT PRIMARY KEY AUTO_INCREMENT,
   vorname VARCHAR(255)
);

INSERT INTO personen1 (vorname) VALUES
('Peter'), ('Paul'), ('Mary'), ('Hinz'), ('Kunz');

INSERT INTO personen2 (vorname) VALUES
('Peter'), ('Paul'), ('Mary'), ('Hein');

-- Mit UNION [ALL] kann man zwei strukturell gleiche Abfragen verbinden
-- Die Anzahl der Spalten muss gleich

SELECT vorname FROM personen1
UNION ALL
SELECT vorname FROM personen2;
-- Peter, Paul, Mary, Hinz, Kunz, Peter, Paul, Mary, Hein

-- UNION - Die doppelten Datensätze werden entfernt
SELECT vorname FROM personen1
UNION
SELECT vorname FROM personen2;
-- Peter, Paul, Mary, Hinz, Kunz, Hein

-- Hole alle verschiedenen Vornamen aus personen1 & personen2,
-- die ein "a" oder "e" im Vornamen haben
SELECT vorname FROM personen1 WHERE vorname LIKE '%a%' OR vorname LIKE '%e%'
UNION
SELECT vorname FROM personen2 WHERE vorname LIKE '%a%' OR vorname LIKE '%e%';
-- Peter, Paul, Mary, Hein

USE Feuerloescher;
-- Erstelle eine Liste mit allen Herstellern und Wartungsunternehmen
SELECT firma FROM t_hersteller
UNION ALL
SELECT firma FROM t_wartungsunternehmen;

-- Zusatzspalte mit festem Wert
SELECT firma, 'Hersteller' AS 'Firmenart' FROM t_hersteller;

SELECT firma, 'Hersteller' AS 'Firmenart' FROM t_hersteller
UNION ALL
SELECT firma, 'Wartungsunternehmen' AS 'Firmenart' FROM t_wartungsunternehmen;

















