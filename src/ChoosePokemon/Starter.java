package ChoosePokemon;

public class Starter extends Pokemon {
    public int AtaqueUnico;

    public Starter(int opt, int pokedex, String nombre, int ataqueUnico) {
        super(opt, pokedex, nombre);
        this.AtaqueUnico = ataqueUnico;
    }

    public int getAtaqueUnico() {
        return this.AtaqueUnico;
    }

    public void setAtaqueUnico(int ataqueUnico) {
        this.AtaqueUnico = ataqueUnico;
    }
}

