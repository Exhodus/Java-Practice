package OverCooked3;

public class Main {
    public static void main(String[] args) {

        String nomRestaurant = "El bistreau de DAMvi";

        DecoradorAmbient ambientFora = new SobreLava(new AmbTempesta(new AmbientBase()));
        Restaurant restaurant = Restaurant.getInstance(nomRestaurant);
        restaurant.setAmbient(ambientFora);
        restaurant.obrirRestaurant();

        RestaurantFactory italiaFactory = new ItaliaFactory();
        RestaurantFactory japoFactory = new JapoFactory();

        Cuiner cuinerItalia = italiaFactory.crearCuiner("Mario", 0);
        Cuiner cuinerJapo = japoFactory.crearCuiner("Sakura", 1);

        Ingredient tomaquet = italiaFactory.crearIngredient();
        Ingredient arros = japoFactory.crearIngredient();

        PlatFactory pizzaFactory = new PizzaFactory();
        PlatFactory sushiFactory = new SushiFactory();

        Plat pizza = pizzaFactory.crearPlat(tomaquet);
        Plat sushi = sushiFactory.crearPlat(arros);

        PlatBasic pizzaBasica = new PlatBasic(pizza.getNom());
        PlatBasic sushiBasic = new PlatBasic(sushi.getNom());


        restaurant.afegirComanda(pizzaBasica);
        restaurant.afegirComanda(sushiBasic);


        Client clientImpacient = new Client("Pau",10, "Italiana", "formatge");
        Client clientNormal = new Client("Laia", "Japonesa");


        clientImpacient.ferComanda(nomRestaurant);
        clientNormal.ferComanda(nomRestaurant);

        // Els cuiners cuinen
        cuinerItalia.cuinar(restaurant.getNom());
        cuinerJapo.cuinar(restaurant.getNom());

        // Els clients consumeixen el plat
        Plat platClient1 = new FormatgeExtra(pizza);
        PlatBasic platCielnt1Basic = new PlatBasic(platClient1.getNom());
        clientImpacient.consumirPlat(platCielnt1Basic);

        Plat platClient2 = sushi;
        PlatBasic platClient2Basic = new PlatBasic(platClient2.getNom());
        clientNormal.consumirPlat(platClient2Basic);

        // Comprovar rentat automàtic
        restaurant.iniciarRentatAutomatic();


    }
}
