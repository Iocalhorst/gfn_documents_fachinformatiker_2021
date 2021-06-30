
DROP DATABASE IF EXISTS fahrten;
CREATE DATABASE fahrten;
USE fahrten;

CREATE TABLE Fahrt
(
	Fahrt_nr INT PRIMARY KEY,
    Datum DATE,
    Fahrtstrecke_km DOUBLE,
    Ort VARCHAR(255),
    Anzahl_Fahrgaeste INT,
    Preis_Fahrt DOUBLE,
    Preis_Zusatzleistung DOUBLE
);

SHOW COLUMNS FROM Fahrt;

INSERT INTO Fahrt VALUES
(2361, '2017-11-09', 17, 'Bernau', 44, 20, 10),
(2362, '2017-11-09', 27, 'Lychen', 42, 30, 11),
(2363, '2017-11-09', 33, 'Eberswalde', 34, 10, 9),
(2364, '2017-11-10', 44, 'Templin', 54, 24, 7),
(2365, '2017-11-10', 55, 'Oranienburg', 46, 29, 19),
(2366, '2017-11-10', 51, 'Wandlitz', 37, 19, 2),
(2367, '2017-11-11', 26, 'Rheinsberg', 51, 17, 12),
(2368, '2017-11-11', 38, 'Fürstenwalde', 49, 26, 16),
(3333, '2017-11-11', 49, 'Neustrelitz', 33, 33, 7);

SELECT * FROM Fahrt;
