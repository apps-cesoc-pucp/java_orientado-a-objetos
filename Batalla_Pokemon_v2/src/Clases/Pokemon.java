package Clases;

public class Pokemon {
    // ATRIBUTOS
    private String nombre;
    private int ataque;
    private int defensa;
    private int vida;

    // CONSTRUCTOR
    public Pokemon(String nombre, int ataque, int defensa, int vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
    }

    // GETTERS Y SETTERS PARA ACCESO DESDE FUERA DE LA CLASE A LOS ATRIBUTOS PRIVATE
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

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    // METODOS
    /*
    * Este método recibe como parámetro al objeto Pokemon a atacar.
    * Se diminuye la vida del pokemon pasado como parametro de acuerdo al ataque del pokemon que declara ataque.
    * Se usa Math.random() para determinar por sorteo si ataque aumenta en un porcentaje o no.
    * Se usa tambien el metodo defenderse() el pokemon atacado.
    * */
    public void atacar(Pokemon pokemon){
        int ataqueAux = this.ataque;
        // la suerte del atacante depende de su fuerza de ataque
        int suerteAtack = (int)(Math.random()*this.ataque)+1;
        this.ataque += (suerteAtack < 30 ? 10 : 0);
        // ahora realizamos el ataque, el pokemon intentara defenderse
        pokemon.defenderse(this);
        this.ataque = ataqueAux;
    }

    /*
     * Ahhhh, me da pereza comentar este metodo
     */
    private void defenderse(Pokemon pokemon){
        // la suerte de la defensa depende de cuanta defensa posee el pokemon
        int suerteDefense = (int)(Math.random()*this.defensa) + 1;
        // altas probabilidades de defenderse si posee poca defensa
        if(suerteDefense<30){
            System.out.print(this.nombre + " se ha defendido!!");
            if(this.defensa < pokemon.getAtaque()){
                System.out.println(" - PERO EL ATAQUE HA SIDO EFECTIVO! :c");
                this.vida -= pokemon.getAtaque() + this.defensa;
            } else {
                System.out.println(" - BUENA DEFENSA!!");
            }
        } else{
            // bajas probabilidades de defenderse si posee bastante defensa
            System.out.println(this.nombre + " no ha podido defenderse!!");
        }
        System.out.println("Ataque de "+pokemon.getNombre()+": "+pokemon.getAtaque());
        System.out.println("Vida de "+this.nombre+": "+this.vida+"\n\n");
    }
}
