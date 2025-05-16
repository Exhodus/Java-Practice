package OverCooked3;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance("El bistreau de DAMvi");
        restaurant.obrirRestaurant();

        PizzaFactory pizzaFactory = new PizzaFactory();
        SushiFactory sushiFactory = new SushiFactory();

        ItaliaFactory italiaFactory = new ItaliaFactory();
        JapoFactory japoFactory = new JapoFactory();

        CuinerSushi xavi = (CuinerSushi) japoFactory.crearCuiner("Xavi", 0);
        CuinerPizza andrea = (CuinerPizza) italiaFactory.crearCuiner("Andrea", 1);

        //Plats
        restaurant.afegirComanda(pizzaFactory.crearPlat(japoFactory.crearIngredient()));
        restaurant.afegirComanda(pizzaFactory.crearPlat(italiaFactory.crearIngredient()));

        restaurant.afegirComanda(sushiFactory.crearPlat(italiaFactory.crearIngredient()));
        restaurant.afegirComanda(sushiFactory.crearPlat(japoFactory.crearIngredient()));

        while (!restaurant.getComanda().isEmpty()) {
            andrea.cuinar(restaurant.getNom());
            xavi.cuinar(restaurant.getNom());
        }

        restaurant.iniciarRentatAutomatic();
    }
}
