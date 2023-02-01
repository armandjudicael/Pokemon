package com.dopl.pokemon.service;

import com.dopl.pokemon.entity.Pokemon;
import com.dopl.pokemon.repository.PokemonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService implements BasicServiceMethod<Pokemon> {
    @Autowired
    private PokemonRepo pokemonRepo;
    /**
     * @param object
     * @return
     */
    @Override
    public List<Pokemon> saveAll(List<Pokemon> object) {
        return pokemonRepo.saveAll(object);
    }
    /**
     * @param object 
     * @return
     */
    @Override
    public Pokemon create(Pokemon object) {
        return pokemonRepo.save(object);
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Pokemon updateById(Long id) {

        return null;
    }

    /**
     * @param object 
     * @param id
     * @return
     */
    @Override
    public Pokemon update(Pokemon object, Long id) {
        object.setId(id);
       return pokemonRepo.save(object);
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Boolean deleteById(Long id) {
        pokemonRepo.deleteById(id);
        return true;
    }

    /**
     * @param obejct 
     * @return
     */
    @Override
    public Boolean delete(Pokemon obejct) {
        pokemonRepo.delete(obejct);
        return true;
    }

    /**
     * @return 
     */
    @Override
    public List<Pokemon> findAll() {
        return pokemonRepo.findAll();
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Pokemon findById(Long id) {
        return  pokemonRepo.findById(id).orElseThrow(() -> new RuntimeException(" The pokemon with the id = " + id + " doesn't exist "));
    }
}
