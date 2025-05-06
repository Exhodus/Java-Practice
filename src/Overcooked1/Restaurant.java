package Overcooked1;

public class Restaurant {
    private static Restaurant instance = null;
    private static String nom;

    //Constructor
    private Restaurant(String nom){
        Restaurant.nom = nom;
    }

    //Método
    public static Restaurant getInstance(String nom){
         if(instance == null){
             instance = new Restaurant(nom);
         }

         return instance;
    }

    public void obrirRestaurant(){
        System.out.println("El restaurant " + nom + " està obert.");
    }

    public static String getNom(){
        return nom;
    }

    public void afegirComanda(Plat p){

    }

    public  Plat servirComanda(){
        Plat p = new Plat("nom");
        return p;
    }

    public void afegirPlatBrut(Plat p){

    }

    public void iniciarRentatAutomatic(){

    }

}
