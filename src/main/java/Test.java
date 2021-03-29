import java.time.LocalDate;
import java.util.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    Scanner scan = new Scanner(System.in);
    List<Persona> personas = new ArrayList<>();
    /*System.out.println("Introduce el nombre del proyecto");*/
    String nombreProyecto = scan.next();
    /*Proyecto proyecto = crearProyecto(nombreProyecto);*/

    public Test() {
    }

    void ejecuta() {
        scan.useLocale(Locale.US);
        Menu opcion;
        do {
            System.out.println(Menu.getMenu());
            System.out.println("Selecciona una opcion");
            int  intOpcion = scan.nextInt();
            opcion = Menu.getOpcion(intOpcion);
            filtraOpcion(opcion);
        }
        while (opcion != Menu.SALIR);
    }

    private void filtraOpcion(final Menu opcion) {
        switch(opcion){
            case SALIR: {
                break;
            }
            case DAR_ALTA_PERSONA: {
                break;
            }
            case DAR_ALTA_TAREA: {
                break;
            }
            case TAREA_FINALIZADA:{
                break;
            }
            case INTRODUCIR_PERSONA: {
                break;
            }
            case ELIMINAR_PERSONA: {
                break;
            }
            case LISTAR_PERSONAS_PROYECTO: {
                break;
            }
            case LISTAR_TAREAS_PROYECTO: {
                break;
            }
        }
    }
    private void darAltaPersona() {

    }

    private void darAltaTarea() {

    }

    private void tareaFinalizada() {

    }

    private void introducirPersona() {

    }

    private void eliminarPersona() {

    }

    private void listarPersonasProyecto() {

    }

    private void listarTareasProyecto() {

    }
}