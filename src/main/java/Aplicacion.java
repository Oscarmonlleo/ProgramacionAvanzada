import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el nombre del proyecto");
        String nombreProyecto = scan.nextLine();
        Proyecto proyecto = crearProyecto(nombreProyecto);
        List<Persona> personas = new ArrayList<>();
        int opcion;

        System.out.println("0 - Salir");
        System.out.println("1 - Dar de alta a una persona que trabajan en el proyecto");
        System.out.println("2 - Dar de alta las tareas con sus datos");
        System.out.println("3 - Marcar una tarea como finalizada");
        System.out.println("4 - Introducir una persona de una tarea");
        System.out.println("5 - Eliminar una persona de una tarea");
        System.out.println("6 - Listar las personas asignadas a un proyecto");
        System.out.println("7 - Listar las tareas de un proyecto");
        do{
            System.out.println("Elija una opcion");
            opcion = scan.nextInt();
            switch(opcion){
                case 0: break;
                case 1:{
                    darAltaPersona(scan,personas);
                    break;
                }
                case 2: {
                    darAltaTarea(scan,personas);
                }
                case 3:{
                    tareaFinalizada(proyecto,scan);
                    break;
                }
                case 4: {
                    tareaFinalizada(proyecto, scan);
                }
                case 5: {
                    eliminarPersona(tarea, scan);
                }
                case 6: {

                }
                case 7: {
                    listarTareasProyecto(proyecto);
                    break;
                }


            }
        }while (opcion != 0 || opcion > 8);
    }

    public static Proyecto crearProyecto(String nombre){
        Proyecto proyecto1 = new Proyecto();
        proyecto1.setNombre(nombre);
        return proyecto1;
    }

    //caso 1
    public static void darAltaPersona(Scanner scan,List personas){
        System.out.println("Introduce el DNI de la persona");
        String dni = scan.nextLine();
        System.out.println("Introduce el nombre de la persona");
        String nombre = scan.nextLine();
        System.out.println("Introduce el correo de la persona");
        String correo = scan.nextLine();

        Persona persona1 = new Persona(dni,nombre,correo);
        personas.add(persona1);


    }

    //caso 2

    public static void darAltaTarea(Scanner scan, List personas){

        System.out.println("Introduce el titulo de la tarea");
        String titulo = scan.nextLine();
        System.out.println("Introduce la descripcion de la tarea");
        String descripcion = scan.nextLine();
        System.out.println("Introduce el responsable de la tarea");
        String nombreResponsable = scan.nextLine();
        Persona responsable = responsableTarea(nombreResponsable,personas);
        System.out.println("Introduce la prioridad de la tarea");
        int prioridad = scan.nextInt();
        LocalDate fechaCreacion = LocalDate.now();
        System.out.println("Introduce el estado de la tarea");
        boolean estado = scan.nextBoolean();
        System.out.println("Introduce el el tipo de tarea que sera");
        String tipoTarea = scan.next();
        List<String> listaEtiquetas = introducirEtiqueta(scan);

        Tarea tarea = new Tarea(titulo,descripcion,personas,responsable,prioridad,fechaCreacion,estado,tipoTarea,listaEtiquetas);

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

    public static List introducirEtiqueta(Scanner scan){
        int opcionEtiqueta = 1;
        List<String> listaEtiquetas = new ArrayList<>();
        do{
            if(opcionEtiqueta != 0){
                System.out.println("Introduzca una etiqueta al proyecto");
                String etiqueta = scan.next();
                listaEtiquetas.add(etiqueta);
            }
            System.out.println("Desea añadir una nueva etiqueta? Introduce 1 para si 0 para salir");
            opcionEtiqueta = scan.nextInt();

        }while (opcionEtiqueta != 0);

        return listaEtiquetas;
    }

    //caso 3
    public static void tareaFinalizada(Proyecto proyecto, Scanner scan){
        System.out.println("Introduce el nombre de la tarea finalizada");
        String nombreTareaFinalizada = scan.nextLine();

        for (int i = 0; i < proyecto.getTareas().size(); i++) {
            if (nombreTareaFinalizada.equals(proyecto.getTareas().get(i))){
                proyecto.getTareas().get(i).setEstado(true);
            }
        }
    }

    //caso 4
    public static void añadirPersona(Tarea tarea, Scanner scan, Persona persona) {
        System.out.println("Persona ha añadir a la tarea");
        String nuevaPersona = scan.nextLine();
        for (int i = 0; i < tarea.getPersonasAsignadas().size(); i++) {
            if (nuevaPersona.equals(persona.getNombre())) {
                if (nuevaPersona.equals(tarea.getPersonasAsignadas().get(i))) {
                    System.out.println("Esta persona ya esta asignada a la tarea");
                }
                else {
                    tarea.getPersonasAsignadas().add(persona);
                }
            }
        }
    }

    //caso 5
    public static void eliminarPersona(Tarea tarea, Scanner scan) {
        System.out.println("Introduzca el nombre de la persona que quiere eliminar");
        String personaEliminada = scan.nextLine();

        for (int i = 0; i < tarea.getPersonasAsignadas().size(); i++) {
            if (personaEliminada.equals(tarea.getPersonasAsignadas().get(i).getNombre())) {
                tarea.getPersonasAsignadas().remove(personaEliminada);
            }
        }
    }

    //caso 6
    public static void listarPersonasProyecto (Proyecto proyecto) {

    }

    //caso 7
    public static void listarTareasProyecto (Proyecto proyecto) {
        Iterator iter = proyecto.getTareas().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
