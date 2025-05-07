package Overcooked1;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance("El bistreau de DAMvi");
        restaurant.obrirRestaurant();
        Cuiner cuiner = new Cuiner("Dani",0);
        Plat plat = new Plat("Pizza");
        Comandes comanda = new Comandes("primera");
        restaurant.afegirComanda(comanda, plat);
        cuiner.cuinar(plat);
        System.out.println("S'ha servit el plat "+restaurant.servirComanda(comanda).getNom());
        restaurant.afegirPlatBrut(plat);

    }
}
