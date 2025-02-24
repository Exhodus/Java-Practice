package Hospital4.Hospital4;

import java.util.ArrayList;

public class Pacient extends Persona {
    static String estatic;
    private double diners;
    private int edat;
    private ArrayList<Simptoma> simptoma = new ArrayList<>();
    private Gravetat gravetat;
    private Planta planta;

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
        this.calcularPlanta();
        this.gravetat = gravetat;
    }

    public Pacient(){
        super("Sense Definir");
        this.diners = 0;
        this.edat = 0;
        this.gravetat = Gravetat.LLEU;
    }

    public Pacient(String nom, int edat){
        super(nom);
        this.diners = 0;
        this.gravetat = Gravetat.LLEU;
        this.edat = edat;
        this.calcularPlanta();
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

    public PacientHospitalitzat hospitalitzat(String tractament){
        if(!(this instanceof PacientHospitalitzat)){
            PacientHospitalitzat p = new PacientHospitalitzat(super.getNom(), this.diners, this.edat, this.gravetat);
            p.setTractamentActual(tractament);
            return p;
        } else {
            System.out.println("Aquest pacient ja està hospitalitzat");
            return (PacientHospitalitzat) this;
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

}
