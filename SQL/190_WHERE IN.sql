
USE erdkunde;

-- WHERE ... [NOT] IN ...
-- WHERE [NOT] ... IN ...

-- Suche alle Städte, welche die Länder-ID "1" oder "2"
# SELECT * FROM staedte;
# SELECT * FROM staedte WHERE laender_id=1;
# SELECT * FROM staedte WHERE laender_id=1 OR laender_id=2;
### GEHT NICHT!!!: SELECT * FROM staedte WHERE laender_id=1 OR 2;

# SELECT * FROM staedte WHERE laender_id IN (1, 2);
# SELECT * FROM staedte WHERE laender_id IN (1, 2) ORDER BY laender_id;

-- Suche alle Städte, aus den Ländern "Italien" und/oder "Spanien".
SELECT * FROM staedte;
SELECT * FROM staedte s INNER JOIN laender l ON s.laender_id=l.id;
SELECT * FROM staedte s INNER JOIN laender l ON s.laender_id=l.id
WHERE l.name = "Italien"; 
SELECT * FROM staedte s INNER JOIN laender l ON s.laender_id=l.id
WHERE l.name = "Italien" OR l.name = "Spanien"; 
SELECT * FROM staedte s INNER JOIN laender l ON s.laender_id=l.id
WHERE l.name IN ("Italien", "Spanien"); 

-- Suche alle Städte, die NICHT aus den Länder "Frankreich", "Spanien" oder "USA" sind.
SELECT * FROM staedte s INNER JOIN laender l ON s.laender_id=l.id
WHERE l.name IN ("Frankreich", "Spanien", "USA");
-- WHERE ... NOT IN ...
SELECT * FROM staedte s INNER JOIN laender l ON s.laender_id=l.id
WHERE l.name NOT IN ("Frankreich", "Spanien", "USA");
-- WHERE NOT ... IN ...
SELECT * FROM staedte s INNER JOIN laender l ON s.laender_id=l.id
WHERE NOT l.name IN ("Frankreich", "Spanien", "USA"); 

-- Lösung ohne WHERE ... IN ...
SELECT * FROM staedte s INNER JOIN laender l ON s.laender_id=l.id
WHERE l.name <> "Frankreich" AND l.name <> "Spanien" AND l.name <> "USA"; 















