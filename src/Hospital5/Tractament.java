package Hospital5;

public abstract class Tractament {
    private String nom;
    protected int quantitat;

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

    //Setters
    public void setQuantitat(int num){
        this.quantitat -= num;
    }

    //Metodes

    public void obtenir(int numTractaments){
        this.quantitat += numTractaments;
    }

    public abstract void Administrar(PacientHospitalitzat ph);
}
