package Hospital4.Hospital4;

import Hospital4.Hospital4.Tractament;

import java.util.ArrayList;

public class PacientHospitalitzat extends Pacient {
    static int nombrePacientsHospitalitzats;
    private ArrayList<Tractament> tractamentsActuals = new ArrayList<>();
    private int diesHospitalitzat;
    private Diagnosi diagnosi;

    //Constructors

    public PacientHospitalitzat(String nom, double diners, int edat, Gravetat gravetat) {
        super(nom, diners, edat, gravetat);
        this.diesHospitalitzat  = 0;
        nombrePacientsHospitalitzats++;
    }

    public PacientHospitalitzat(String nom, int edat) {
        super(nom, edat);
        this.diesHospitalitzat = 0;
        nombrePacientsHospitalitzats++;
    }

    public PacientHospitalitzat(Pacient p, Medicament med){
        super(p.getNom(), p.getDiners(),p.getEdat(),p.getGravetat());
        this.tractamentsActuals.add(med);
        nombrePacientsHospitalitzats++;
    }

    public PacientHospitalitzat(Pacient p, Terapia ter){
        super(p.getNom(), p.getDiners(),p.getEdat(),p.getGravetat());
        this.tractamentsActuals.add(ter);
        nombrePacientsHospitalitzats++;
    }

    //Getters
    public int getDiesHospitalitzat(){
        return this.diesHospitalitzat;
    }

    public String getTractamentActual(){
        return this.tractamentsActuals.toString();
    }

    public Diagnosi getDiagnosi() {
        return diagnosi;
    }

    //Setters
    public void setTractamentActual(Medicament med) {
        this.tractamentsActuals.add(med);
    }
    public void setTractamentActual(Terapia ter) {
        this.tractamentsActuals.add(ter);
    }

    public void setDiesHospitalitzat(int diesHospitalitzat) {
        if(diesHospitalitzat >= this.diesHospitalitzat) {
            this.diesHospitalitzat = diesHospitalitzat;
        }else {
            System.out.println("Error: No es poden modificar els dies hospitalitzats.");
        }
    }



    //Métodes


    @Override
    public String toString() {
        return "PacientHospitalitzat{ nom=" + super.getNom() +
                ", tractaments Actuals ='" + this.tractamentsActuals.toString() + '\'' +
                ", diesHospitalitzat=" + this.diesHospitalitzat  +
                '}';
    }

    public void afegirSimptoma(Simptoma s){
        super.afegirSimptoma(s);
        diesHospitalitzat++;
    }

    public void reduirGravetat(){
        if(!this.getGravetat().equals(Gravetat.LLEU)){
            this.setGravetat(Gravetat.values()[this.getGravetat().ordinal()-1]);
        }
    }

    public void augmentarGravetat(){
        if(!this.getGravetat().equals(Gravetat.CRITICA)){
            this.setGravetat(Gravetat.values()[this.getGravetat().ordinal()+1]);
        }
    }

}
