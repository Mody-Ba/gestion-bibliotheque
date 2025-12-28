package com.Bibiloteque.gestionBiblio.entity;

public record Livre(
        Long id,
        String titre,
        String isbn,
        int anneePublication,
        boolean disponible
) {}

