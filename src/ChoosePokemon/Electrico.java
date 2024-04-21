package ChoosePokemon;

public class Electrico extends Starter {
    public int Impactrueno;
    public int PunioTrueno;

    public Electrico(int opt, int pokedex, String nombre, int ataqueUnico, int impactrueno, int punioTrueno) {
        super(opt, pokedex, nombre, ataqueUnico);
        this.Impactrueno = impactrueno;
        this.PunioTrueno = punioTrueno;
    }

    public String toString() {
        return "\nEstas son las estadísticas de tu Pokemon:\nNúmero en la Pokedex: 0" + this.Pokedex + "\n\n--- Daño que causan sus ataques ---\n\nImpactrueno= " + this.Impactrueno + "\nPuño Trueno= " + this.PunioTrueno + "\nSu ataque único es Ataque Rápido y causa un daño de " + this.AtaqueUnico;
    }
}
