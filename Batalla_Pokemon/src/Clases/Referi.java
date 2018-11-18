package Clases;

public class Referi {

    public Referi() {

    }

    public void presentarse(Pokemon uno, Pokemon dos) {
        System.out.print(
                " /$$$$$$$   /$$$$$$  /$$   /$$ /$$$$$$$$ /$$      /$$  /$$$$$$  /$$   /$$\n" +
                        "| $$__  $$ /$$__  $$| $$  /$$/| $$_____/| $$$    /$$$ /$$__  $$| $$$ | $$\n" +
                        "| $$  \\ $$| $$  \\ $$| $$ /$$/ | $$      | $$$$  /$$$$| $$  \\ $$| $$$$| $$\n" +
                        "| $$$$$$$/| $$  | $$| $$$$$/  | $$$$$   | $$ $$/$$ $$| $$  | $$| $$ $$ $$\n" +
                        "| $$____/ | $$  | $$| $$  $$  | $$__/   | $$  $$$| $$| $$  | $$| $$  $$$$\n" +
                        "| $$      | $$  | $$| $$\\  $$ | $$      | $$\\  $ | $$| $$  | $$| $$\\  $$$\n" +
                        "| $$      |  $$$$$$/| $$ \\  $$| $$$$$$$$| $$ \\/  | $$|  $$$$$$/| $$ \\  $$\n" +
                        "|__/       \\______/ |__/  \\__/|________/|__/     |__/ \\______/ |__/  \\__/\n"
        );
        System.out.print("La batalla entre " + uno.getNombre() + " y " + dos.getNombre() + " comenzará!\n");
    }

    public void iniciarBatallaPokemon(Pokemon uno, Pokemon dos) {
        String primero = decidirPrimero(uno, dos);
        Pokemon ganador;
        if (primero.equals(dos.getNombre())) {
            Pokemon aux;
            aux = uno;
            uno = dos;
            dos = aux;
        }
        while (true) {
            uno.atacar(dos);
            if (Integer.parseInt(dos.getVida()) <= 0) {
                ganador = uno;
                break;
            }
            dos.atacar(uno);
            if (Integer.parseInt(uno.getVida()) <= 0) {
                ganador = dos;
                break;
            }
        }
        declararGanador(ganador);
    }

    private String decidirPrimero(Pokemon uno, Pokemon dos) {
        int prim = (int) (Math.random() * 100);
        int seg = (int) (Math.random() * 100);

        if (prim < seg) return dos.getNombre();
        else return uno.getNombre();
    }

    private void declararGanador(Pokemon pokemon) {
        System.out.print("El ganador es: " + pokemon.getNombre());
    }

}
