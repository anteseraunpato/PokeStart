package ChoosePokemon;


public class Pokemon {
    protected int Pokedex;
    protected String nombre;
    protected int opt;

    public Pokemon(int opt, int pokedex, String nombre) {
        this.Pokedex = pokedex;
        this.nombre = nombre;
        this.opt = opt;
    }

    public int getOpt() {
        return this.opt;
    }

    public void setOpt(int opt) {
        this.opt = opt;
    }

    public int getPokedex() {
        return this.Pokedex;
    }

    public void setPokedex(int pokedex) {
        this.Pokedex = pokedex;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
