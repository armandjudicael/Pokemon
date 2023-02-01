package com.dopl.pokemon.controller;

import com.dopl.pokemon.entity.Pokemon;
import com.dopl.pokemon.repository.PokemonRepo;
import com.dopl.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;

@Controller
@RequestMapping("/api/")
public class PokemonController implements BasicControllerMethod<Pokemon> {

    @Autowired
    private PokemonService pokemonService;

    /**
     * @param entity 
     * @return
     */
    @Override
    @PostMapping("/pokemons")
    public ResponseEntity<Object> create(Pokemon entity) {
        return new ResponseEntity<>(pokemonService.create(entity),HttpStatus.CREATED);
    }

    /**
     * @return 
     */
    @Override
    @GetMapping("/pokemons")
    public ResponseEntity<Object> findAll() {
        return new ResponseEntity<>(pokemonService.findAll(), HttpStatus.OK);
    }

    /**
     * @param newEntity 
     * @param id
     * @return
     */
    @Override
    @PutMapping("/pokemons/{id}")
    public ResponseEntity<Object> updateById(@RequestBody Pokemon newEntity, @PathVariable Long id) {
        return new ResponseEntity<>(pokemonService.update(newEntity,id),HttpStatus.OK);
    }

    /**
     * @param id 
     * @return
     */
    @Override
    @GetMapping("/pokemons/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return new ResponseEntity<>(pokemonService.findById(id),HttpStatus.OK);
    }

    /**
     * @param id 
     * @return
     */
    @Override
    @DeleteMapping("/pokemons/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable  Long id) {
        return new ResponseEntity<>(pokemonService.deleteById(id),HttpStatus.OK);
    }

}
