package Hospital5;

import java.util.*;

public class Pacient extends Persona implements Comparable{
    static String estatic;
    private double diners;
    private int edat;
    private ArrayList<Simptoma> simptoma = new ArrayList<>();
    private Gravetat gravetat;
    private Planta planta;
    private Map<Organs, Boolean> mapaOrgans;
    private Sexe sexe;

    //Constructors
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
        this.sexe = Sexe.MASCULI;
        this.planta = calcularPlanta();
        this.gravetat = gravetat;
        mapaOrgans = calcularOrgans();
    }

    public Pacient(){
        super("Sense Definir");
        this.diners = 0;
        this.edat = 0;
        this.gravetat = Gravetat.LLEU;
        this.planta = calcularPlanta();
        this.mapaOrgans = calcularOrgans();
    }

    public Pacient(String nom, int edat){
        super(nom);
        this.diners = 0;
        this.gravetat = Gravetat.LLEU;
        this.edat = edat;
        this.planta = calcularPlanta();
        this.mapaOrgans = calcularOrgans();
    }



    //Getters
     public double getDiners(){
        return this.diners;
     }

     public int getEdat(){
        return this.edat;
     }

     public Gravetat getGravetat(){
        return this.gravetat;
     }

     public Planta getPlanta(){
        return this.planta;
     }

     public ArrayList<Simptoma> getSimptoma(){
        return this.simptoma;
     }

     public Map<Organs, Boolean> getMapaOrgans(){
        return mapaOrgans;
     }

     public Sexe getSexe(){
        return this.sexe;
     }

    //Setters
    public void setDiners(double dinersATreure){
        this.diners -= dinersATreure;
    }

    public void setEdat(int novaEdat){

        if(novaEdat <= 0){
            this.edat = 0;
        } else if (novaEdat > 150){
            this.edat = 150;
        } else {
            this.edat = novaEdat;
        }

        this.planta = calcularPlanta();
    }

    public void setGravetat(Gravetat g){
        this.gravetat = g;
    }

    //Métodes

    public Map<Organs, Boolean> calcularOrgans(){
        Map<Organs, Boolean> devuelta = new HashMap<>();
        Random rand = new Random();

        for(int i = 0; i < 4; i++){
            int randomness = rand.nextInt(1,101);
            if(this.planta.equals(Planta.NEONATAL)){
                if(randomness > 5){
                    devuelta.put(Organs.values()[i], true);
                } else {
                    devuelta.put(Organs.values()[i], false);
                }
            } else if (this.planta.equals(Planta.PEDIATRIA)){
                if(randomness > 15){
                    devuelta.put(Organs.values()[i], true);
                } else {
                    devuelta.put(Organs.values()[i], false);
                }
            } else if (this.planta.equals(Planta.GENERAL)){
                if(randomness > 35){
                    devuelta.put(Organs.values()[i], true);
                } else {
                    devuelta.put(Organs.values()[i], false);
                }
            } else {
                if(randomness > 60){
                    devuelta.put(Organs.values()[i], true);
                } else {
                    devuelta.put(Organs.values()[i], false);
                }
            }
        }
        return devuelta;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pacient pacient = (Pacient) o;
        return Double.compare(diners, pacient.diners) == 0 && edat == pacient.edat
                && Objects.equals(simptoma, pacient.simptoma) && gravetat == pacient.gravetat
                && planta == pacient.planta && Objects.equals(mapaOrgans, pacient.mapaOrgans)
                && sexe == pacient.sexe;
    }

    @Override
    public String toString() {
        return "Pacient{nom=" + super.getNom() +
                ", diners=" + this.getDiners() +
                ", edat=" + this.getEdat() +
                ", simptoma=" + this.getSimptoma() +
                ", gravetat=" + this.getGravetat() +
                ", planta=" + this.getPlanta() +
                '}';
    }

    public PacientHospitalitzat hospitalitzat(Tractament trac) throws Exception{
        if(!(this instanceof PacientHospitalitzat)){
            PacientHospitalitzat p = new PacientHospitalitzat(super.getNom(), this.diners, this.edat, this.gravetat);
            p.setTractamentActual(trac);
            return p;
        } else {
            throw new PacientJaHospitalitzatException("Error, Aquest Pacient ja està Hospitalitzat.");
        }
    }

    public void afegirSimptoma(Simptoma s){
        this.simptoma.add(s);
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



    private Planta calcularPlanta(){
        if(this.edat < 2){
            return Planta.NEONATAL;
        } else if (this.edat >= 2 && edat <= 18){
            return Planta.PEDIATRIA;
        } else if( this.edat >= 19 && edat <= 74){
            return Planta.GENERAL;
        } else {
            return Planta.GERIATRIA;
        }
    }

    @Override
    public int compareTo(Object arg0) {
        Pacient altre = (Pacient) arg0;
        // comparo per edat. si l'altre té més edat, soc més petit
        if (altre.edat > this.edat) {
            return -1;
        } else if (this.edat > altre.edat) {
            return 1;
        } // si tenen la mateixa edat comparem per nom
        else {// com que nom és una string i string té el seu propi compareTo, el podem fer servir
            return this.getNom().compareTo(altre.getNom());
        }
    }
}
