
DROP DATABASE IF EXISTS fahrzeugverwaltung;

CREATE DATABASE fahrzeugverwaltung;

USE fahrzeugverwaltung;

CREATE TABLE fahrzeuge
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	hersteller VARCHAR(30),
	modell VARCHAR(30),
	karosserieform VARCHAR(30),
	baujahr YEAR,
	kilometerstand INT,
	kaufpreis DEC(8,2),
	angebotspreis DEC(8,2),
	besonderheit VARCHAR(30),
	stellplatznr INT
);

SHOW COLUMNS FROM fahrzeuge;

INSERT INTO fahrzeuge VALUES
(1,'Volkswagen AG', 'Golf', 'Kombi', 2000, 176500, 1000, 2500, 'Schrott', 22),
(2,'BMW', '3er', 'Stufenheck', 2001, 16500, 9000, 9500, '', 0),
(3,'Mercedes', 'S-Klasse', 'Kombi', 2004, 17600, 7000, 7500, 'Schrott', 7),
(4,'Skoda', 'Octavia', 'Kombi', 2002, 76500, 9200, 9900, '', 23),
(5,'BMW', '3er', 'Kombi', 2002, 196500, 1800, 2500, 'Generalüberholt', 0),
(6,'BMW', '3er', 'Cabrio', 2000, 16500, 10000, 11100, '', 12),
(7,'Volkswagen AG', 'Golf', 'Schräghecklimousine', 2003, 146500, 8000, 8700, '', 9),
(8,'Volkswagen AG', 'Golf', 'Kombi', 2010, 100, 11000, 12500, '', 2),
(9,'Mercedes', 'S-Klasse', 'Limousine', 2011, 1500, 21000, 22500, 'Generalüberholt', 11),
(10,'Volkswagen AG', 'Golf', 'Schräghecklimousine', 2008, 6500, 30000, 32500, 'Schrott', 14);

SELECT * FROM fahrzeuge;