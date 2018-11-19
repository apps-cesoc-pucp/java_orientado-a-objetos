
import Clases.Pokemon;
import Clases.Referi;


public class Main {

    public static void main(String[] args) {
        // aquí sí podemos pelear, Vegeta

        Referi referi=new Referi();
        Pokemon pikachu=new Pokemon();
        Pokemon squirtle=new Pokemon();

        pikachu.setNombre("Pikachu");
        pikachu.setAtaque(10);
        pikachu.setVida("30");
        pikachu.setDefensa(10);
        squirtle.setNombre("Squirtle");
        squirtle.setAtaque(8);
        squirtle.setVida("36");
        squirtle.setDefensa(12);
        referi.presentarse(pikachu,squirtle);
        referi.iniciarBatallaPokemon(pikachu,squirtle);

    }
}
