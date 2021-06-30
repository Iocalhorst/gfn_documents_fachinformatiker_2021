
-- DELETE

USE erdkunde;

DELETE FROM staedte WHERE `name`='Hamburg';
SELECT * FROM staedte;

-- Zur Sicherheit LIMIT 1;
DELETE FROM staedte WHERE `name`='Hamburg' LIMIT 1;

-- VORSICHT: So werden alle Datensätze gelöscht
# DELETE FROM staedte;

-- Lösche alle Städte mit der id von 9 bis 13
DELETE FROM staedte WHERE id>=9 AND id<=13;
DELETE FROM staedte WHERE id BETWEEN 9 AND 13;

DELETE FROM staedte;

INSERT INTO staedte (`name`, einwohnerzahl, laender_id)
VALUES ('Lohne', 36000, 1);

SELECT * FROM staedte;

# DELETE setzt NICHT den AUTO_INCREMENT zurück !!!

# TRUNCATE setzt in die Tabelle in die "Werkseinstellungen" zurück
# (den Zustand direkt nach dem CREATE TABLE).
# TRUNCATE setzt auch den AUTO_INCREMENT zurück
TRUNCATE staedte;

INSERT INTO staedte (`name`, einwohnerzahl, laender_id)
VALUES ('Vechta', 38000.0, 1);

SELECT * FROM staedte;






