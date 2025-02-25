package Hospital5;

import java.util.Random;

public class Cirugia extends Tractament implements Intervencio {
    private boolean exitosa;

    public Cirugia(String nom){
        super(nom);
        Random rand= new Random();
        int siNo = rand.nextInt(0,2);
        if( siNo == 0){
            this.exitosa = false;
        } else {
            this.exitosa = true;
        }
    }

    @Override
    public void Administrar(PacientHospitalitzat ph) {
        this.assignar(ph);
    }

    @Override
    public void assignar(PacientHospitalitzat p) {
        p.setIntervencioAssignada(this);
    }

    public void realitzar(PacientHospitalitzat p){
       if(this.exitosa){
           p.reduirGravetat();
       }

       p.removeIntervention(this);
    }
}
