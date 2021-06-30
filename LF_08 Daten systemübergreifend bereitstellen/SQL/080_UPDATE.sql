
USE erdkunde;

-- UPDATE

-- Ändere die Einwohnerzahl von Berlin auf den aktuellen Wert: 3.748.000
UPDATE staedte SET einwohnerzahl=3748000 WHERE `name`='Berlin';
# SELECT * FROM staedte WHERE `name`='Berlin';

-- Verdopple die Einwohnerzahl aller Städte mit der laender_id=1
UPDATE staedte SET einwohnerzahl=einwohnerzahl*2 WHERE laender_id=1;
SELECT * FROM staedte WHERE laender_id=1;

-- Ändere den Ländernamen von 'USA' in 'Vereinigte Staaten von Amerika'
UPDATE laender SET `name`='Vereinigte Staaten von Amerika' WHERE `name`='USA' LIMIT 1;
SELECT * FROM laender;


