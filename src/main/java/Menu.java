public enum Menu {
    SALIR("Salir."),
    DAR_ALTA_PERSONA("Dar de alta a una persona que trabaja en el proyecto."),
    DAR_ALTA_TAREA("Dar de alta las tareas con sus datos."),
    TAREA_FINALIZADA("Marcar una tarea como finalizada."),
    INTRODUCIR_PERSONA("Introducir una persona en una tarea."),
    ELIMINAR_PERSONA("Eliminar una persona de una tarea."),
    LISTAR_PERSONAS_PROYECTO("Listar las personas asignadas a un proyecto."),
    LISTAR_TAREAS_PROYECTO("Listar las tareas de un proyecto.");


    private String name;

    Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Menu getOpcion (int posicion) {
        return values()[posicion];
    }

    public static String getMenu() {
        StringBuilder sb = new StringBuilder();
        for (Menu opcion : Menu.values()) {
            sb.append(opcion.ordinal());
            sb.append(".-");
            sb.append(opcion.name);
            sb.append("\n");
        }
        return sb.toString();
    }
}
