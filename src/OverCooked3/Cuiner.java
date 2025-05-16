package OverCooked3;

public abstract class Cuiner {
    private String nom;
    private int sexe;
    private double estat;

    public Cuiner(String nom, int sexe) {
        this.nom = nom;
        this.sexe = sexe;
    }

    //Getters


    public double getEstat() {
        return estat;
    }

    public String getNom() {
        return nom;
    }

    public int getSexe() {
        return sexe;
    }

    //Setters


    public void setEstat(double estat) {
        this.estat = estat;
    }

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
