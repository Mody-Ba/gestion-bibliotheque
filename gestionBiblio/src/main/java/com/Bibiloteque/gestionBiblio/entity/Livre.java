package com.Bibiloteque.gestionBiblio.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record Livre(
        @NotBlank String titre,
        @NotBlank String isbn,
        @PastOrPresent LocalDate anneePublication,
        @NotNull boolean disponible
) {}

