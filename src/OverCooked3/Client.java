package OverCooked3;

public class Client {
    private String nom;
    private int tempsPaciencia;
    private String preferenciaCuina;
    private boolean marxa;
    private String alergia;

    public Client(String nom, String preferenciaCuina) {
        this.nom = nom;
        this.preferenciaCuina = preferenciaCuina;
        this.tempsPaciencia = 20;
        this.marxa = false;
        this.alergia = null;
    }

    public Client(String nom, int tempsPaciencia, String preferenciaCuina,String alergia) {
        this.nom = nom;
        this.alergia = alergia;
        this.tempsPaciencia = 18;
        this.marxa = false;
    }

    //Getters
    public String getNom() {
        return nom;
    }

    public int getTempsPaciencia() {
        return tempsPaciencia;
    }

    public String getPreferenciaCuina() {
        return preferenciaCuina;
    }

    public boolean isMarxa() {
        return marxa;
    }

    public String getAlergia() {
        return alergia;
    }

    //Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTempsPaciencia(int tempsPaciencia) {
        this.tempsPaciencia = tempsPaciencia;
    }

    public void setPreferenciaCuina(String preferenciaCuina) {
        this.preferenciaCuina = preferenciaCuina;
    }

    public void setMarxa(boolean marxa) {
        this.marxa = marxa;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    //Métodes
    public void ferComanda(String nomRestaurant){
        if(this.getPreferenciaCuina().equals("Italia")){
            Restaurant.getInstance(Restaurant.getNom()).afegirComanda(new PizzaFactory().crearPlat(new ItaliaFactory().crearIngredient()));
        } else if (this.getPreferenciaCuina().equals("Japo")){
            Restaurant.getInstance(Restaurant.getNom()).afegirComanda(new SushiFactory().crearPlat(new JapoFactory().crearIngredient()));
        } else {
            System.out.println("Error: No s'ha trobat aquest plat a la carta.");
        }
    }

    public void consumirPlat(PlatBasic plat){
        if(plat.getNom().contains(this.getAlergia()) || this.getTempsPaciencia() <= 0){
            System.out.println("El client "+ this.getNom()+" ha marxat sense pagar.");
            System.out.println("Es retorna el plat a la pila de plats bruts.");
        }

        Restaurant.getInstance(Restaurant.getNom()).afegirPlatBrut(plat);
    }
}
