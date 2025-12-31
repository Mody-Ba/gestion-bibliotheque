package com.Bibiloteque.gestionBiblio.service;

import com.Bibiloteque.gestionBiblio.entity.BooksToRegister;
import com.Bibiloteque.gestionBiblio.entity.Classement;
import com.Bibiloteque.gestionBiblio.entity.Livre;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassementLivreCalculator {

    private final List<Livre> currentBookClassement;
    private final BooksToRegister bookToRegister;

    public ClassementLivreCalculator(List<Livre> currentPlayersRanking, BooksToRegister bookToRegister) {
        this.currentBookClassement = currentPlayersRanking;
        this.bookToRegister = bookToRegister;
    }

    public List<Livre> getNewBookClassement() {

        List<Livre> newClassementList = new ArrayList<>(currentBookClassement);

        newClassementList.add(new Livre(
                bookToRegister.titre(),
                bookToRegister.isbn(),
                bookToRegister.anneDePublicatrion(),
                true,
                new Classement(1, bookToRegister.nbreDeFoiEmprunter())
        ));

        List<Livre> sortedLivre = newClassementList.stream()
                .sorted(
                        Comparator.comparing(
                                (Livre livre) -> livre.classement().nbreDeFoiEmprunter()
                        ).reversed()
                )
                .toList();

        List<Livre> updatedLivres = new ArrayList<>();

        for (int i = 0; i < sortedLivre.size(); i++) {
            Livre livre = sortedLivre.get(i);

            updatedLivres.add(new Livre(
                    livre.titre(),
                    livre.isbn(),
                    livre.anneePublication(),
                    livre.disponible(),
                    new Classement(i + 1, livre.classement().nbreDeFoiEmprunter())
            ));
        }

        return updatedLivres;
    }

}


