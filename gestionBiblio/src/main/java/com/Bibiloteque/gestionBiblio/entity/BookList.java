package com.Bibiloteque.gestionBiblio.entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class BookList {
    public static Livre CLEAN_CODE = new Livre(
            "Clean Code",
            "978-0132350884",
            LocalDate.of(2008, 1, 1),
            true,
            new Classement(1,10)

    );

    public static Livre EFFECTIVE_JAVA = new Livre(
            "Effective Java",
            "978-0134685991",
            LocalDate.of(2008, 4, 1),
            true,
            new Classement(2,9)
    );
    public static Livre DESIGN_PATTERNS = new Livre(
            "Design Patterns",
            "978-0201633610",
            LocalDate.of(2008, 2, 1),
            false,
            new Classement(3,8)
    );

    public static final List<Livre> ALL =
            Arrays.asList(CLEAN_CODE, EFFECTIVE_JAVA, DESIGN_PATTERNS);
}
