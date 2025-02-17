package Hospital3;

public class PacientHospitalitzat extends Pacient {
    String tractamentActual;
    int diesHospitalitzat;

    //Constructors

    public PacientHospitalitzat(String nom, double diners, int edat, Gravetat gravetat) {
        super(nom, diners, edat, gravetat);
        this.diesHospitalitzat  = 0;
    }

    public PacientHospitalitzat(String nom, int edat) {
        super(nom, edat);
        this.tractamentActual = "Observació";
        this.diesHospitalitzat = 0;
    }



    public PacientHospitalitzat(Pacient p, String tractament){
        super(p.nom, p.diners,p.edat,p.gravetat);
        this.tractamentActual = tractament;
    }

    public void afegirSimptoma(Simptoma s){
        super.afegirSimptoma(s);
        diesHospitalitzat++;
    }

    public void infoHospitlitzat(){
        System.out.println("Nom: "+this.nom);
        System.out.println("Edat: "+this.edat);
        System.out.println("Tractament: "+this.tractamentActual);
        System.out.println("Dies Hospitalitzat: "+this.diesHospitalitzat);
    }

}
