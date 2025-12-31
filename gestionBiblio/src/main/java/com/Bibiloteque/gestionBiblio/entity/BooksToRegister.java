package com.Bibiloteque.gestionBiblio.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;

import java.time.LocalDate;

public record BooksToRegister(
        @NotBlank(message = "First name is mandatory") String titre,
        @NotBlank(message = "Last name is mandatory") String isbn,
         @PastOrPresent(message = "Birth date must be past or present") LocalDate anneDePublicatrion,
        @NotNull (message = "la disponiblite doit pas etre null")boolean disponible,
        @PositiveOrZero(message = "Points must be more than zero") int nbreDeFoiEmprunter) {
}
