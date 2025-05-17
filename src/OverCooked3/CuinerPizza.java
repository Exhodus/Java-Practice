package OverCooked3;

import java.util.Random;

public class CuinerPizza extends Cuiner {
    public CuinerPizza(String nom, int sexe) {
        super(nom, sexe);
    }

    @Override
    public void cuinar(String nomRestaurant) {
        if(this.getEstat() > 30) {
            this.setEstat( (this.getEstat() - (5 * Restaurant.getInstance(nomRestaurant).getAmbient().getModificadorDesgastCuiner())));
            Plat plat = Restaurant.getInstance(nomRestaurant).servirComanda();
            PlatBasic pb = new PlatBasic(plat.getNom());
            Random rand = new Random();
            String[] sep = plat.getNom().split(" ");
            int salsa = rand.nextInt(0,2);

            if (sep[0].equals("Pizza")) {
                FormatgeExtra pizzaFE = new FormatgeExtra(pb);
                if (getSexe() == 0) {
                    Peperoni pizzaFP = new Peperoni(pizzaFE);
                    if(salsa == 1){
                        SalsaExtra pizzaFPS = new SalsaExtra(pizzaFP);
                        System.out.println("El cuiner de Pizza " + getNom() + "està cuinant " + pizzaFPS.getNom());
                    } else {
                        System.out.println("El cuiner de Pizza " + getNom() + "està cuinant " + pizzaFP.getNom());
                    }
                } else {
                    if(salsa == 1){
                        SalsaExtra pizzaFS = new SalsaExtra(pizzaFE);
                        System.out.println("La cuinera de Pizza " + getNom() + "està cuinant " + pizzaFS.getNom());
                    } else {
                        System.out.println("La cuinera de Pizza " + getNom() + "està cuinant " + pizzaFE.getNom());
                    }
                }
                System.out.println(plat + " cuinat");
            } else {
                System.out.println("El plat " + pb.getNom() + " no pot ser cuinat per " + this.getNom());
                System.out.println("Tornant la comanda a la cua.");
                Restaurant.getInstance(Restaurant.getNom()).afegirComanda(pb);
            }
        } else {
            System.out.println("Plat rebutjat degut al mal estat del cuiner");
            this.setEstat(this.getEstat() + 10);
        }
    }



}
