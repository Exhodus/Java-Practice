package OverCooked2;

public class PizzaFactory implements PlatFactory{

    @Override
    public Plat crearPlat(Ingredient ingredient) {
        return new Plat("Pizza amb "+ ingredient.getNom());
    }
}
