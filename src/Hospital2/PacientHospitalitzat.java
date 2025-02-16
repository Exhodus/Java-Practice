package Hospital2;

public class PacientHospitalitzat extends Pacient{
    String tractamentActual;
    int diesHospitalitzat;

    public PacientHospitalitzat(String nom, double diners, int edat, Gravetat gravetat) {
        super(nom, diners, edat, gravetat);
    }

    public PacientHospitalitzat(String nom, int edat) {
        super(nom, edat);
        this.tractamentActual = "Observació";
        this.diesHospitalitzat = 0;
    }
    public void afegirSimptoma(Simptoma s){
        super.afegirSimptoma(s);
        diesHospitalitzat++;
    }

}
