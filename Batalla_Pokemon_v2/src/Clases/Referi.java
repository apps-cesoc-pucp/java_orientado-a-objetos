package Clases;

import java.util.Scanner;

public class Referi {
    // CONSTRUCTOR GENERICO, COMPILADOR JAVA LO GENERA

    // METODOS
    public void presentarse(Pokemon poke1, Pokemon poke2){
        System.out.println("                                 ,'\\\n" +
                "    _.----.        ____         ,'  _\\   ___    ___     ____\n" +
                "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n" +
                "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n" +
                " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n" +
                "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n" +
                "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n" +
                "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n" +
                "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n" +
                "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n" +
                "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n" +
                "                                `'                            '-._|");
    }

    public void iniciarBatallaPokemon(Pokemon poke1, Pokemon poke2){
        int iniciar = decidirPrimerJugador();
        if (iniciar == 1) {
            System.out.println("\nJugador 1 inicia\n");
        } else {
            System.out.println("\nJugador 2 inicia\n");
        }
        while(true){
            // turno del primer jugador
            if(iniciar==1){
                poke1.atacar(poke2);
                iniciar=2;
            }else{
                // turno del segundo jugador
                poke2.atacar(poke1);
                iniciar=1;
            }
            if(poke1.getVida()<=0 || poke2.getVida()<=0) break;
        }
    }

    public void declararGanador(Pokemon poke1, Pokemon poke2){
        if(poke1.getVida()<=0){
            System.out.println(poke1.getNombre() + " no puede continuar");
            System.out.println("EL GANADOR ES " + poke2.getNombre());
        } else {
            System.out.println(poke2.getNombre() + " no puede continuar");
            System.out.println("EL GANADOR ES " + poke1.getNombre());
        }
    }

    private final int decidirPrimerJugador(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nPRIMER JUGADOR: ");
        int des1 = decision(in);
        System.out.println("\nSEGUNDO JUGADOR: ");
        int des2 = decision(in);
        // si eligieron lo mismo, el procedimiento de elegir se repite
        if(des1==des2) return decidirPrimerJugador();
        // si primer jugador gana, devuelve 1
        if((des1==1 && des2==3) || (des1==2 && des2==1) || (des1==3 && des2==2)) return 1;
        // si no, devuelve 2
        return 2;
    }
    private final int decision(Scanner in){
        System.out.println("(1) PIEDRA");
        System.out.println("(2) PAPEL");
        System.out.println("(3) TIJERA");
        System.out.print("ELECCION: ");
        int numeroDecision = Integer.parseInt(in.nextLine());
        // si eligio correctamente un numero, retorna ese numero
        if(1<=numeroDecision && numeroDecision<=3) return numeroDecision;
        // sino, por recursion, se vuelve a preguntar hasta que lo coloque bien
        else return decision(in);
    }
}
