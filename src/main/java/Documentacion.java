public class Documentacion extends Resultado{
    private String formato;
    private int numeroPaginas, espacioDisco;

    public Documentacion(){}

    public Documentacion(String formato, int numeroPaginas, int espacioDisco) {
        this.formato = formato;
        this.numeroPaginas = numeroPaginas;
        this.espacioDisco = espacioDisco;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setEspacioDisco(int espacioDisco) {
        this.espacioDisco = espacioDisco;
    }

    public String getFormato() {
        return formato;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getEspacioDisco() {
        return espacioDisco;
    }
}
