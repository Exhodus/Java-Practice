package OverCooked3;

public interface RestaurantFactory {
    Cuiner crearCuiner(String nom, int sexe);
    Ingredient crearIngredient();
}
