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

    public void atacar(Pokemon objetivo){
        int daño;
        objetivo.defenderse(this);
        daño=(int)(this.getAtaque()*(1+Math.random()/2));

        objetivo.setVida(Integer.toString((Integer.parseInt(objetivo.getVida())-daño)));

    }

    public void defenderse(Pokemon atacante){
        atacante.setAtaque(atacante.getAtaque()-(int)(this.getDefensa()*Math.random()));
    }

}
