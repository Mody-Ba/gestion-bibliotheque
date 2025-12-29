package com.Bibiloteque.gestionBiblio.service;

import com.Bibiloteque.gestionBiblio.entity.BookList;
import com.Bibiloteque.gestionBiblio.entity.Livre;
import com.Bibiloteque.gestionBiblio.entity.LivreEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {

    public List<Livre> getAllLivres(){
        return BookList.ALL;
    }

    public Livre getByTitre(String titre){
     return BookList.ALL.stream().filter(livre ->
             livre.titre().equals(titre)).findFirst().orElseThrow(() ->new BookNotFoundException(titre));
    }
}
