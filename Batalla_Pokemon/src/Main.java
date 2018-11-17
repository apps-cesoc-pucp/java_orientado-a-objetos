import Clases.Pokemon;
import Clases.Referi;

public class Main {

    public static void main(String[] args) {
        // aquí sí podemos pelear, Vegeta
        Pokemon pikachu = new Pokemon("Pikachu",20,20,400);
        Pokemon charmander = new Pokemon("Charmander",50,30,800);
        Referi referi = new Referi();

        // inicia la batalla
        referi.presentarse(pikachu,charmander);
        referi.iniciarBatallaPokemon(pikachu,charmander);
        referi.declararGanador(pikachu,charmander);
    }
}
