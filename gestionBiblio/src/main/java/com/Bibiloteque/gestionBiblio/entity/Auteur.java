package com.Bibiloteque.gestionBiblio.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "auteur")
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @OneToMany(mappedBy = "auteur")
    private List<LivreEntity> livres;

    public Auteur() {}

    public Auteur(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // GETTERS ET SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<LivreEntity> getLivres() {
        return livres;
    }

    public void setLivres(List<LivreEntity> livres) {
        this.livres = livres;
    }
}
