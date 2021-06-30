/*

Die Tabelle 'bestellung' sollte momentan wie folgt aussehen:

+---------------+--------------+------+-----+---------+----------------+
| Field         | Type         | Null | Key | Default | Extra          | 
+---------------+--------------+------+-----+---------+----------------+
| bestellnummer | int(11)      | NO   | PRI | null    | auto_increment | 
| artikelnummer | int(11)      | YES  |     | null    |                | 
| kundennummer  | int(11)      | YES  |     | null    |                | 
| artikelanzahl | int(11)      | YES  |     | null    |                | 
| bestellsumme  | decimal(7,2) | YES  |     | null    |                | 
+---------------+--------------+------+-----+---------+----------------+

Füge folgende Bestellungen ein:

2 Artikel Nummer 1 durch Kunden mit der Kundennummer 4 mit einer Bestellsumme von 199.98
1 Artikel Nummer 2 durch Kunden mit der Kundennummer 1 mit einer Bestellsumme von 199.99
3 Artikel Nummer 1 durch Kunden mit der Kundennummer 2 mit einer Bestellsumme von 299.97
1 Artikel Nummer 3 durch Kunden mit der Kundennummer 3 mit einer Bestellsumme von 299.99
5 Artikel Nummer 5 durch Kunden mit der Kundennummer 5 mit einer Bestellsumme von 2499.95
*/
