package com.Bibiloteque.gestionBiblio.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "bibliotheque")
public class Bibliotheque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String adresse;

    @OneToMany(mappedBy = "bibliotheque")
    private List<LivreEntity> livres;

    @OneToMany(mappedBy = "bibliotheque")
    private List<Emprunt> emprunts;

    public Bibliotheque() {}

    public Bibliotheque(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    // GETTERS ET SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<LivreEntity> getLivres() {
        return livres;
    }

    public void setLivres(List<LivreEntity> livres) {
        this.livres = livres;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }
}
