package com.Bibiloteque.gestionBiblio.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "livre")
public class LivreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "anne_publication", nullable = false)
    private int annePublication;

    @Column(nullable = false)
    private boolean disponible;

    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;

    @ManyToOne
    @JoinColumn(name = "bibliotheque_id")
    private Bibliotheque bibliotheque;

    @OneToMany(mappedBy = "livre")
    private List<Emprunt> emprunts;

    @OneToMany(mappedBy = "livre")
    private List<UsageLivre> usages;

    public LivreEntity() {}

    public LivreEntity(String titre,
                       String isbn,
                       int annePublication,
                       boolean disponible,
                       Auteur auteur,
                       Bibliotheque bibliotheque) {

        this.titre = titre;
        this.isbn = isbn;
        this.annePublication = annePublication;
        this.disponible = disponible;
        this.auteur = auteur;
        this.bibliotheque = bibliotheque;
    }


    // GETTERS ET SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnnePublication() {
        return annePublication;
    }

    public void setAnnePublication(int annePublication) {
        this.annePublication = annePublication;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public Bibliotheque getBibliotheque() {
        return bibliotheque;
    }

    public void setBibliotheque(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    public List<UsageLivre> getUsages() {
        return usages;
    }

    public void setUsages(List<UsageLivre> usages) {
        this.usages = usages;
    }
}
