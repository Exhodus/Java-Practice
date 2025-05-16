package OverCooked3;

public class CuinerPizza extends Cuiner {
    public CuinerPizza(String nom, int sexe) {
        super(nom, sexe);
    }

    @Override
    public void cuinar(String nomRestaurant) {
        if(this.getEstat() > 30) {
            this.setEstat( (this.getEstat() - (5 * Restaurant.getInstance(nomRestaurant).getAmbient().getModificadorDesgastCuiner())));
            Plat plat = Restaurant.getInstance(nomRestaurant).servirComanda();

            String[] sep = plat.getNom().split(" ");

            if (sep[0].equals("Pizza")) {
                if (getSexe() == 0) {
                    System.out.println("El cuiner de Pizza " + getNom() + "està cuinant " + plat.getNom());
                } else {
                    System.out.println("La cuinera de Pizza " + getNom() + "està cuinant " + plat.getNom());
                }
                System.out.println(plat + " cuinat i consumit");
                Restaurant.getInstance(nomRestaurant).afegirPlatBrut(plat);
            } else {
                System.out.println("El plat " + plat.getNom() + " no pot ser cuinat per " + this.getNom());
                System.out.println("Tornant la comanda a la cua.");
                Restaurant.getInstance(Restaurant.getNom()).afegirComanda(plat);
            }
        } else {
            System.out.println("Plat rebutjat degut al mal estat del cuiner");
            this.setEstat(this.getEstat() + 10);
        }
    }



}
