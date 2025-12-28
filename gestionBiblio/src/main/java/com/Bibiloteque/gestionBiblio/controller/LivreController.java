package com.Bibiloteque.gestionBiblio.controller;

import com.Bibiloteque.gestionBiblio.entity.BookList;
import com.Bibiloteque.gestionBiblio.entity.Livre;
import com.Bibiloteque.gestionBiblio.entity.LivreEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
@Tag(name = " Livre API")
@RestController
@RequestMapping("/livres")
public class LivreController {

    @Operation(summary = "Finds livre", description = "Finds livre")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "livre list",
                    content = {@Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Livre.class)))})

    })
    @GetMapping
    public List<Livre> list() {
        return Collections.emptyList();
    }

    @Operation(summary = "Finds a player", description = "Finds a player")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Player",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Livre.class))})

    })
    @GetMapping("{lastName}")
    public Livre getByLastName(@PathVariable("lastName") String lastName) {
        return null;
    }

    @Operation(summary = "Creates a player", description = "Creates a player")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Created player",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Livre.class))})

    })
    @PostMapping
    public Livre createPlayer(@RequestBody Livre livre) {
        return livre;
    }

    @Operation(summary = "Updates a titre", description = "Updates a titre")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Updated titre",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Livre.class))})

    })
    @PutMapping
    public Livre updateTitre(@RequestBody Livre livre) {
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