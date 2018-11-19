import Clases.Pikachu;
import Clases.Referi;
import Clases.Squirtle;

public class Main {

    public static void main(String[] args) {
        // aqui tambien podemos pelear, Vegeta
        Pikachu pikachu=new Pikachu();
        Squirtle squirtle=new Squirtle();
        Referi referi= new Referi();

        referi.presentarse(pikachu,squirtle);
        referi.iniciarBatallaPokemon(pikachu,squirtle);
        referi.declararGanador(pikachu,squirtle);
    }
}
