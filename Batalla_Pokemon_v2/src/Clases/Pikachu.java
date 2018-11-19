package Clases;

import java.util.Scanner;

public class Pikachu extends Pokemon {
    public Pikachu(){
        super("Pikachu",10,10,100);
    }
    @Override
    public void atacar(Pokemon pokemon){
        Scanner buffer=new Scanner(System.in);
        int decision;
        int aux=pokemon.getAtaque();
        System.out.print("Qué ataque realizará Pikachu?:\n"+
                "1) Ataque Rápido\n"+
                "2) Impactrueno\n"+
                "3) Cola de Hierro\n"+
                "4) Tacleada\n");
        decision=buffer.nextInt();
        switch (decision){
            case 1:ataqueRapido(this);
                break;
            case 2:impactrueno(this);
                break;
            case 3:colaDeHierro(this);
                break;
            case 4:tacleada(this);
                break;
        }
        super.atacar(pokemon);
        pokemon.setAtaque(aux);
    }
    public void ataqueRapido(Pokemon pokemon){
        System.out.print("Pikachu a usado Atque Rápido!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*0.8));
    }
    public void impactrueno(Pokemon pokemon){
        System.out.print("Pikachu a usado Impactrueno!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*1.4));
    }
    public void colaDeHierro(Pokemon pokemon){
        System.out.print("Pikachu a usado Cola de Hierro!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*1.1));
    }
    public void tacleada(Pokemon pokemon){
        System.out.print("Pikachu a usado Tacleada!!\n");
        pokemon.setAtaque((pokemon.getAtaque()));
    }

}
