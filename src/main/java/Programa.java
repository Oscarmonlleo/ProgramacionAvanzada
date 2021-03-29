public class Programa extends Resultado {

    private String tipoLenguaje;
    private int numeroLineas, numModelos;

    public Programa() {}

    public Programa(String tipoLenguaje, int numeroLineas, int numModelos) {
        this.tipoLenguaje = tipoLenguaje;
        this.numeroLineas = numeroLineas;
        this.numModelos = numModelos;
    }

    public void setTipoLenguaje(String tipoLenguaje) {
        this.tipoLenguaje = tipoLenguaje;
    }

    public void setNumeroLineas(int numeroLineas) {
        this.numeroLineas = numeroLineas;
    }

    public void setNumModelos(int numModelos) {
        this.numModelos = numModelos;
    }


    public String getTipoLenguaje() {
        return tipoLenguaje;
    }

    public int getNumeroLineas() {
        return numeroLineas;
    }

    public int getNumModelos() {
        return numModelos;
    }
}
