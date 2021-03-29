import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acciones {
    public static Proyecto crearProyecto(String nombre){
        Proyecto proyecto1 = new Proyecto();
        proyecto1.setNombre(nombre);
        return proyecto1;
    }

    //caso 1
    public static void darAltaPersona(Scanner scan, List personas, Proyecto proyecto){
        System.out.println("Introduce el DNI de la persona");
        String dni = scan.next();
        System.out.println("Introduce el nombre de la persona");
        String nombre = scan.next();
        System.out.println("Introduce el correo de la persona");
        String correo = scan.next();

        Persona persona1 = new Persona(nombre,correo,dni);
        proyecto.setPersonas(persona1);
        personas.add(persona1);


    }

    //caso 2

    public static void darAltaTarea(Scanner scan, List personas, Proyecto proyecto){

        System.out.println("Introduce el titulo de la tarea");
        String titulo = scan.next();
        System.out.println("Introduce la descripcion de la tarea");
        String descripcion = scan.next();
        System.out.println("Introduce la prioridad de la tarea");
        int prioridad = scan.nextInt();
        System.out.println("Introduce el responsable de la tarea");
        String nombreResponsable = scan.next();
        LocalDate fechaCreacion = LocalDate.now();
        System.out.println("Introduce el estado de la tarea");
        boolean estado = scan.nextBoolean();
        System.out.println("Introduce el el tipo de tarea que sera");
        String tipoResultado = scan.next();

        List<String> listaEtiquetas = new ArrayList<String>();
        Resultado resultadoTarea = tipoTarea(tipoResultado);
        Persona responsable = responsableTarea(nombreResponsable,personas);
        proyecto.setPersonas(responsable);
        Tarea tarea = new Tarea(titulo,descripcion,personas,responsable,prioridad,fechaCreacion,estado,resultadoTarea,listaEtiquetas);
        proyecto.setTareas(tarea);
    }

    /*public static List<String> etiquetas(Scanner scan){
        List<String> listaEtiquetas = new ArrayList<>();
        int opcionEtiqueta = 0;
        while(opcionEtiqueta != 0){
            System.out.println("Introduzca una etiqueta al proyecto");
            String etiqueta = scan.next();
            listaEtiquetas.add(etiqueta);
            System.out.println("Desea añadir una nueva etiqueta? Introduce 1 para si 2 para salir");
            opcionEtiqueta = scan.nextInt();
        }

        return listaEtiquetas;
    }*/

    public static Resultado tipoTarea(String tipoResultado){

        if( tipoResultado == "pagina web"){
            PaginaWeb resultado = new PaginaWeb();
            return resultado;
        }
        if( tipoResultado == "documentacion"){
            Documentacion resultado = new Documentacion();
            return resultado;

        }
        if( tipoResultado == "programa"){
            Programa resultado = new Programa();
            return resultado;
        }else{
            Biblioteca resultado = new Biblioteca();
            return resultado;
        }

    }

    public static Persona responsableTarea (String nombreResponsable,List<Persona> personas){
        Persona personaResponsable = new Persona();
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equals(nombreResponsable)){
                personaResponsable = personas.get(i);
            }
        }
        return personaResponsable;

    }



    //caso 3
    public static void tareaFinalizada(Proyecto proyecto, Scanner scan){
        System.out.println("Introduce el nombre de la tarea finalizada");
        String nombreTareaFinalizada = scan.next();

        for (int i = 0; i < proyecto.getTareas().size(); i++) {
            if (nombreTareaFinalizada.equals(proyecto.getTareas().get(i))){
                proyecto.getTareas().get(i).setEstado(true);
            }
        }
    }

    // caso 4
    public static void introducirPersona(Scanner scan, List<Persona> personas, Proyecto proyecto){
        for (int i = 0; i < proyecto.getTareas().size(); i++) {
            System.out.println(i + ": " + proyecto.getTareas().get(i).getTitulo());
        }
        System.out.println("En que tarea quieres añadir a la nueva persona");
        int numTarea = scan.nextInt();

        for (int i = 0; i < personas.size(); i++) {
            System.out.println(i + ": " + personas.get(i).getNombre());
        }

        System.out.println("Que persona desea añadir a la tarea");
        int numPersona = scan.nextInt();

        proyecto.getTareas().get(numTarea).setPersonasAsignadas(personas.get(numPersona));
    }

    // caso 5
    public static void eliminarPersona(Scanner scan, List<Persona> personas, Proyecto proyecto){
        for (int i = 0; i < proyecto.getTareas().size(); i++) {
            System.out.println(i + ": " + proyecto.getTareas().get(i).getTitulo());
        }
        System.out.println("De que tarea desea eliminar la persona");
        int numTarea = scan.nextInt();

        for (int i = 0; i < proyecto.getTareas().get(numTarea).getPersonasAsignadas().size(); i++) {
            System.out.println(i + ": " + proyecto.getTareas().get(numTarea).getPersonasAsignadas().get(i).getNombre());

        }

        System.out.println("Que persona desea eliminar de la tarea");
        int numPersona = scan.nextInt();

        proyecto.getTareas().get(numPersona).getPersonasAsignadas().remove(numPersona);

    }

    //Caso 6
    public static void listarPersonasProyecto(Proyecto proyecto){
        for (int i = 0; i < proyecto.getPersonas().size(); i++) {
            System.out.println(proyecto.getPersonas().get(i).getNombre());
        }
    }

    //caso 7
    public static void listarTareasProyecto(Proyecto proyecto){
        for (int i = 0; i < proyecto.getTareas().size(); i++) {
            System.out.println(proyecto.getTareas().get(i).toString());
        }
    }
}
