package com.Bibiloteque.gestionBiblio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usage_livre")
public class UsageLivre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_usage", nullable = false)
    private String typeUsage;

    @ManyToOne
    @JoinColumn(name = "livre_id")
    private LivreEntity livre;

    public UsageLivre() {}

    // GETTERS ET SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeUsage() {
        return typeUsage;
    }

    public void setTypeUsage(String typeUsage) {
        this.typeUsage = typeUsage;
    }

    public LivreEntity getLivre() {
        return livre;
    }

    public void setLivre(LivreEntity livre) {
        this.livre = livre;
    }
}
