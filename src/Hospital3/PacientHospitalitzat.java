package Hospital3;

public class PacientHospitalitzat extends Pacient {
    static int nombrePacientsHospitalitzats;
    private String tractamentActual;
    private int diesHospitalitzat;

    //Constructors

    public PacientHospitalitzat(String nom, double diners, int edat, Gravetat gravetat) {
        super(nom, diners, edat, gravetat);
        this.diesHospitalitzat  = 0;
        nombrePacientsHospitalitzats++;
    }

    public PacientHospitalitzat(String nom, int edat) {
        super(nom, edat);
        this.tractamentActual = "Observació";
        this.diesHospitalitzat = 0;
        nombrePacientsHospitalitzats++;
    }

    public PacientHospitalitzat(Pacient p, String tractament){
        super(p.getNom(), p.getDiners(),p.getEdat(),p.getGravetat());
        this.tractamentActual = tractament;
        nombrePacientsHospitalitzats++;
    }

    //Getters
    public int getDiesHospitalitzat(){
        return this.diesHospitalitzat;
    }

    public String getTractamentActual(){
        return this.tractamentActual;
    }

    //Setters
    public void setTractamentActual(String tractamentActual) {
        this.tractamentActual = tractamentActual;
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
        return "PacientHospitalitzat{ nom=" + this.getNom() +
                ", tractamentActual='" + tractamentActual + '\'' +
                ", diesHospitalitzat=" + diesHospitalitzat +
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
