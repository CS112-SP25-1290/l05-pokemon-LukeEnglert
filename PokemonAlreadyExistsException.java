public class PokemonAlreadyExistsException extends Exception {
    Pokemon duplicate;

    public PokemonAlreadyExistsException() {
        super("error! Pokemon already exists in box!");
    }

    public PokemonAlreadyExistsException(String message, Pokemon duplicate) {
        super(message + " Duplicate Pokemon = " + duplicate);
        this.duplicate = duplicate;
    }

    public Pokemon getPokemon() {
        return this.duplicate;
    }
}
