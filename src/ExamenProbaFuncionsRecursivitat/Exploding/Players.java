package ExamenProbaFuncionsRecursivitat.Exploding;

import java.util.ArrayList;

public class Players {
    public static ArrayList<Integer> baralla = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1,  2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 11, 11, 11, 11, 12, 12, 12, 12, 15, 15));

    public static void main(String[] args) {
        Players[] jugadors = new Players[4];

        init();
        boolean fi = false;
        while (!fi) {
            SeleccionarCarta();
            if (cartaSeleccionada !=0){
                GestionarCartaTirada();
            }
            robar();
            if(isKitten){
                explota();

            }
            torn = canviTorn();
            fi = fiPartida();

        }
    }

}
