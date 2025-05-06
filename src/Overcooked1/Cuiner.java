package Overcooked1;

public class Cuiner {
    private String nom;
    private int sexe;

    public Cuiner(String nom, int sexe) {
        this.nom = nom;
        this.sexe = sexe;
    }

    //Getters

    public String getNom() {
        return nom;
    }

    public int getSexe() {
        return sexe;
    }

    //Setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    //Mètodes

    public void cuinar(Plat plat){
        if(this.sexe == 0){
            System.out.println("El cuiner "+nom+" està cuinant "+plat);
        } else{
            System.out.println("La cuinera "+nom+" està cuinant "+plat);
        }
    }

    @Override
    public String toString() {
        return "Cuiner{" +
                "nom='" + nom + '\'' +
                ", sexe=" + sexe +
                '}';
    }
}
