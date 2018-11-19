package Clases;

import java.util.Scanner;

public class Referi {
    String entrenador1;
    String entrenador2;
    public Referi() {

    }

    public void presentarse(Pokemon uno, Pokemon dos) {
        Scanner buffer= new Scanner(System.in);
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
        System.out.print("Cual es el nombre del entrenador 1: ");
        entrenador1=buffer.nextLine();
        System.out.print("Cual es el nombre del entrenador 2: ");
        entrenador2=buffer.nextLine();
        System.out.print("La batalla entre " + uno.getNombre() + " y " + dos.getNombre() + " comenzará!\n");
    }

    public void iniciarBatallaPokemon(Pokemon uno, Pokemon dos) throws NullPointerException{
        String primero = decidirPrimero(entrenador1, entrenador2);
        String segundo;
        String ganador;

        char decision;
        boolean defender=false;
        Resultados resultado;
        System.out.println("El primer turno es para "+primero);
        if (primero.equals(entrenador2)) {
            Pokemon aux;
            aux = uno;
            uno = dos;
            dos = aux;
            segundo=entrenador1;
        }
        else segundo=entrenador2;
        while (true) {

            decision=tomarDecision(primero);
            resultado=acciones(uno,dos,primero,segundo,decision,defender);
            ganador=resultado.getGanador();
            if(!ganador.equals("")) break;
            defender=resultado.getDefiende();
            decision=tomarDecision(segundo);
            resultado=acciones(dos,uno,segundo,primero,decision,defender);
            ganador=resultado.getGanador();
            if(!ganador.equals("")) break;
            defender=resultado.getDefiende();

        }
        declararGanador(ganador,resultado.getEntranador());
    }

    private String decidirPrimero(String uno, String dos) {
        int prim = (int) (Math.random() * 100);
        int seg = (int) (Math.random() * 100);

        if (prim < seg) return dos;
        else return uno;
    }

    private void declararGanador(String ganador,String entrenador) {
        System.out.print("Gana el " + ganador+" de "+entrenador+"!!!");
    }
    private char tomarDecision(String entrenador){
        char decision;
        Scanner buffer=new Scanner(System.in);
        System.out.print("Que quieres hacer " +entrenador+ "?:\n");
        System.out.print("Atacar[A]         Defender[D]\nLlorar[L]         Rendirse[R]\n");
        decision=buffer.nextLine().charAt(0);
        return decision;
    }
    private Resultados acciones(Pokemon uno,Pokemon dos, String entrenador, String entrenador2,char decision,boolean defenderDos){

        if(decision=='A') {
            System.out.print(uno.getNombre()+" ha atacado a "+dos.getNombre()+"!!!\n");
            uno.atacar(dos,defenderDos);

            if (Integer.parseInt(dos.getVida()) <= 0) {
                return new Resultados(uno.getNombre(),entrenador,false);
            }
            System.out.print(dos.getNombre()+" tiene "+dos.getVida()+" PS\n");
        }
        else if(decision=='D'){
            System.out.print(uno.getNombre()+" defendera el siguiente turno\n");
            return new Resultados("","",true);
        }
        else if(decision=='L'){
            System.out.print(entrenador+" se pone a llorar en posición fetal\nQué patético. "+uno.getNombre()+" siente vergüenza\n");
            return new Resultados("","",false);
        }
        else if(decision=='R'){
            return new Resultados(dos.getNombre(),entrenador2,false);
        }
        return new Resultados("","",false);
    }
}
