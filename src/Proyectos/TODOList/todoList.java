package Proyectos.TODOList;

import java.util.ArrayList;
import java.util.Scanner;

public class todoList {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Tarea> tareas = new ArrayList<>();
        Tarea tarea = new Tarea();
        boolean salir = false;
        while (!salir){
            System.out.println("MENU");
            System.out.println(" 1. Agregar tarea.");
            System.out.println(" 2. Ver tareas.");
            System.out.println(" 3. Eliminar tarea.");
            System.out.println(" 4. Marcar tarea.");
            System.out.println(" 5. Salir.");
            int opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion){
                case 1:
                    agregarTarea(tareas,tarea);
                    break;
                case 2:
                    verTareas(tareas);
                    break;
                case 3:
                    eliminarTareas(tareas);
                    break;
                case 4:
                    marcarTarea(tareas);
                    break;
                case 5:
                    System.out.println("Hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.print("La opción entrada no es correcta. Por favor, introduce una opción válida: ");
            }
        }
    }

    private static void marcarTarea(ArrayList<Tarea> tareas) {
        for(int i = 0; i < tareas.size(); i++){
            System.out.println(" "+i +" "+ tareas.get(i).nombre+"     "+tareas.get(i).estado);
        }
        System.out.println("Qué tarea quieres marcar como completada? 0-"+(tareas.size()-1));
        int index = scan.nextInt();
        System.out.println("Se ha eliminado "+tareas.get(index).nombre+" ahora está completada.");
        tareas.get(index).estado = true;
    }

    private static void eliminarTareas(ArrayList<Tarea> tareas) {
        for(int i = 0; i < tareas.size(); i++){
            System.out.println(" "+i +" "+ tareas.get(i).nombre+"     "+tareas.get(i).estado);
        }
        System.out.println("Qué tarea quieres eliminar? 0-"+(tareas.size()-1));
        int index = scan.nextInt();
        System.out.println("Se ha eliminado "+tareas.get(index).nombre+" con estado "+tareas.get(index).estado);
        tareas.remove(index);
    }

    private static void verTareas(ArrayList<Tarea> tareas) {
        System.out.println("Tareas en \"true\" están acabadas.");
        for(int i = 0; i < tareas.size(); i++){
            System.out.println(tareas.get(i).nombre+"     "+tareas.get(i).estado);
        }
    }

    private static void agregarTarea(ArrayList<Tarea> tareas, Tarea tarea) {
        System.out.println("Introduce el nombre de la tarea que quieres entrar: ");
        tarea.nombre = scan.nextLine();
        System.out.println("Introduce el estado de esta tarea: (Por defecto inacabada)");
        System.out.println("Acabada/Inacabada");
        String sino = scan.nextLine().toLowerCase();
        if(sino.equals("acabada")){
            tarea.estado = true;
        }
    }


}
