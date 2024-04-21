package ChoosePokemon;

public class Agua extends Starter {
    public int Hidrobomba;
    public int PistolaAgua;

    public Agua(int opt, int pokedex, String nombre, int ataqueUnico, int hidrobomba, int pistolaAgua) {
        super(opt, pokedex, nombre, ataqueUnico);
        this.Hidrobomba = hidrobomba;
        this.PistolaAgua = pistolaAgua;
    }

    public String toString() {
        return "\nEstas son las estadísticas de tu Pokemon:\nNúmero en la Pokedex: 00" + this.Pokedex + "\n\n--- Daño que causan sus ataques ---\n\nHidrobomba = " + this.Hidrobomba + "\nPistolaAgua = " + this.PistolaAgua + "\nSu ataque único es Burbujas y causa un daño de " + this.AtaqueUnico;
    }
}
