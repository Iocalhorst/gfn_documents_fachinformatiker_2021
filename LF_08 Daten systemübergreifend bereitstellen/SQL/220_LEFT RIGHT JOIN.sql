
USE erdkunde;

-- LEFT|RIGHT (OUTER) JOIN

SELECT * FROM staedte;
SELECT * FROM laender;

-- Per INNER JOIN verbinden
SELECT * FROM staedte INNER JOIN laender ON laender_id=laender.id;
-- 20 (Köln fehlt, da es laender_id=NULL hat)

-- LEFT JOIN
SELECT * FROM staedte LEFT JOIN laender ON laender_id=laender.id;
-- 21 (alle Städte sind da)
-- LEFT JOIN füllt die Ergebnistabelle
-- mit den restlichen Datensätzen der linken Tabelle auf

-- RIGHT JOIN
SELECT * FROM staedte RIGHT JOIN laender ON laender_id=laender.id;
-- 22 (auch die Länder ohne Stadt sind da, aber Köln fehlt wieder)
-- RIGHT JOIN füllt die Ergebnistabelle
-- mit den restlichen Datensätzen der rechten Tabelle auf

-- In der Praxis wird quasi nur der LEFT JOIN benutzt
-- und bei Bedarf die Reihenfolge der Tabellen umgedreht
SELECT * FROM laender LEFT JOIN staedte ON laender_id=laender.id;
-- Identische Zeilen wie beim RIGHT JOIN drüber
-- (abgesehen von der Spaltenreihenfolge bei Stern)

-- FULL OUTER JOIN (in MySQL):
SELECT * FROM staedte LEFT JOIN laender ON laender_id=laender.id
UNION
SELECT * FROM staedte RIGHT JOIN laender ON laender_id=laender.id;
-- 23 (alle 21 Städte plus die zwei Länder, die keine Stadt haben)








