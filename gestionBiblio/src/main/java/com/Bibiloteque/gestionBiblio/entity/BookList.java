package com.Bibiloteque.gestionBiblio.entity;

import java.util.Arrays;
import java.util.List;

public class BookList {
    public static LivreEntity CLEAN_CODE = new LivreEntity(
            "Clean Code",
            "978-0132350884",
            2008,
            true,
            null,          // auteur
            null           // bibliotheque
    );

    public static LivreEntity EFFECTIVE_JAVA = new LivreEntity(
            "Effective Java",
            "978-0134685991",
            2018,
            true,
            null,
            null
    );
    public static LivreEntity DESIGN_PATTERNS = new LivreEntity(
            "Design Patterns",
            "978-0201633610",
            1994,
            false,
            null,
            null
    );

    public static final List<LivreEntity> ALL =
            Arrays.asList(CLEAN_CODE, EFFECTIVE_JAVA, DESIGN_PATTERNS);
}
