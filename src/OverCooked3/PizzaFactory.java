package OverCooked3;

public class PizzaFactory implements PlatFactory {

    @Override
    public PlatBasic crearPlat(Ingredient ingredient) {
        return new PlatBasic("Pizza amb "+ ingredient.getNom());
    }
}
