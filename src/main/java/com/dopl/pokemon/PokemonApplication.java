package com.dopl.pokemon;

import com.dopl.pokemon.entity.Pokemon;
import com.dopl.pokemon.repository.PokemonRepo;
import com.dopl.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class PokemonApplication implements CommandLineRunner{
    @Autowired
    private PokemonService pokemonService;
    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        Pokemon[] pokemons = {
                Pokemon.builder().types(List.of("Feu")).name("Groupix").hp("17").created(LocalDate.now()).cp("8").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/037.png").build(),
                Pokemon.builder().types(List.of("Fée")).name("Mélofée").hp("25").created(LocalDate.now()).cp("5").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/035.png").build(),
                Pokemon.builder().types(List.of("Normal")).name("Sabelette").hp("19").created(LocalDate.now()).cp("3").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/035.png").build(),
                Pokemon.builder().types(List.of("Electrik")).name("Pikachu").hp("21").created(LocalDate.now()).cp("7").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/025.png").build(),
                Pokemon.builder().types(List.of("Poison")).name("Abo").hp("16").created(LocalDate.now()).cp("4").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/023.png").build(),
                Pokemon.builder().types(List.of("Normal", "Vol")).name("Piafabec").hp("14").created(LocalDate.now()).cp("5").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/021.png").build(),
                Pokemon.builder().types(List.of("Normal")).name("Rattata").hp("18").created(LocalDate.now()).cp("6").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/019.png").build(),
                Pokemon.builder().types(List.of("Normal", "Vol")).name("Roucool").hp("30").created(LocalDate.now()).cp("7").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/016.png").build(),
                Pokemon.builder().types(List.of("Insecte", "Poison")).name("Aspicot").hp("16").created(LocalDate.now()).cp("2").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/013.png").build(),
                Pokemon.builder().types(List.of("Eau")).name("Carapuce").hp("21").created(LocalDate.now()).cp("4").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/007.png").build(),
                Pokemon.builder().types(List.of("Feu")).name("Salamèche").hp("28").created(LocalDate.now()).cp("6").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png").build(),
                Pokemon.builder().types(List.of("Plante", "Poison")).name("Bulbizarre").hp("25").created(LocalDate.now()).cp("5").picture("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png").build(),
        };
        pokemonService.saveAll(List.of(pokemons));
    }
}
