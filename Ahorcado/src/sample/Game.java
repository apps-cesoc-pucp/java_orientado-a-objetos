package sample;

import com.sun.xml.internal.bind.v2.TODO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class Game {
    public Game() {

    }

    public static void start() {
        printBanner();
        System.out.println("Presione ENTER para continuar");
        //TODO(1)
        //System.out.println("Presione ESC para salir"); Buscar forma de hacer que KeyEvent funcione xd
        try {
            System.in.read();
        } catch (IOException e) {

        }
    }

    public static void game()throws FileNotFoundException {
        String movie, secret, aux, errores = "";
        char letra;
        int vidas;
        Player player = new Player();
        movie = pickMovie();
        secret = secretMovie(movie);
        aux=secret;
        vidas = player.vidas;
        while (vidas != 0) {
            System.out.print("La pelicula es: ");
            System.out.println(secret);
            System.out.println("Te quedan "+ vidas+" vidas. Letras erradas: "+errores);
            System.out.print("Ingresa una letra: ");
            letra = Player.pickALetter();
            secret = newSecretMovie(movie,secret, letra);
            if (secret.equals(movie)){
                System.out.println("Ganaste!");
                System.out.println("Has adivinado '"+movie+"' correctamente!");
                break;
            }
            if(secret.equals(aux)){
                vidas--;
                errores=wrongLetters(errores,letra);
            }
            aux=secret;

        }
        if (!secret.equals(movie)) {
            System.out.println("Perdiste xd");
        }
    }

    private static void printBanner() {
        System.out.print("   ('-.     ('-. .-.             _  .-')              ('-.     _ .-') _               \n" +
                "  ( OO ).-.( OO )  /            ( \\( -O )            ( OO ).-.( (  OO) )              \n" +
                "  / . --. /,--. ,--. .-'),-----. ,------.   .-----.  / . --. / \\     .'_  .-'),-----. \n" +
                "  | \\-.  \\ |  | |  |( OO'  .-.  '|   /`. ' '  .--./  | \\-.  \\  ,`'--..._)( OO'  .-.  '\n" +
                ".-'-'  |  ||   .|  |/   |  | |  ||  /  | | |  |('-..-'-'  |  | |  |  \\  '/   |  | |  |\n" +
                " \\| |_.'  ||       |\\_) |  |\\|  ||  |_.' |/_) |OO  )\\| |_.'  | |  |   ' |\\_) |  |\\|  |\n" +
                "  |  .-.  ||  .-.  |  \\ |  | |  ||  .  '.'||  |`-'|  |  .-.  | |  |   / :  \\ |  | |  |\n" +
                "  |  | |  ||  | |  |   `'  '-'  '|  |\\  \\(_'  '--'\\  |  | |  | |  '--'  /   `'  '-'  '\n" +
                "  `--' `--'`--' `--'     `-----' `--' '--'  `-----'  `--' `--' `-------'      `-----' \n");

    }

    private static String pickMovie() throws FileNotFoundException {
        File file = new File("movie.txt");
        ArrayList<String> peliculas = new ArrayList<>();
        String peliculaEscogida;
        Scanner buffer = new Scanner(file);
        //TODO(2)
        Random generator= new Random(LocalTime.now().toSecondOfDay()); //Buscar más sobre random

        while (buffer.hasNextLine()) {
            peliculas.add(buffer.nextLine());
        }

        peliculaEscogida = peliculas.get((int) (generator.nextDouble() * (peliculas.size() - 1)));
        return peliculaEscogida;
    }

    private static String secretMovie(String movie) {
        ArrayList<Character> adivinar = new ArrayList<>();
        String pelicula = "";

        for (int m = 0; m < movie.length(); m++) {
            if (movie.charAt(m) != ' ') {
                adivinar.add('_');
            } else adivinar.add(' ');
        }
        for (int m = 0; m < movie.length(); m++) {
            pelicula += adivinar.get(m).toString();
        }
        return pelicula;
    }

    private static String newSecretMovie(String movie, String secret,char letra) {
        char[] pelicula = movie.toCharArray();
        char[] secreta = secret.toCharArray();
        String newSecret = "";
        for (int m = 0; m < movie.length(); m++) {
            if (letra == pelicula[m]) {
                secreta[m] = letra;
            }
        }
        for (int n = 0; n < movie.length(); n++) {
            newSecret += Character.toString(secreta[n]);
        }

        return newSecret;

    }

    private static String wrongLetters(String wrong,char letra){
        wrong+=Character.toString(letra);

        return wrong;
    }
    public static boolean playAgain(){
        System.out.print("Quieres jugar de nuevo? [SI/NO]: ");
        return Player.pickYesNo();
    }
}
