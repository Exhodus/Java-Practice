package Joel.Diccionarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ChuletaForEach2 {
    public static void main(String[] args) {
        int[] aInt = { 92, 54, 23, 12, 7, 8, 9 };

        for (int i = 0; i < aInt.length; i++) {
            System.out.println(aInt[i]);
        }
        System.out.println("_____________________________");


        for (int i: aInt) {

            System.out.println(i);
        }

        System.out.println("_____________________________");

        ArrayList<String> lParaules = new ArrayList<String>(Arrays.asList("Patata", "Pastanaga", "Mongeta", "Ceba"));

        for (int i = 0; i < lParaules.size(); i++) {

            String s = lParaules.get(i);
            System.out.println(s);

        }
        System.out.println("_____________________________");

        for (String s: lParaules) {

            System.out.println(s);
        }
        System.out.println("_____________________________");


        HashSet<String> hset = new HashSet<String>();
        hset.add("carn");
        hset.add("peix");
        hset.add("ous");
        hset.add("verdura");
        hset.add("fruita");

        for (int i=0;i<hset.size();i++) {

            //no es por recorrer així
        }

        for(String s: hset) {

            System.out.println(s);

        }
        System.out.println("_____________________________");

    }
}
