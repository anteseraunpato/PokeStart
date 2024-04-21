package ChoosePokemon;

public class Fuego extends Starter {
    public int Llamarada;
    public int Lanzallamas;

    public Fuego(int opt, int pokedex, String nombre, int ataqueUnico, int llamarada, int lanzallamas) {
        super(opt, pokedex, nombre, ataqueUnico);
        this.Llamarada = llamarada;
        this.Lanzallamas = lanzallamas;
    }

    public String toString() {
        return "\nEstas son las estadísticas de tu Pokemon:\nNúmero en la Pokedex: 00" + this.Pokedex + "\n\n--- Daño que causan sus ataques ---\n\nLlamarada = " + this.Llamarada + "\nLanzallamas = " + this.Lanzallamas + "\nSu ataque único es Ascuas y causa un daño de " + this.AtaqueUnico;
    }
}
