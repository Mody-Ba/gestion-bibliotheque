package com.Bibiloteque.gestionBiblio.controller;

import com.Bibiloteque.gestionBiblio.entity.BookList;
import com.Bibiloteque.gestionBiblio.entity.Livre;
import com.Bibiloteque.gestionBiblio.entity.LivreEntity;
import com.Bibiloteque.gestionBiblio.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
@Tag(name = " Livre API")
@RestController
@RequestMapping("/livres")
public class LivreController {
    @Autowired
    private BookService bookService;

    @Operation(summary = "Finds livre", description = "Finds livre")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "livre list",
                    content = {@Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Livre.class)))})

    })
    @GetMapping
    public List<Livre> list() {
        return bookService.getAllLivres();
    }

    @Operation(summary = "Finds a livre ", description = "Finds a livre")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "livre",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Livre.class))}),
            @ApiResponse(responseCode = "200", description = "livre has be specified not found",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Error.class))})

    })
    @GetMapping("{titre}")
    public Livre getBytitre(@PathVariable("titre") String titre) {
        return bookService.getByTitre(titre);
    }

    @Operation(summary = "Creates a titre", description = "Creates a titre")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Created titre",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Livre.class))})

    })
    @PostMapping
    public Livre createLivre(@RequestBody @Valid Livre livre) {
        return livre;
    }

    @Operation(summary = "Updates a titre", description = "Updates a titre")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Updated titre",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Livre.class))})

    })
    @PutMapping
    public Livre updateTitre(@RequestBody @Valid Livre livre) {
        return livre;
    }

    @Operation(summary = "Deletes a livre", description = "Deletes a livre")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "livre has been deleted")

    })
    @DeleteMapping("{titre}")
    public void deleteLivreByTitre(@PathVariable("titre") String titre) {

    }


}