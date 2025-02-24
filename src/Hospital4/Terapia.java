package Hospital4;

import java.util.Random;

public class Terapia extends Tractament {
    static Random rand = new Random();
    tipusTerapia tipusT;

    public Terapia(String nom, tipusTerapia tipus){
        super(nom);
        this.tipusT = tipus;
    }

    @Override
    public void administrar(PacientHospitalitzat pH) {
        if(!pH.getGravetat().equals(Gravetat.CRITICA)){
            String efectivitat = calcularEfectivitat(pH);
            int randomness = rand.nextInt(0,101);
            if(randomness < 90){
                switch (efectivitat){
                    case "alta":
                        if(randomness <= 80+rand.nextInt(0,21)){
                            reduirGravetat(pH);
                        }
                        break;
                    case "baixa":
                        if(randomness <= 10+rand.nextInt(0,21)){
                            reduirGravetat(pH);
                        }
                        break;
                    case "incoherencia":
                        augmentarGravetat(pH);
                        break;
                }
            } else{
                augmentarGravetat(pH);
            }
        }
    }

    private String calcularEfectivitat(PacientHospitalitzat pH) {
        if((pH.getDiagnose().equals(diagnose.ESGUINC) && this.tipusT.equals(tipusTerapia.FISIO)) ||
                (pH.getDiagnose().equals(diagnose.ANSIETAT) && this.tipusT.equals(tipusTerapia.PSICO)) ||
                (((pH.getDiagnose().equals(diagnose.RESTRENYIMENT) || pH.getDiagnose().equals(diagnose.DIABETIS))) &&
                this.tipusT.equals(tipusTerapia.NUTRICIONAL))){
            return "Alta";
        } else if (this.tipusT.equals(tipusTerapia.TIMO)){
            return "incoherencia";
        } else {
            return "baixa";
        }
    }

    private void reduirGravetat(PacientHospitalitzat pH){

        if(!pH.getGravetat().equals(Gravetat.LLEU)) {
            int indexSeguent = pH.getGravetat().ordinal() - 1;
            pH.setGravetat(Gravetat.values()[indexSeguent]);
        }
    }

    private void augmentarGravetat(PacientHospitalitzat pH){
        if(!pH.getGravetat().equals(Gravetat.CRITICA)){
            int indexSeguent = pH.getGravetat().ordinal() - 1;
            pH.setGravetat(Gravetat.values()[indexSeguent]);
        }
    }
}
