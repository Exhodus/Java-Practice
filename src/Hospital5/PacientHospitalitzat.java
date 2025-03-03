package Hospital5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class PacientHospitalitzat extends Pacient {
    static ArrayList<PacientHospitalitzat> llistaPacientsHospitalitzats = new ArrayList<>();
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
        llistaPacientsHospitalitzats.add(this);
    }


    public PacientHospitalitzat(String nom, int edat) {
        super(nom, edat);
        this.diesHospitalitzat = 0;
        nombrePacientsHospitalitzats++;
        llistaPacientsHospitalitzats.add(this);
    }

    public PacientHospitalitzat(Pacient p, Terapia ter){
        super(p.getNom(), p.getDiners(),p.getEdat(),p.getGravetat());
        this.tractamentsActuals.add(ter);
        nombrePacientsHospitalitzats++;
        llistaPacientsHospitalitzats.add(this);
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

    public Trasplantament solicitarTrasplantament(PacientHospitalitzat pacient, Organs organ) throws Exception {
        PacientHospitalitzat donant = null;
        boolean complatible = esCompatible(organ, this, pacient);
        if(complatible){
            donant = pacient;
        }

        if(donant==null) {
            //hauria de tornar un error perquè el doanant no és compatible
            throw new DonantNocompatibleException("Error, el donant no és compatible");
        } else {
            return new Trasplantament(organ, this, donant);
        }

    }


    public boolean esCompatible(Organs organ, PacientHospitalitzat receptor, PacientHospitalitzat donant) throws Exception{
        if (receptor.getMapaOrgans().get(organ)) {
            throw new DonantNocompatibleException("Error, l'organ del receptor està sà.");
        } else if (!donant.getMapaOrgans().get(organ)){
            throw new DonantNocompatibleException("Error, l'organ del donant no està sà.");
        } else if (receptor.getGravetat().equals(Gravetat.CRITICA)){
            throw new DonantNocompatibleException("Error, la gravetat del pacient receptor ès crítica. Sería massa perillos" +
                    " fer el trasplantament.");
        } else if (donant.getGravetat().equals(Gravetat.LLEU)){
            throw new DonantNocompatibleException("Error, la gravetat del pacient donant ès més greu que LLEU. Sería massa " +
                    "perillos fer el trasplantament.");
        } else if (!receptor.getSexe().equals(donant.getSexe())){
            throw new DonantNocompatibleException("Error, el sexe dels dos pacients no coincideix. Per tant " +
                    "no funcionarà el trasplant (?)");
        } else {
            return true;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PacientHospitalitzat that = (PacientHospitalitzat) o;
        return diesHospitalitzat == that.diesHospitalitzat
                && Objects.equals(tractamentsActuals, that.tractamentsActuals)
                && diagnosi == that.diagnosi
                && Objects.equals(intervencioAssignada, that.intervencioAssignada);
    }
    @Override
    public int compareTo(Object arg0){
       PacientHospitalitzat altre = (PacientHospitalitzat) arg0;
       for(int i = 0; i < 4; i++){
           if(Gravetat.values()[i].equals(altre.getGravetat()) && !Gravetat.values()[i].equals(this.getGravetat())){
               return -1;
           } else if (!Gravetat.values()[i].equals(altre.getGravetat()) && Gravetat.values()[i].equals(this.getGravetat())){
               return +1;
           } else {
               if(altre.diesHospitalitzat > this.diesHospitalitzat){
                   return +1;
               } else if(altre.diesHospitalitzat < this.diesHospitalitzat){
                   return -1;
               } else{
                   for(int j =0; j < 8; j++){
                       if(Diagnosi.values()[i].equals(altre.getDiagnosi()) && !Diagnosi.values()[i].equals(this.getDiagnosi())){
                           return -1;
                       } else if (!Diagnosi.values()[i].equals(altre.getDiagnosi()) && Diagnosi.values()[i].equals(this.getDiagnosi())){
                           return +1;
                       }
                   }
               }
           }
       }
       return 0;
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
