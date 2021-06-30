DROP DATABASE IF EXISTS feuerloescher;
CREATE DATABASE feuerloescher;
USE feuerloescher;

CREATE TABLE t_feuerloeschertyp
(
	typ VARCHAR(10) PRIMARY KEY,
	hersteller_nr INT,
	gewicht_gefüllt_kg DECIMAL(3,1),
	loeschmittel VARCHAR(12),
	loeschmittel_menge_kg INT

);

SHOW COLUMNS FROM t_feuerloeschertyp;

INSERT INTO t_feuerloeschertyp VALUES
('4711CO2102', 4711, 14.7, 'Kohlendioxyd', 5),
('7711C48802', 7711, 12.7, 'Schaum', 3),
('2789B87699', 2789, 9.7, 'ABC-Pulver', 1);

SELECT * FROM t_feuerloeschertyp;


CREATE TABLE t_hersteller
(
	hersteller_nr INT PRIMARY KEY,
	firma VARCHAR(50)

);

SHOW COLUMNS FROM t_hersteller;

INSERT INTO t_hersteller VALUES
(4711, 'Feurio GmbH'),
(7711, 'Atlas AG'),
(2789, 'Meyer & Söhne');

SELECT * FROM t_hersteller;


CREATE TABLE t_wartungsunternehmen
(
	wartungsunternehmer_nr INT PRIMARY KEY,
	firma VARCHAR(50)
);

SHOW COLUMNS FROM t_wartungsunternehmen;

INSERT INTO t_wartungsunternehmen VALUES
(123, 'Meier Brandschutz'),
(555, 'Klappt schon AG'),
(842, "Wenn's brennt GmbH");

SELECT * FROM t_wartungsunternehmen;


CREATE TABLE t_feuerloescher
(
	feuerloescher_nr INT PRIMARY KEY,
	typ VARCHAR(20),
	standort VARCHAR(50),
	inbetriebnahme_jahr YEAR,
	prueffrist_jahren INT,
	letzte_pruefung_jahr YEAR,
	wartungsunternehmer_nr INT
);

INSERT INTO t_feuerloescher VALUES
(1234, '4711CO2102', 'G1R305', 2006, 2, 2010, 123),
(1235, '4711CO2102', 'G1R306', 2004, 3, 2010, 842),
(1236, '7711C48802', 'G2R305', 2006, 2, 2010, 555),
(1237, '7711C48802', 'G2R310', 2003, 1, 2010, 123),
(1238, '2789B87699', 'G2R405', 2006, 2, 2010, 555),
(1239, '2789B87699', 'G1R205', 2005, 4, 2009, 123),
(1240, '4711CO2102', 'G1R105', 2005, 2, 2009, 842),
(1241, '2789B87699', 'G2R305', 2002, 3, 2008, 555),
(1242, '2789B87699', 'G1R205', 2003, 3, 2009, 123),
(1243, '7711C48802', 'G1R107', 2006, 2, 2010, 842),
(1244, '7711C48802', 'G2R305', 2007, 2, 2009, 555),
(1245, '4711CO2102', 'G2R207', 2006, 2, 2010, 555),
(1246, '7711C48802', 'G2R306', 2008, 3, 2008, 123),
(1247, '2789B87699', 'G2R105', 2006, 2, 2010, 842),
(1248, '2789B87699', 'G1R108', 2009, 3, 2009, 842),
(1249, '4711CO2102', 'G2R209', 2003, 2, 2009, 123);

SELECT * FROM t_feuerloescher;
