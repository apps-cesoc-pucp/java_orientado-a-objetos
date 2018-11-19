package Clases;

import java.util.Scanner;

public class Charmander extends Pokemon{
    public Charmander(){
        super("Charmander",20,5,75);
    }
    @Override
    public void atacar(Pokemon pokemon){
        Scanner buffer=new Scanner(System.in);
        int decision;
        int aux=pokemon.getAtaque();
        System.out.print("Qué ataque realizará Charmander?:\n"+
                "1) Ataque Rápido\n"+
                "2) Lanzallamas\n"+
                "3) Cuchillada\n"+
                "4) Arañazo\n");
        decision=buffer.nextInt();
        switch (decision){
            case 1:ataqueRapido(this);
                break;
            case 2:lanzallamas(this);
                break;
            case 3:cuchillada(this);
                break;
            case 4:aranazo(this);
                break;
        }
        super.atacar(pokemon);
        pokemon.setAtaque(aux);
    }
    public void ataqueRapido(Pokemon pokemon){
        System.out.print("Charmander a usado Atque Rápido!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*0.8));
    }
    public void lanzallamas(Pokemon pokemon){
        System.out.print("Charmander a usado Lanzallamas!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*1.4));
    }
    public void cuchillada(Pokemon pokemon){
        System.out.print("Charmander a usado Cuchillada!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*1.1));
    }
    public void aranazo(Pokemon pokemon){
        System.out.print("Charmander a usado Arañazo!!\n");
        pokemon.setAtaque((pokemon.getAtaque()));
    }

}
