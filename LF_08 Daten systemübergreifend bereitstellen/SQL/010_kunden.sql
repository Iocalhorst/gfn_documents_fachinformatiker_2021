
# 1:1-Beziehung

DROP DATABASE IF EXISTS kunden;
CREATE DATABASE kunden;
USE kunden;

CREATE TABLE personen
(
   id INT PRIMARY KEY AUTO_INCREMENT,
   anrede VARCHAR(255),
   vorname VARCHAR(255),
   nachname VARCHAR(255),
   email VARCHAR(255)
);

# SHOW COLUMNS FROM personen;



# SELECT * FROM personen;

CREATE TABLE personendetails
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	strasse VARCHAR(255),
	hausnr VARCHAR(255),
	plz VARCHAR(255),
	ort VARCHAR(255),
	telnr VARCHAR(255) 
);

# SHOW COLUMNS FROM personendetails;
INSERT INTO personen (anrede, vorname, nachname, email) VALUES
('Herr', 'Peter', 'Wellert', 'peter@web.de'),
('Herr', 'Klaus', 'Meyer', 'klaus@web.de'),
('Frau', 'Mary', 'Schmidt', 'mary@web.de');

INSERT INTO personendetails (strasse, hausnr, plz, ort, telnr) VALUES
('Eberswalder Str.', '30', '10437', 'Berlin', '+491636861296'),
('Dunker Str.',      '10', '10437', 'Berlin', '+491636861978'),
('Lychener Str.',     '3', '10437', 'Berlin', '+491655555555');

# SELECT * FROM personendetails;

# Kreuzprodukt
# SELECT * FROM personen, personendetails;

# SELECT * FROM personen, personendetails WHERE personen.id=personendetails.id;

SELECT * FROM personen INNER JOIN personendetails;

SELECT * FROM personen INNER JOIN personendetails ON personen.id=personendetails.id;

# SELECT personen.id, anrede, vorname, ort # Spalten aus einer der Tabellen
# SELECT personen.id, personen.anrede, personen.vorname, personendetails.ort # Spalten aus einer der Tabellen
# FROM personen
# INNER JOIN personendetails ON personen.id=personendetails.id;




























