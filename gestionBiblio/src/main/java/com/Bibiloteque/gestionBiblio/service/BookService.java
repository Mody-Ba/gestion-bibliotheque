package com.Bibiloteque.gestionBiblio.service;

import com.Bibiloteque.gestionBiblio.entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookService {

    // ✅ liste vivante
    private List<Livre> classement = new ArrayList<>(BookList.ALL);

    public List<Livre> getAllLivres() {
        return classement;
    }

    public Livre getByTitre(String titre) {
        return classement.stream()
                .filter(livre -> livre.titre().equals(titre))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException(titre));
    }

    public Livre createLivre(BooksToRegister bookToRegister) {

        ClassementLivreCalculator calculator =
                new ClassementLivreCalculator(classement, bookToRegister);

        // ✅ on remplace la liste
        classement = calculator.getNewBookClassement();

        return classement.stream()
                .filter(l -> l.titre().equals(bookToRegister.titre()))
                .findFirst()
                .get();
    }
}

