import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre, correoElectronico,dni;
    private List<Tarea> tareasResponsable = new ArrayList<Tarea>();

    public Persona (){}

    public Persona (String nombre, String correoElectronico,String dni){
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.dni = dni;


    }

    public String getNombre(){
        return this.nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public List<Tarea> getTareasResponsable() {
        return tareasResponsable;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


}
