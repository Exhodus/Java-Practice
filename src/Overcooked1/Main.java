package Overcooked1;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance("El bistreau de DAMvi");
        restaurant.obrirRestaurant();
//        Plat plat = new Plat("Pizza");
//        restaurant.afegirComanda(plat);
//        cuiner.cuinar();
        //Exercici 8
        Cuiner dani = new Cuiner("Dani",0);
        Cuiner claudia = new Cuiner("Claudia",1);
        Plat plat = new Plat("Pizza");
        Plat plat2 = new Plat("Spaguetti");
        Plat plat3 = new Plat("Carpaccio");
        Plat plat4 = new Plat("Sopa");
        Plat plat5 = new Plat("Macarrons");
        Plat plat6 = new Plat("Truita");

        restaurant.afegirComanda(plat);
        restaurant.afegirComanda(plat2);
        restaurant.afegirComanda(plat3);
        restaurant.afegirComanda(plat4);
        restaurant.afegirComanda(plat5);
        restaurant.afegirComanda(plat6);

        dani.cuinar();
        claudia.cuinar();
        dani.cuinar();
        claudia.cuinar();
        dani.cuinar();
        claudia.cuinar();

        restaurant.iniciarRentatAutomatic();
    }
}
