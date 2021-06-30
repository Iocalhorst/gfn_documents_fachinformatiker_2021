
-- Filmverwaltung (n:m)

DROP DATABASE IF EXISTS filmverwaltung;
CREATE DATABASE filmverwaltung;
USE filmverwaltung;

CREATE TABLE schauspieler
(
	id INT PRIMARY KEY AUTO_INCREMENT,
   vorname VARCHAR(255),
   nachname VARCHAR(255)
);

CREATE TABLE filme
(
	id INT PRIMARY KEY AUTO_INCREMENT,
   titel VARCHAR(255),
   jahr YEAR
);

CREATE TABLE darstellungen
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	s_id INT,
   f_id INT
);

INSERT INTO filme (titel, jahr) VALUES
('Godzilla', 1998),
('Leon der Profi', 1994),
('Starwars 1', 1999);

INSERT INTO schauspieler (vorname, nachname) VALUES
('Jean', 'Reno'),
('Matthew', 'Brodrick'),
('Natalie', 'Portman');

INSERT INTO darstellungen (s_id, f_id) VALUES
(1, 1),
(1, 2),
(2, 1),
(3, 2),
(3, 3);

# SELECT * FROM filme;
# SELECT * FROM schauspieler;
# SELECT * FROM darstellungen;

-- Gib alle Darstellungen mit den Namen der Schauspieler, den Filmtiteln und dem Jahr aus:
# SELECT * FROM filme;
# SELECT * FROM filme INNER JOIN darstellungen ON filme.id=darstellungen.f_id;
SELECT * FROM filme
INNER JOIN darstellungen ON filme.id=darstellungen.f_id
INNER JOIN schauspieler ON schauspieler.id=darstellungen.s_id;

SELECT * FROM filme f
INNER JOIN darstellungen d ON f.id=d.f_id
INNER JOIN schauspieler s ON s.id=d.s_id;

SELECT s.Vorname, s.Nachname, f.Titel, f.Jahr
FROM filme f
INNER JOIN darstellungen d ON f.id=d.f_id
INNER JOIN schauspieler s ON s.id=d.s_id;









