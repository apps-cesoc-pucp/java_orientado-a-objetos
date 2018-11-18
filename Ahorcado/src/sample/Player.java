package sample;


import java.util.Scanner;

public class Player {
    int vidas;

    public Player() {
        this.vidas = 10;
    }

    public static char pickALetter() {
        char letra;
        Scanner entrada = new Scanner(System.in);
        letra = entrada.nextLine().charAt(0);
        return letra;
    }

    public static boolean pickYesNo() {
        String cadena;
        Scanner entrada = new Scanner(System.in);
        cadena = entrada.nextLine();
        if (cadena.equals("SI")) {
            return true;
        } else if (cadena.equals("NO")) {
            return false;
        }

        return false;
    }

}
