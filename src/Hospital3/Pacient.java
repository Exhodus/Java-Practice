package Hospital3;

import java.util.ArrayList;

public class Pacient extends Persona {
    double diners;
    int edat;
    ArrayList<Simptoma> simptoma = new ArrayList<>();
    Gravetat gravetat;
    Planta planta;

    public Pacient(Pacient p, String tractament){
        PacientHospitalitzat pac = new PacientHospitalitzat(p.nom,p.edat);
        pac.diesHospitalitzat = 0;
        pac.diners = this.diners;
        pac.gravetat = Gravetat.LLEU;
        pac.planta = this.calcularPlanta();
    }

    public PacientHospitalitzat hospitalitzat(String tractament){
        if(!(this instanceof PacientHospitalitzat)){
            PacientHospitalitzat p = new PacientHospitalitzat(this.nom, this.diners, this.edat, this.gravetat);
            p.tractamentActual = tractament;
            return p;
        } else {
            System.out.println("Aquest pacient ja està hospitalitzat");
            return (PacientHospitalitzat) this;
        }
    }

    public void afegirSimptoma(Simptoma s){
        simptoma.add(s);
        if(this.gravetat.equals(Gravetat.LLEU) && !s.gravetat.equals(this.gravetat)){
            this.gravetat = s.gravetat;
        } else if(this.gravetat.equals(Gravetat.MODERARA)) {
            if(s.gravetat.equals(Gravetat.GREU)){
                this.gravetat = s.gravetat;
            } else if (s.gravetat.equals(Gravetat.CRITICA)){
                this.gravetat = s.gravetat;
            }
        } else if (this.gravetat.equals(Gravetat.GREU) && s.gravetat.equals(Gravetat.CRITICA)){
            this.gravetat = s.gravetat;
        }
    }

    public Pacient(String nom, double diners, int edat, Gravetat gravetat){
        super(nom);
        this.diners = diners;
        if(edat <= 0){
            this.edat = 0;
        } else if (edat > 150){
            this.edat = 150;
        } else {
            this.edat = edat;
        }
        this.calcularPlanta();
        this.gravetat = gravetat;
    }

    public Pacient(String nom, int edat){
        super(nom);
        this.diners = 0;
        this.gravetat = Gravetat.LLEU;
        this.edat = edat;
        this.calcularPlanta();
    }

    public Planta calcularPlanta(){
        if(edat < 2){
            return Planta.NEONATAL;
        } else if (edat >= 2 && edat <= 18){
            return Planta.PEDIATRIA;
        } else if( edat >= 19 && edat <= 74){
            return Planta.GENERAL;
        } else {
            return Planta.GERIATRIA;
        }
    }

}
