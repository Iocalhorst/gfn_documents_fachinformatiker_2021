
# NULL (unbekannte Wert)
# IS [NOT] NULL

SELECT 1 = 0; -- 0 (false)
SELECT 1 = 1; -- 1 (true)

SELECT NULL = NULL; -- (NULL)
SELECT NULL <> NULL; -- (NULL)

SELECT NULL IS NULL;     -- 1
SELECT NULL IS NOT NULL; -- 0

SELECT 1 IS NULL; -- 0 (false)
SELECT 1 IS NOT NULL; -- 1 (true)

