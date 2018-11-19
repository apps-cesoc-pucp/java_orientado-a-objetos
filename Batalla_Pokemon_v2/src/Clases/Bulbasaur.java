package Clases;

import java.util.Scanner;

public class Bulbasaur extends Pokemon {
    public Bulbasaur (){
        super("Bulbasaur",10,15,100);
    }
    @Override
    public void atacar(Pokemon pokemon){
        Scanner buffer=new Scanner(System.in);
        int decision;
        int aux=pokemon.getAtaque();
        System.out.print("Qué ataque realizará Bulbasaur?:\n"+
                "1) Ataque Rápido\n"+
                "2) Rayo Solar\n"+
                "3) Hoja Afilada\n"+
                "4) Látigo Cepa\n");
        decision=buffer.nextInt();
        switch (decision){
            case 1:ataqueRapido(this);
                break;
            case 2:rayoSolar(this);
                break;
            case 3:hojaAfilada(this);
                break;
            case 4:latigoCepa(this);
                break;
        }
        super.atacar(pokemon);
        pokemon.setAtaque(aux);
    }
    public void ataqueRapido(Pokemon pokemon){
        System.out.print("Bulbasaur a usado Atque Rápido!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*0.8));
    }
    public void rayoSolar(Pokemon pokemon){
        System.out.print("Bulbasaur a usado Rayo Solar!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*1.4));
    }
    public void hojaAfilada(Pokemon pokemon){
        System.out.print("Bulbasaur a usado Hoja Afilada!!\n");
        pokemon.setAtaque((int)(pokemon.getAtaque()*1.1));
    }
    public void latigoCepa(Pokemon pokemon){
        System.out.print("Bulbasaur a usado Látigo Cepa!!\n");
        pokemon.setAtaque((pokemon.getAtaque()));
    }

}
