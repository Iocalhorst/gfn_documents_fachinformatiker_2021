
USE grandhotel;

-- a)
SELECT g_name, g_vorname, g_strasse, g_plz, g_ort FROM gast WHERE g_stammgast=TRUE;
SELECT g_name, g_vorname, g_strasse, g_plz, g_ort FROM gast WHERE g_stammgast=1;

-- b)
SELECT g_name AS 'Name',
       g_vorname AS 'Vorname',
		 g_strasse AS 'Strasse',
		 g_plz AS 'PLZ',
		 g_ort AS 'Ort'
FROM gast
WHERE g_plz LIKE '3%' ORDER BY g_name ASC;
# WHERE g_plz >= '30000' AND  g_plz <= '39999' ORDER BY g_name;

-- c)
SELECT zimmer_id, kat_preis_EZ, kat_preis_DZ 
FROM zimmer z 
INNER JOIN kategorie k 
ON k.kategorie_id=z.kategorie_id
WHERE k.kat_bezeichnung='Luxussuite';

-- d)
SELECT g_name AS 'Name', g_vorname AS 'Vorname',
       DATEDIFF(r_abreise, r_ankunft) AS 'Aufenthalt in Tagen'
FROM gast INNER JOIN rechnung ON rechnung.gast_id = gast.gast_id
WHERE gast.gast_id = 4713;




