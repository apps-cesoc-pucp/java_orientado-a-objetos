package Clases;

import java.util.Scanner;

public class Squirtle extends Pokemon{
    public Squirtle(){
        super("Squirtle",15,10,100);
    }
    @Override
    public void atacar(Pokemon pokemon){
        Scanner buffer=new Scanner(System.in);
        int decision;
        int aux=pokemon.getAtaque();
        System.out.print("Qué ataque realizará Squirtle?:\n"+
                "1) Ataque Rápido\n"+
                "2) Hidrobomba\n"+
                "3) Cabezazo\n"+
                "4) Burbuja\n");
        decision=buffer.nextInt();
        switch (decision){
            case 1:ataqueRapido(this);
                break;
            case 2:hidrobomba(this);
                break;
            case 3:cabezazo(this);
                break;
            case 4:burbuja(this);
                break;
        }
        super.atacar(pokemon);
        pokemon.setAtaque(aux);
    }
    public void ataqueRapido(Pokemon pokemon){
        System.out.print("Squirtle a usado Atque Rápido!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*0.8));
    }
    public void hidrobomba(Pokemon pokemon){
        System.out.print("Squirtle a usado Hidrobomba!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*1.4));
    }
    public void cabezazo(Pokemon pokemon){
        System.out.print("Squirtle a usado Cabezazo!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*1.1));
    }
    public void burbuja(Pokemon pokemon){
        System.out.print("Squirtle a usado Burbuja!!\n");
        pokemon.setAtaque((pokemon.getAtaque()));
    }

}
