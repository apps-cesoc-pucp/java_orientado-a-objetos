import Clases.Pokemon;
import Clases.Referi;

public class Main {

    public static void main(String[] args) {
        // aquí sí podemos pelear, Vegeta
        Referi referi=new Referi();
        Pokemon pikachu=new Pokemon();
        Pokemon squirtle=new Pokemon();

        pikachu.setNombre("Pikachu");
        squirtle.setNombre("Squirtle");
        referi.presentarse(pikachu,squirtle);
    }
}
