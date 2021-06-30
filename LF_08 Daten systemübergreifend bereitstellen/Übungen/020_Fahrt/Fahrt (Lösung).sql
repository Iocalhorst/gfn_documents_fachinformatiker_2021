USE fahrten;

-- ba)
SELECT MAX(Fahrtstrecke_km) AS 'km' FROM Fahrt; -- 55

SELECT Fahrtstrecke_km AS 'km' FROM Fahrt
ORDER BY Fahrtstrecke_km DESC LIMIT 1; -- 55


-- bb)
SELECT Anzahl_Fahrgaeste AS 'Anzahl der Fahrgäste'
FROM Fahrt WHERE Fahrt_nr=2367; -- 51

SELECT Fahrt.Anzahl_Fahrgaeste AS 'Anzahl der Fahrgäste'
FROM Fahrt WHERE Fahrt.Fahrt_nr=2367; -- 51


-- bc)
SELECT SUM(Preis_Fahrt) AS 'Summe aller Preise pro Fahrt'
FROM Fahrt WHERE Datum='2017-11-10'; -- 72


-- bd)
INSERT INTO Fahrt (Fahrt_nr, Datum, Ort, Preis_Fahrt)
VALUES (6789, '2017-11-10', 'Hamburg', 35.5);
SELECT * FROM Fahrt;
DELETE FROM Fahrt WHERE Fahrt_nr=6789;

INSERT INTO Fahrt VALUES (6789, '2017-11-10', NULL, 'Hamburg', NULL, 35.5, NULL);
SELECT * FROM Fahrt;
DELETE FROM Fahrt WHERE Fahrt_nr=6789;

-- be)
UPDATE FAHRT SET Preis_Zusatzleistung=Preis_Zusatzleistung+10.3
    WHERE Fahrt_nr=3333;
SELECT * FROM Fahrt; -- 17.3
UPDATE FAHRT SET Preis_Zusatzleistung=7 WHERE Fahrt_nr=3333;







