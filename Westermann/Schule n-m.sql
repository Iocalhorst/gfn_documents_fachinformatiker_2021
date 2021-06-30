# SHOW DATABASES;

DROP DATABASE IF EXISTS gfn_test;
CREATE DATABASE IF NOT EXISTS gfn_test;
USE gfn_test;

# Kommentar
-- Kommentar
/*
 * Mehrzeiliger Kommentar
 * 
 */

CREATE TABLE klasse
(
    klassen_nr INT PRIMARY KEY,
    name VARCHAR(255)
);

# SHOW TABLES;
# SHOW COLUMNS FROM klasse;
INSERT INTO klasse (klassen_nr, name) VALUES (1, 'LF-08');
INSERT INTO klasse (klassen_nr, name) VALUES (2, 'LF-05');
INSERT INTO klasse VALUES (3, 'LF-11a');
SELECT * FROM klasse;

CREATE TABLE schueler
(
    schueler_nr INT PRIMARY KEY,
    vorname VARCHAR(255),
    nachname VARCHAR(255)
);

# SHOW COLUMNS FROM schueler;

INSERT INTO schueler VALUES (1, 'Peter', 'Wellert');
INSERT INTO schueler (schueler_nr, vorname) VALUES (2, 'Mary');
INSERT INTO schueler VALUES (3, 'Klaus', NULL);
SELECT * FROM schueler;

-- INNER JOIN
# SELECT * FROM klasse INNER JOIN schueler ON klasse.klassen_nr=schueler.klassen_nr;

CREATE TABLE klasse_schueler
(
    klassen_nr INTEGER,
    schueler_nr INT
);

INSERT INTO klasse_schueler VALUES (1, 1), (1, 2), (1, 3), (2, 3), (3, 1), (3, 2);
SELECT * FROM klasse_schueler;

SELECT * FROM klasse 
INNER JOIN klasse_schueler ON klasse.klassen_nr=klasse_schueler.klassen_nr
INNER JOIN schueler ON klasse_schueler.schueler_nr=schueler.schueler_nr;

SELECT NAME, vorname FROM klasse 
INNER JOIN klasse_schueler ON klasse.klassen_nr=klasse_schueler.klassen_nr
INNER JOIN schueler ON klasse_schueler.schueler_nr=schueler.schueler_nr;













