
DROP DATABASE IF EXISTS grandhotel;

CREATE DATABASE grandhotel;

USE grandhotel;

CREATE TABLE zimmer (
	zimmer_id SMALLINT(4) PRIMARY KEY,
	kategorie_id TINYINT(1)
);

INSERT INTO zimmer VALUES
(101, 1),
(102, 1),
(103, 1),
(104, 2),
(105, 2),
(106, 3),
(107, 3),
(108, 4),
(109, 4);

CREATE TABLE kategorie (
	kategorie_id TINYINT(1) PRIMARY KEY,
	kat_bezeichnung VARCHAR(20),
	kat_preis_ez DEC(6,2),
	kat_preis_dz DEC(6,2)
);

INSERT INTO kategorie VALUES
(1, 'Standard', 70.00, 100.00),
(2, 'Juniorsuite', 80.00, 120.00),
(3, 'Suite', 120.00, 200.00),
(4, 'Luxussuite', 180.00, 280.00);

CREATE TABLE gast (
	gast_id INT PRIMARY KEY AUTO_INCREMENT,
	g_name VARCHAR(50),
	g_vorname VARCHAR(50),
	g_strasse VARCHAR(100),
	g_plz VARCHAR(10),
	g_ort VARCHAR(140),
	g_stammgast TINYINT(1)
);

INSERT INTO gast VALUES
(4711, 'Meier', 'Hans', 'Hauptstr. 1', '11111', 'Adorf', 1),
(4712, 'Schulze', 'Fritz', 'Mainweg 23', '22222', 'Bhausen', 0),
(4713, 'Müller', 'Willi', 'Fuldaweg 5', '33333', 'Ostadt', 0),
(4714, 'Schmidt', 'Herbert', 'Deinweg 99', '34444', 'Entendorf', 0);

CREATE TABLE rechnung (
	rechnung_id INT PRIMARY KEY AUTO_INCREMENT,
	gast_id INT,
	zimmer_id SMALLINT(4),
	r_belegung VARCHAR(2),
	r_ankunft DATE,
	r_abreise DATE
);

INSERT INTO rechnung VALUES
(1, 4711, 102, 'EZ', '2007-11-10', '2007-11-12'),
(2, 4712, 102, 'DZ', '2007-11-13', '2007-11-14'),
(3, 4713, 104, 'DZ', '2007-11-10', '2007-11-20');
