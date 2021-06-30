USE feuerloescher;

-- ba)
SELECT t_feuerloescher.standort AS 'Standort',
       t_feuerloescher.feuerloescher_nr AS 'Feuerlöscher Nr.',
       t_feuerloescher.typ AS 'Typ'
FROM t_feuerloescher
WHERE t_feuerloescher.letzte_pruefung_jahr + t_feuerloescher.prueffrist_jahren = 2011;
-- Stellvertreter:
SELECT f.standort AS 'Standort',
       f.feuerloescher_nr AS 'Feuerlöscher Nr.',
       f.typ AS 'Typ'
FROM t_feuerloescher f
WHERE f.letzte_pruefung_jahr + f.prueffrist_jahren = 2011;



-- bb)
SELECT t_feuerloescher.feuerloescher_nr AS 'Feuerlöscher Nr.',
	   t_feuerloescher.typ AS 'Typ',
	   t_feuerloeschertyp.loeschmittel AS 'Löschmittel',
	   t_feuerloescher.standort AS 'Standort',
	   t_feuerloescher.letzte_pruefung_jahr AS 'Jahr der letzten Prüfung'
FROM t_feuerloescher INNER JOIN t_feuerloeschertyp
ON t_feuerloescher.typ=t_feuerloeschertyp.typ
WHERE t_feuerloeschertyp.loeschmittel = 'Kohlendioxyd';
-- Stellvertreter:
SELECT f.feuerloescher_nr AS 'Feuerlöscher Nr.',
	   f.typ AS 'Typ',
	   ft.loeschmittel AS 'Löschmittel',
	   f.standort AS 'Standort',
	   f.letzte_pruefung_jahr AS 'Jahr der letzten Prüfung'
FROM t_feuerloescher f INNER JOIN t_feuerloeschertyp ft
ON f.typ=ft.typ
WHERE ft.loeschmittel='Kohlendioxyd';


-- c)
SELECT t_feuerloescher.typ,
	   t_feuerloescher.wartungsunternehmer_nr,
	   t_wartungsunternehmen.firma,
	   t_feuerloescher.standort,
	   t_feuerloescher.feuerloescher_nr,
	   t_feuerloescher.letzte_pruefung_jahr
FROM t_feuerloescher INNER JOIN t_wartungsunternehmen
ON t_feuerloescher.wartungsunternehmer_nr=t_wartungsunternehmen.wartungsunternehmer_nr
WHERE t_feuerloescher.typ='4711CO2102'
ORDER BY t_feuerloescher.wartungsunternehmer_nr, t_feuerloescher.standort;
-- Stellvertreter:
SELECT f.feuerloescher_nr,
       f.typ,
	   f.wartungsunternehmer_nr,
	   w.firma,-
	   f.standort,
	   f.letzte_pruefung_jahr
FROM t_feuerloescher f INNER JOIN t_wartungsunternehmen w
ON f.wartungsunternehmer_nr=w.wartungsunternehmer_nr
WHERE f.typ="4711CO2102"
ORDER BY f.wartungsunternehmer_nr, f.standort;













