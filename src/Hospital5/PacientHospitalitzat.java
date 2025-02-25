package Hospital5;

import java.util.ArrayList;

public class PacientHospitalitzat extends Pacient {
    static int nombrePacientsHospitalitzats;
    private ArrayList<Tractament> tractamentsActuals = new ArrayList<>();
    private int diesHospitalitzat;
    private Diagnosi diagnosi;
    private Intervencio intervencioAssignada;

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

    public PacientHospitalitzat(Pacient p, Terapia ter){
        super(p.getNom(), p.getDiners(),p.getEdat(),p.getGravetat());
        this.tractamentsActuals.add(ter);
        nombrePacientsHospitalitzats++;
    }

    //Getters
    public int getDiesHospitalitzat(){
        return this.diesHospitalitzat;
    }

    public ArrayList<Tractament> getTractamentsActuals(){
        return this.tractamentsActuals;
    }

    public Diagnosi getDiagnosi() {
        return diagnosi;
    }

    public Intervencio getIntervencioAssignada(){
        return this.intervencioAssignada;
    }

    //Setters
    public void setTractamentActual(Tractament trac) {
        this.tractamentsActuals.add(new Medicament("Paracetamol",tipusMedicament.ANALGÈSIC));
    }

    public void setDiagnosi(Diagnosi dig){
        this.diagnosi = dig;
    }

    public void setIntervencioAssignada(Intervencio inter){
        this.intervencioAssignada = inter;
    }

    public void setDiesHospitalitzat(int diesHospitalitzat) {
        if(diesHospitalitzat >= this.diesHospitalitzat) {
            this.diesHospitalitzat = diesHospitalitzat;
        }else {
            System.out.println("Error: No es poden modificar els dies hospitalitzats.");
        }
    }



    //Métodes

    public void realitzarIntervencio(){

    }

    public void removeIntervention(Intervencio inter){
        if(this.intervencioAssignada.equals(inter)){
            intervencioAssignada = null;
        }
    }

    public void administrarTractament( Tractament tractament){
        if(this.tractamentsActuals.contains(tractament)){
            tractament.Administrar(this);
        }
    }

    @Override
    public String toString() {
        return "PacientHospitalitzat{" +
                " tractamentsActuals=" + tractamentsActuals +
                ", diesHospitalitzat=" + diesHospitalitzat +
                ", diagnosi=" + diagnosi +
                ", intervencioAssignada=" + intervencioAssignada +
                ", "+ this.getGravetat()+
                '}';
    }

    @Override


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
