import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tarea {

    private String titulo, descripcion ;
    private List<Persona> personasAsignadas = new ArrayList<Persona>();
    private Persona responsable;
    private int prioridad;
    private LocalDate fechaCreacion, fechaFinalizacion;
    private boolean estado; //true para finalizado, false para no finalizado
    private Resultado resultadoEsperado;
    private List<String> listaEtiquetas = new ArrayList<String>();

    public Tarea(){}

    public Tarea(String titulo, String descripcion, List<Persona> personasAsignadas, Persona responsable, int prioridad, LocalDate fechaCreacion, boolean estado, Resultado resultadoEsperado, List<String> listaEtiquetas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.personasAsignadas = personasAsignadas;
        this.responsable = responsable;
        this.prioridad = prioridad;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.resultadoEsperado = resultadoEsperado;
        this.listaEtiquetas = listaEtiquetas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPersonasAsignadas(Persona persona) {
        this.personasAsignadas.add(persona);
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setResultadoEsperado(Resultado resultadoEsperado) {
        this.resultadoEsperado = resultadoEsperado;
    }

    public void setListaEtiquetas(List<String> listaEtiquetas) {
        this.listaEtiquetas = listaEtiquetas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Persona> getPersonasAsignadas() {
        return personasAsignadas;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public boolean getEstado() {
        return estado;
    }

    public Resultado getResultadoEsperado() {
        return resultadoEsperado;
    }

    public List<String> getListaEtiquetas() {
        return listaEtiquetas;
    }
}
