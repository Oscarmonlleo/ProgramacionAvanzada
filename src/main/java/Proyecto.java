import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Proyecto {
    private String nombre;
    private List<Persona> personas = new ArrayList<Persona>();
    private List<Tarea> tareas = new ArrayList<Tarea>();

    public Proyecto(){}

    public Proyecto(String nombre, List <Persona> personas, List<Tarea> tareas) {
        this.nombre = nombre;
        this.personas = personas;
        this.tareas = tareas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPersonas(Persona persona) {
        personas.add(persona);
    }

    public void setTareas(Tarea tarea) {
        tareas.add(tarea);
    }

    public String getNombre() {
        return nombre;
    }

    public List <Persona> getPersonas() {
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
