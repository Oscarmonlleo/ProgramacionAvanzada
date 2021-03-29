import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Proyecto {
    private String nombre;
    private Map<String,Persona> personas = new HashMap<String,Persona>();
    private List<Tarea> tareas = new ArrayList<Tarea>();

    public Proyecto(){}

    public Proyecto(String nombre, Map<String, Persona> personas, List<Tarea> tareas) {
        this.nombre = nombre;
        this.personas = personas;
        this.tareas = tareas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPersonas(String dni, Persona persona) {
        personas.put(dni, persona);
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public String getNombre() {
        return nombre;
    }

    public Map<String, Persona> getPersonas() {
        return personas;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public boolean contieneTarea(String nombre){
        if(tareas.contains(nombre)) return true;
        return false;
    }
}
