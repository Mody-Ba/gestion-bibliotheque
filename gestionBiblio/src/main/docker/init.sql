-- =============================
-- CREATION DES TABLES
-- =============================

CREATE TABLE IF NOT EXISTS bibliotheque (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    adresse VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS auteur (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS livre (
    id SERIAL PRIMARY KEY,
    titre VARCHAR(255) NOT NULL,
    isbn VARCHAR(50) NOT NULL,
    anne_publication INTEGER NOT NULL,
    disponible BOOLEAN NOT NULL,
    auteur_id INTEGER REFERENCES auteur(id),
    bibliotheque_id INTEGER REFERENCES bibliotheque(id)
);

CREATE TABLE IF NOT EXISTS usage_livre (
    id SERIAL PRIMARY KEY,
    livre_id INTEGER REFERENCES livre(id),
    type_usage VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS emprunt (
    id SERIAL PRIMARY KEY,
    livre_id INTEGER REFERENCES livre(id),
    date_emprunt DATE NOT NULL,
    date_retour DATE,
    bibliotheque_id INTEGER REFERENCES bibliotheque(id)
);

