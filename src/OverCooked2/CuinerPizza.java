package OverCooked2;

public class CuinerPizza extends Cuiner{
    public CuinerPizza(String nom, int sexe) {
        super(nom, sexe);
    }

    @Override
    public void cuinar(String nomRestaurant) {
        Plat plat = Restaurant.getInstance(nomRestaurant).servirComanda();

        if(getSexe() == 0){
            System.out.println("El cuiner de sushi "+ getNom() + "està cuinant "+plat);
        } else {
            System.out.println("La cuinera de sushi "+ getNom() + "està cuinant "+plat);
        }

        System.out.println(plat +" cuinat i consumit");
        Restaurant.getInstance(nomRestaurant).afegirPlatBrut(plat);
    }


}
