package Hospital3;

import Hospital4.Hospital4.Tractament;
import java.util.ArrayList;

public class PacientHospitalitzat extends Pacient {
    static int nombrePacientsHospitalitzats;
    private ArrayList<Tractament> tractamentsActuals = new ArrayList<>();
    private int diesHospitalitzat;

    //Constructors

    public PacientHospitalitzat(String nom, double diners, int edat, Gravetat gravetat) {
        super(nom, diners, edat, gravetat);
        this.diesHospitalitzat  = 0;
        nombrePacientsHospitalitzats++;
    }

    public PacientHospitalitzat(String nom, int edat) {
        super(nom, edat);
        this.tractamentsActuals.add(new Tractament("Observació"));
        this.diesHospitalitzat = 0;
        nombrePacientsHospitalitzats++;
    }

    public PacientHospitalitzat(Pacient p, String tractament){
        super(p.getNom(), p.getDiners(),p.getEdat(),p.getGravetat());
        this.tractamentsActuals.add(new Tractament(tractament));
        nombrePacientsHospitalitzats++;
    }

    //Getters
    public int getDiesHospitalitzat(){
        return this.diesHospitalitzat;
    }

    public String getTractamentActual(){
        return this.tractamentsActuals.toString();
    }

    //Setters
    public void setTractamentActual(String tractamentActual) {
        this.tractamentsActuals.add(new Tractament(tractamentActual));
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

    public void infoHospitlitzat(){
        System.out.println("Nom: "+super.getNom());
        System.out.println("Edat: "+super.getEdat());
        System.out.println("Tractament: "+this.getTractamentActual());
        System.out.println("Dies Hospitalitzat: "+this.getDiesHospitalitzat());
    }

}
