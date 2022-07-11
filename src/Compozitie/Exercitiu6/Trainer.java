package Compozitie.Exercitiu6;

import java.util.ArrayList;

public class Trainer {

    String name;
    ArrayList<Pokemon> pokemoni = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    public void addPokemonToCollection(Pokemon pokemon) {
        this.pokemoni.add(pokemon);
    }

    public void releaseAllPokemons() {
        for (Pokemon pokemon : pokemoni) {
            pokemon.sayHello();
        }
    }
}
