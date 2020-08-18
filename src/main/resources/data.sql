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
    ('My installation1', '6547RR', 'Arnhem', '12a'),
    ('My installation2', '8456TT', 'Arnhem', '12a'),
    ('My installation3', '9764RL', 'Arnhem', '12a'),
    ('My installation4', '1802JT', 'Arnhem', '12a'),
    ('My installation5', '2045NN', 'Arnhem', '12a');

INSERT INTO productie_installaties (name, contact, output_power) VALUES
    ('Lowest OP', '123', '0.0001'),
    ('Low OP', '456', '245.134896'),
    ('Average OP', '789', '5000.984'),
    ('High OP', '654', '7896.2547'),
    ('Highest OP', '852', '999999');