package ChoosePokemon;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;



public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog((Component)null, "¡Hola! hoy es tu primer día como entrenador Pokemon", "Lab del profesor Oak", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog((Component)null, "¡Es peligroso ir solo! \nElige un Pokemon para acompañarte en tu viaje", "Lab del profesor Oak", JOptionPane.WARNING_MESSAGE);

        String ElegirTipo = "";

        // Bucle infinito para mostrar el JOptionPane hasta que se haga una elección válida o se cancele
        while (true) {
            ElegirTipo = JOptionPane.showInputDialog((Component)null, "¿Qué tipo de Pokemon quieres elegir?\nPlanta \nFuego \nAgua \n\nEscribe Random si quieres que elija por ti", "Elige un tipo", JOptionPane.QUESTION_MESSAGE);

            // Verifica si se presionó cancelar o se cerró la ventana
            if (ElegirTipo == null) {
                // Si se presionó cancelar o se cerró la ventana, se sale del programa
                System.exit(0);
            }

            // Verifica si el input está vacío después de que se muestra el JOptionPane
            if (ElegirTipo.trim().isEmpty()) {
                // Si el input está vacío, muestra un JOptionPane de advertencia y continúa el bucle
                JOptionPane.showMessageDialog((Component)null, "El campo no puede estar vacío.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                // Si se ingresó un valor, se sale del bucle
                break;
            }
        }


        JOptionPane.showMessageDialog((Component)null, "Elegiste: " + ElegirTipo, "Información", JOptionPane.INFORMATION_MESSAGE);
        List<Pokemon> listaPokemon = new ArrayList();
        Agua agua1 = new Agua(0, 7, "Squirtle", 88, 25, 33);
        Agua agua2 = new Agua(1, 7, "Squirtle", 42, 80, 37);
        Agua agua3 = new Agua(2, 7, "Squirtle", 15, 90, 13);
        Fuego fuego1 = new Fuego(3, 4, "Charmander", 67, 68, 80);
        Fuego fuego2 = new Fuego(4, 4, "Charmander", 85, 47, 48);
        Fuego fuego3 = new Fuego(5, 4, "Charmander", 89, 36, 67);
        Planta planta1 = new Planta(6, 1, "Bulbasaur", 90, 58, 38);
        Planta planta2 = new Planta(7, 1, "Bulbasaur", 95, 39, 70);
        Planta planta3 = new Planta(8, 1, "Bulbasaur", 91, 45, 55);
        Electrico electrico = new Electrico(9, 21, "Pikachu", 95, 85, 74);

        listaPokemon.add(agua1);
        listaPokemon.add(agua2);
        listaPokemon.add(agua3);
        listaPokemon.add(fuego1);
        listaPokemon.add(fuego2);
        listaPokemon.add(fuego3);
        listaPokemon.add(planta1);
        listaPokemon.add(planta2);
        listaPokemon.add(planta3);
        listaPokemon.add(electrico);

        int pokeazar;
        Iterator var14;
        Pokemon planta;
        if (ElegirTipo.equalsIgnoreCase("Agua")) {
            pokeazar = (int)(Math.random() * 3.0);
            var14 = listaPokemon.iterator();

            while(var14.hasNext()) {
                planta = (Pokemon)var14.next();
                if (planta.getOpt() == pokeazar && planta.getPokedex() == 7) {
                    JOptionPane.showMessageDialog((Component)null, "¡Felicidades! Tu Pokemón es Squirtle\n" + planta.toString(), "Este es tu Pokémon", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else if (ElegirTipo.equalsIgnoreCase("Fuego")) {
            pokeazar = (int)(Math.random() * 4.0 + 3.0);
            var14 = listaPokemon.iterator();

            while(var14.hasNext()) {
                planta = (Pokemon)var14.next();
                if (planta.getOpt() == pokeazar && planta.getPokedex() == 4) {
                    JOptionPane.showMessageDialog((Component)null, "¡Felicidades! Tu Pokemón es Charmander\n" + planta.toString(), "Este es tu Pokémon", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else if (ElegirTipo.equalsIgnoreCase("Planta")) {
            pokeazar = (int)(Math.random() * 4.0 + 6.0);
            var14 = listaPokemon.iterator();

            while(var14.hasNext()) {
                planta = (Pokemon)var14.next();
                if (planta.getOpt() == pokeazar && planta.getPokedex() == 1) {
                    JOptionPane.showMessageDialog((Component)null, "¡Felicidades! Tu Pokemón es Bulbasaur\n" + planta.toString(), "Este es tu Pokémon", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else if (ElegirTipo.equalsIgnoreCase("Random")) {
            JOptionPane.showMessageDialog((Component)null, "¡Genial! \n Déjame pensar...");
            pokeazar = (int)(Math.random() * 10.0);
            var14 = listaPokemon.iterator();

            while(var14.hasNext()) {
                planta = (Pokemon)var14.next();
                if (planta.getOpt() == pokeazar) {
                    String var10001 = planta.getNombre();
                    JOptionPane.showMessageDialog((Component)null, "¡Lo tengo! El mejor Pokémon para ti es: ¡" + var10001 + "!\n" + planta.toString(), "Este es tu Pokémon", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        JOptionPane.showMessageDialog(null, "¡Mucha suerte en tu viaje!", null, JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog((Component)null, "Parece que el tipo que elegiste no está disponible y los Pokemon se han agotado.\n\nBuena suerte la próxima vez", null, JOptionPane.PLAIN_MESSAGE);
        }


    }

}