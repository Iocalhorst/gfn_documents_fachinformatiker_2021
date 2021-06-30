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
    klassen_nr INT,
    name VARCHAR(255)
);

# SHOW TABLES;
# SHOW COLUMNS FROM klasse;

CREATE TABLE schueler
(
    schueler_nr INT,
    vorname VARCHAR(255),
    nachname VARCHAR(255),
    klassen_nr INT
);

# SHOW COLUMNS FROM schueler;

INSERT INTO klasse (klassen_nr, name) VALUES (1, 'LF-08');
# SELECT * FROM klasse;

INSERT INTO schueler VALUES (1, 'Peter', 'Wellert', 1);
INSERT INTO schueler VALUES (2, 'Mary', 'Wellert', 1);
# SELECT * FROM schueler;

-- INNER JOIN
SELECT * FROM klasse INNER JOIN schueler ON klasse.klassen_nr=schueler.klassen_nr;









