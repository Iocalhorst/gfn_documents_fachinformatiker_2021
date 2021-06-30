
# WHERE und Vergleichsoperatoren

USE erdkunde;

-- Suche die Stadt namens Berlin (gleich: =)
# SELECT * FROM staedte WHERE `name` = 'Berlin';
# SELECT * FROM staedte WHERE `name` = 'berlin';

-- Suche alle Städte, die nicht Berlin heissen (ungleich: <>, !=, NOT)
# SELECT * FROM staedte WHERE `name` <> 'Berlin';
# SELECT * FROM staedte WHERE `name` != 'Berlin';
# SELECT * FROM staedte WHERE NOT `name` = 'Berlin';

-- Suche alle Städte mit den IDs von 2 bis 7 (BETWEEN ... AND ...)
-- Grenzwerte sind immer beide inklusive
# SELECT * FROM staedte WHERE id BETWEEN 2 AND 7;
# SELECT * FROM staedte WHERE id >= 2 AND id <= 7;

-- Suche Städte außerhalb der USA (ohne die laender_id im WHERE zu benutzen)
# SELECT * FROM staedte;
# SELECT * FROM staedte INNER JOIN laender ON laender_id=laender.id;
SELECT * FROM staedte
INNER JOIN laender ON laender_id=laender.id
WHERE laender.`name` != 'USA';

SELECT staedte.`name`, laender.`name` FROM staedte
INNER JOIN laender ON laender_id=laender.id
WHERE laender.`name` != 'USA';

-- Früher da mussten wir noch
SELECT staedte.`name`, laender.`name`
FROM staedte, laender
WHERE laender_id=laender.id AND laender.`name` != 'USA';










