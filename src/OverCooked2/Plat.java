package OverCooked2;

public class Plat {
    private String nom;

    public Plat(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return this.nom ;
    }
}
