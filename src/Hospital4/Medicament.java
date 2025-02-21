package Hospital4;

public class Medicament extends Tractament{
    private tipusMedicament tipusM;

    //Constructors
    public Medicament(String nom, tipusMedicament tipus){
        super(nom);
        this.tipusM = tipus;
    }

    //Getters
    //Setters
    //Métodes

    @Override
    public void administrar(PacientHospitalitzat pH) {

    }
}
