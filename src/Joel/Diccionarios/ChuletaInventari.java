package Joel.Diccionarios;

import java.util.HashMap;

public class ChuletaInventari {
    public static void main(String[] args) {


        HashMap<String, Integer> inventari = new HashMap<>();

        inventari.put("macarrons", 55);
        inventari.put("guisantes", 30);

        System.out.println("Per començar tenim: " + inventari);
        System.out.println();

        int num_macarrons = inventari.getOrDefault("macarrons", 0);

        int despesa_macarrons = 15; //número de ,macarrons que fem servir quan cuinem macarrons amb tomàquet per 4 persones

        //Cuinem macarrons

        if (num_macarrons > 0 && num_macarrons >= despesa_macarrons) {
            inventari.put("macarrons", num_macarrons - despesa_macarrons);
            num_macarrons = inventari.getOrDefault("macarrons", 0);
            System.out.println("Plat de macarrons fet");
        } else if (num_macarrons < despesa_macarrons) {
            System.out.println("No hi ha prous macarrons, hauries d'anar a comprar-ne");
            System.out.println("Falten " + (despesa_macarrons - num_macarrons) + " macarrons per poder fer un plat");
        }
        System.out.println("Ïnventari actual: " + inventari);

        //Repetim cuinar macarrons

        if (num_macarrons > 0 && num_macarrons >= despesa_macarrons) {
            inventari.put("macarrons", num_macarrons - despesa_macarrons);
            num_macarrons = inventari.getOrDefault("macarrons", 0);
            System.out.println("Plat de macarrons fet");
        } else if (num_macarrons < despesa_macarrons) {
            System.out.println("No hi ha prous macarrons, hauries d'anar a comprar-ne");
            System.out.println("Falten " + (despesa_macarrons - num_macarrons) + " macarrons per poder fer un plat");
        }
        System.out.println("Ïnventari actual: " + inventari);

        if (num_macarrons > 0 && num_macarrons >= despesa_macarrons) {
            inventari.put("macarrons", num_macarrons - despesa_macarrons);
            num_macarrons = inventari.getOrDefault("macarrons", 0);
            System.out.println("Plat de macarrons fet");
        } else if (num_macarrons < despesa_macarrons) {
            System.out.println("No hi ha prous macarrons, hauries d'anar a comprar-ne");
            System.out.println("Falten " + (despesa_macarrons - num_macarrons) + " macarrons per poder fer un plat");
        }
        System.out.println("Ïnventari actual: " + inventari);

        if (num_macarrons > 0 && num_macarrons >= despesa_macarrons) {
            inventari.put("macarrons", num_macarrons - despesa_macarrons);
            num_macarrons = inventari.getOrDefault("macarrons", 0);
            System.out.println("Plat de macarrons fet");
        } else if (num_macarrons < despesa_macarrons) {
            System.out.println("No hi ha prous macarrons, hauries d'anar a comprar-ne");
            System.out.println("Falten " + (despesa_macarrons - num_macarrons) + " macarrons per poder fer un plat");
        }
        System.out.println("Ïnventari actual: " + inventari);

        if (num_macarrons > 0 && num_macarrons >= despesa_macarrons) {
            inventari.put("macarrons", num_macarrons - despesa_macarrons);
            num_macarrons = inventari.getOrDefault("macarrons", 0);
            System.out.println("Plat de macarrons fet");
        } else if (num_macarrons < despesa_macarrons) {
            System.out.println("No hi ha prous macarrons, hauries d'anar a comprar-ne");
            System.out.println("Falten " + (despesa_macarrons - num_macarrons) + " macarrons per poder fer un plat");
        }
        System.out.println("Ïnventari actual: " + inventari);
    }

}
