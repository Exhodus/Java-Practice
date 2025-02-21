package Hospital4;

import java.util.Random;

public class Terapia extends Tractament {
    tipusTerapia tipusT;

    public Terapia(String nom, tipusTerapia tipus){
        super(nom);
        this.tipusT = tipus;
    }

    @Override
    public void administrar(PacientHospitalitzat pH) {
        if(!pH.getGravetat().equals(Gravetat.CRITICA)){
            int efectivitat = calcularEfectivitat(pH);
        }
    }

    private int calcularEfectivitat(PacientHospitalitzat pH) {

        if(pH.getDiagnose().equals(diagnose.ESGUINC) && this.tipusT.equals(tipusTerapia.FISIO)){
            Random rand = new Random();
            return 80 + rand.nextInt(0,20);
        } else if (pH.getDiagnose().equals())
    }

    private void reduirGravetat(PacientHospitalitzat pH){
        if(!pH.getGravetat().equals(Gravetat.LLEU)){

        }
    }

    private void augmentarGravetat(PacientHospitalitzat pH){
        if(!pH.getGravetat().equals(Gravetat.CRITICA)){

        }
    }
}
