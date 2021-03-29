public class PaginaWeb extends Resultado {
    private String tipoPagina, tipoLenguaje, tipoBackEnd;

    public PaginaWeb() {}

    public PaginaWeb(String tipoPagina, String tipoLenguaje, String tipoBackEnd) {
        this.tipoPagina = tipoPagina;
        this.tipoLenguaje = tipoLenguaje;
        this.tipoBackEnd = tipoBackEnd;
    }

    public void setTipoPagina(String tipoPagina) {
        this.tipoPagina = tipoPagina;
    }

    public void setTipoLenguaje(String tipoLenguaje) {
        this.tipoLenguaje = tipoLenguaje;
    }

    public void setTipoBackEnd(String tipoBackEnd) {
        this.tipoBackEnd = tipoBackEnd;
    }

    public String getTipoPagina() {
        return tipoPagina;
    }

    public String getTipoLenguaje() {
        return tipoLenguaje;
    }

    public String getTipoBackEnd() {
        return tipoBackEnd;
    }
}
