package OverCooked3;

public class Restaurant {
    private static Restaurant instance = null;
    private static String nom;
    private static Comandes comanda = new Comandes();
    private static PlatsBruts pb = new PlatsBruts();
    private static DecoradorAmbient ambient ;

    //Constructor
    private Restaurant(String nom){
        Restaurant.nom = nom;
    }

    public Comandes getComanda(){
        return comanda;
    }

    public static DecoradorAmbient getAmbient() {
        return ambient;
    }

    public void setAmbient(DecoradorAmbient ambientFora){
        ambient = ambientFora;
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

    public void afegirComanda(PlatBasic p){
        comanda.add(p);
    }

    public Plat servirComanda(){
        return comanda.pop();
    }

    public void afegirPlatBrut(Plat p){
        pb.add(p);
    }

    public void iniciarRentatAutomatic(){
        while (!pb.isEmpty()) {
            try {
                System.out.println("S'ha rentat el plat que portaba " + pb.poll().getNom());
                if(!pb.isEmpty()){
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
