DROP TABLE IF EXISTS contact_personen;
DROP TABLE IF EXISTS productie_installaties;

CREATE TABLE contact_personen (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    zip_code VARCHAR(6) NOT NULL,
    city VARCHAR(250) NOT NULL,
    number VARCHAR(100) NOT NULL
);

CREATE TABLE productie_installaties (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    contact INT NOT NULL,
    output_power DOUBLE
);

INSERT INTO contact_personen (name, zip_code, city, number) VALUES
    ('My installation', '0000AA', 'Arnhem', '12a');

INSERT INTO productie_installaties (name, contact, output_power) VALUES
    ('My installation Laagst', '123', '0.0001'),
    ('My installation Lager', '456', '245.134896'),
    ('My installation Gemiddeld', '789', '5000.984'),
    ('My installation Hoger', '654', '7896.2547'),
    ('My installation Hoogst', '852', '999999');