-- Création de la base (déjà faite par Docker mais au cas où)
CREATE DATABASE BiblioApp;

-- Exemple : insérer un auteur de test
\c BiblioApp;

CREATE TABLE IF NOT EXISTS auteur (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(100),
    prenom VARCHAR(100)
);

INSERT INTO auteur (nom, prenom) VALUES ('Ba', 'Mody');
