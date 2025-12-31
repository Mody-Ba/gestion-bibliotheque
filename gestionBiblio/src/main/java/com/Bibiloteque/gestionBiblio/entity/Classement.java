package com.Bibiloteque.gestionBiblio.entity;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record Classement(
        @Positive(message = "le champs ne dpoit pas etre null") int position,
        @PositiveOrZero(message = "le champs ne dpoit pas etre null") int nbreDeFoiEmprunter
) {
}
