package Clases;

public class Pokemon {

    private String nombre;
    private int ataque;
    private int defensa;
    private String vida;

    public Pokemon(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public void atacar(Pokemon objetivo,boolean defiende){
        int daño,aux;
        aux=ataque;
        if(defiende) {
            objetivo.defenderse(this);
        }
        daño=(int)(ataque*(1+Math.random()/2));
        objetivo.vida=Integer.toString((Integer.parseInt(objetivo.vida)-daño));
        ataque=aux;
    }

    public void defenderse(Pokemon atacante){
        atacante.ataque=atacante.ataque-(int)(defensa*Math.random());
        if (atacante.ataque<0) atacante.ataque=0;
    }

}
