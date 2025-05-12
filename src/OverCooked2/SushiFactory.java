package OverCooked2;

public class SushiFactory implements PlatFactory{

    @Override
    public Plat crearPlat(Ingredient ingredient) {
        return new Plat("Sashimi amb "+ ingredient.getNom());
    }
}
