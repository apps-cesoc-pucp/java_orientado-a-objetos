package Clases;

final class Resultados {
    private final String ganador;
    private final String entranador;
    private final boolean defiende;


    public Resultados(String ganador,String entranador, boolean defiende) {
        this.ganador = ganador;
        this.entranador=entranador;
        this.defiende=defiende;
    }

    public String getGanador() {
        return ganador;
    }

    public String getEntranador() {
        return entranador;
    }

    public boolean getDefiende(){
        return defiende;
    }
}
