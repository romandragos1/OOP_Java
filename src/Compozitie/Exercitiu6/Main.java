package Compozitie.Exercitiu6;

public class Main {

// Exercitiu 6 - Creati clasa Pokemon cu proprietatea String name si metoda sayHello(), care va printa la consola de 3 ori numele pokemonului nostru;
// Creati clasa Trainer cu proprietatile String name, ArrayList<Pokemon> pokemons, metoda addPokemonToCollection(Pokemon pokemon) si metoda releaseAllPokemons();
// Toti pokemonii trainerului vor saluta cand sunt scosi din minge;
// Generati un trainer caruia sa ii adaugati 5 pokemoni; Eliberati toti pokemonii.

    public static void main(String[] args) {

        Trainer trainer = new Trainer("Ash");                           // Initializam un trainer si 5 pokemoni
        trainer.addPokemonToCollection(new Pokemon("Pikachu"));
        trainer.addPokemonToCollection(new Pokemon("Charizard"));
        trainer.addPokemonToCollection(new Pokemon("Eeve"));
        trainer.addPokemonToCollection(new Pokemon("Charmender"));
        trainer.addPokemonToCollection(new Pokemon("Bulbasaur"));

        trainer.releaseAllPokemons();       // Trainerul va elibera toti pokemonii
    }
}