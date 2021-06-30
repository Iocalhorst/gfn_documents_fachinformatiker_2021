
-- Erdkunde (1:n)

DROP DATABASE IF EXISTS erdkunde;
CREATE DATABASE erdkunde;
USE erdkunde;

CREATE TABLE laender
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(255),
	einwohnerzahl INT
);
# Tick zum schützen von Schlüsselwörtern
# SHOW COLUMNS FROM laender;

CREATE TABLE staedte
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(255),
	einwohnerzahl INT,
	laender_id INT
);
# SHOW COLUMNS FROM staedte;

INSERT INTO `laender` (`name`, `einwohnerzahl`)
VALUES
('Deutschland', 81796000),
('USA', '311484627'),
('Frankreich', '65447374'),
('Großbritannien', '61792000'),
('Italien', '60626442'),
('Spanien', '47190493');

INSERT INTO `staedte` (`name`, `einwohnerzahl`, `laender_id`)
VALUES
('Berlin', '3496082', '1'),
('Washington, D.C.', '601723', '2'),
('Paris', '2234105', '3'),
('London', '7825200', '4'),
('Rom', '2761477', '5'),
('Madrid', '3265038', '6'),
('Hamburg', '1798455', '1'),
('New York', '8175133', '2'),
('Marseille', '850602', '3'),
('Birmingham', '1036878', '4'),
('Mailand', '1324110', '5'),
('Barcelona', '1615448', '6'),
('München', '1353186', '1'),
('Los Angeles', '3831868', '2'),
('Lyon', '479803', '3'),
('Glasgow', '592820', '4'),
('Neapel', '959574', '5'),
('Valencia', '798033', '6');

SELECT * FROM laender;
SELECT * FROM staedte;



