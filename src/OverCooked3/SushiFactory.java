package OverCooked3;

public class SushiFactory implements PlatFactory {

    @Override
    public PlatBasic crearPlat(Ingredient ingredient) {
        return new PlatBasic("Sashimi amb "+ ingredient.getNom());
    }
}
