package Joel.Diccionarios;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class ChuletaBasica {
    public static void main(String[] args) {
        // Un diccionari és un parella de CLAU / VALOR

        // HashMap<TipusClau, TipusValor> nom = new HashMap<>();

        HashMap<Integer, String> mesos = new HashMap<>();

        TreeMap<String, Integer> notes = new TreeMap<>();
        // un TreeMap sempre ordena (numerica o alfabeticament)
        // un HashMap ordena una mica com vol
        // un LinkedHashMap ordena per ordre de entrada

        // CRUD CREATE READ UPDATE DELETE

        // afegir diccionari

        mesos.put(5, "Maig"); // el put farà un update si ja existeix la clau

        System.out.println(mesos);

        // llegir dades d'un diccionari

        System.out.println(mesos.get(5));
        System.out.println(mesos);

        // eliminar un diccionari

        mesos.remove(5);
        System.out.println(mesos);

        // hem de tenir cura amb els null

        // fem un diccionari de notes

        notes.put("Erik", 6);
        notes.put("Marc", 7);
        notes.put("Emma", 10);

        System.out.println(notes); // recordeu que el treemap orrdena alfabèticament o per números

        notes.remove("Erik");

        // sempre millor utilitzar getOrDefault per evita el null (null kk)
        System.out.println(notes.get("Erik"));
        System.out.println(notes.getOrDefault("Erik", -1));

        // replace

        notes.replace("Marc", 5);
        System.out.println(notes.get("Marc"));

        // contains
        System.out.println("El diccionari conté una key Marc? " + notes.containsKey("Marc"));
        System.out.println("El diccionari conté una key Erik? " + notes.containsKey("Erik"));
        System.out.println("El diccionari conté un o més valors iguals a 10? " + notes.containsValue(10));
        System.out.println("El diccionari conté un o més valors iguals a 4? " + notes.containsValue(4));

        notes.put("Marc", 6);
        System.out.println(notes);

        //keySet

        Set<String> keyNotes = notes.keySet();
        System.out.println(keyNotes);


        //values

        Collection<Integer> valuesNotes = notes.values();
        System.out.println(valuesNotes);

    }
}
