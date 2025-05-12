package OverCooked2;

public abstract class Cuiner {
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


    @Override
    public String toString() {
        return "Cuiner{" +
                "nom='" + nom + '\'' +
                ", sexe=" + sexe +
                '}';
    }

    public abstract void cuinar(String nomRestaurant);
}
