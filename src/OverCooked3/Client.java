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

    //Métodes
    public void ferComanda(){

    }
}
