package OverCooked3;

public class CuinerSushi extends Cuiner {

    public CuinerSushi(String nom, int sexe) {
        super(nom, sexe);
    }

    @Override
    public void cuinar(String nomRestaurant){
        Plat plat = Restaurant.getInstance(nomRestaurant).servirComanda();
        String[] sep = plat.getNom().split(" ");
        PlatBasic pb = new PlatBasic(plat.getNom());

        if(sep[0].equals("Sashimi")) {
            if (getSexe() == 0) {
                System.out.println("El cuiner de sushi " + getNom() + "està cuinant " + pb.getNom());
            } else {
                System.out.println("La cuinera de sushi " + getNom() + "està cuinant " +pb.getNom());
            }
            System.out.println(plat +" cuinat i consumit");
            Restaurant.getInstance(nomRestaurant).afegirPlatBrut(plat);
        } else {
            System.out.println("El plat "+ plat.getNom()+" no pot ser cuinat per "+ this.getNom());
            System.out.println("Tornant la comanda a la cua.");
            Restaurant.getInstance(Restaurant.getNom()).afegirComanda(pb);
        }
    }
}
