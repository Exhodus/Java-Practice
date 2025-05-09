package OverCooked2;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance("El bistreau de DAMvi");
        restaurant.obrirRestaurant();


        RestaurantFactory italiaFactory = new ItaliaFactory();
        Cuiner cuinerItalia = italiaFactory.crearCuiner("Dani", 0);
        Ingredient ingredientItalia = italiaFactory.crearIngredient();


        Plat pizza = new Plat("Pizza");
        // Afegim comandes
        restaurant.afegirComanda(pizza);
        cuinerItalia.cuinar(restaurant.getNom());
    }
}
