package Hospital4.Hospital4;

public abstract class Tractament {
    private String nom;
    private int quantitat;

    //Constructors
    public Tractament(String nom){
        this.nom = nom;
        quantitat = 1;
    }

    //Getters
    public String getNom(){
        return this.nom;
    }

    public int getQuantitat(){
        return this.quantitat;
    }

    //Metodes

    public void obtenir(int numTractaments){
        this.quantitat += numTractaments;
    }

    public abstract void Administrar(PacientHospitalitzat ph){}
}
