
### BioScan ###

DROP DATABASE IF EXISTS bioscan;
CREATE DATABASE bioscan;
USE bioscan;

SET foreign_key_checks = 1;

CREATE TABLE Person (
	PersID INT PRIMARY KEY AUTO_INCREMENT,
	Nachname VARCHAR(255),
	Vorname VARCHAR(255),
	Strasse VARCHAR(255),
	Plz VARCHAR(255),
	Ort VARCHAR(255)
);
INSERT INTO Person VALUES
(101, 'Müller', 'Max', 'Müllerweg 1', '52335', 'Köln'),
(202, 'Meier', 'Willi', 'Testweg 12', '43333', 'Dortmund'),
(404, 'Wester', 'Klaus', 'Hauptstr. 13', '55667', 'Köln');

CREATE TABLE Gebaeude (
	GebID INT PRIMARY KEY AUTO_INCREMENT,
	Bezeichnung VARCHAR(255),
	Strasse VARCHAR(255),
	Plz VARCHAR(255),
    Ort VARCHAR(255)
);
INSERT INTO Gebaeude VALUES
(1, 'Forschung H', 'Heinrich-Hertz-Str. 12', '50501', 'Köln'),
(2, 'Forschung U', 'Heinrich-Hertz-Str. 14', '50501', 'Köln'),
(3, 'Forschung I', 'Heinrich-Hertz-Str. 16', '50501', 'Köln'),
(4, 'Verwaltung', 'Transallee 22', '50555', 'Köln');

CREATE TABLE Merkmal (
	MerkID INT PRIMARY KEY AUTO_INCREMENT,
	Merkmal VARCHAR(255)
);
INSERT INTO Merkmal VALUES
(1, 'Fingerabdruck'),
(2, 'Iris');

CREATE TABLE Raum (
	RaumID INT PRIMARY KEY AUTO_INCREMENT,
	Typ VARCHAR(255),
	GebID INT,
	MerkID INT,
    FOREIGN KEY (GebID) REFERENCES Gebaeude (GebID),
    FOREIGN KEY (MerkID) REFERENCES Merkmal (MerkID)
);
INSERT INTO Raum VALUES
(1, 'Besprechungsraum', 2, 1),
(2, 'Labor', 2, 2),
(3, 'Labor', 1, 2),
(4, 'Labor', 1, 2),
(5, 'Besprechungsraum', 1, 1),
(6, 'Labor', 3, 2),
(7, 'Labor', 3, 2),
(8, 'Labor', 3, 2);

CREATE TABLE Zugang (
	RaumID INT AUTO_INCREMENT,
	PersID INT,
	ZeitVon TIME,
	ZeitBis TIME,
    PRIMARY KEY (RaumID, PersID),
    FOREIGN KEY (RaumID) REFERENCES Raum (RaumID),
    FOREIGN KEY (PersID) REFERENCES Person (PersID)
);
INSERT INTO Zugang VALUES
(1, 101, '08:00', '10:00'),
(1, 202, '10:00', '14:00'),
(2, 101, '14:00', '18:00'),
(5, 404, '08:00', '18:00');

SET foreign_key_checks = 1;

SELECT 'Erfolgreich' AS 'Status';
