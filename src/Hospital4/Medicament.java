package Hospital4;

import java.util.Random;

public class Medicament extends Tractament{
    static Random rand = new Random();
    private tipusMedicament tipusM;

    //Constructors
    public Medicament(String nom, tipusMedicament tipus){
        super(nom);
        this.tipusM = tipus;
    }

    //Getters
    //Setters
    //Métodes

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
                    case "mitja":
                        if(randomness <= 40+rand.nextInt(0,31)){
                            reduirGravetat(pH);
                        }
                }
            } else{
                augmentarGravetat(pH);
            }
        }
    }

    private void augmentarGravetat(PacientHospitalitzat pH) {
        if(!pH.getGravetat().equals(Gravetat.CRITICA)){
            int indexSeguent = pH.getGravetat().ordinal() - 1;
            pH.setGravetat(Gravetat.values()[indexSeguent]);
        }
    }

    private void reduirGravetat(PacientHospitalitzat pH) {
        if(!pH.getGravetat().equals(Gravetat.LLEU)) {
            int indexSeguent = pH.getGravetat().ordinal() - 1;
            pH.setGravetat(Gravetat.values()[indexSeguent]);
        }
    }

    private String calcularEfectivitat(PacientHospitalitzat pH) {
        if((pH.getDiagnose().equals(diagnose.IBACTERIANA) && this.tipusM.equals(tipusMedicament.ANTIBIOTIC)) ||
                (pH.getDiagnose().equals(diagnose.DIABETIS) && this.tipusM.equals(tipusMedicament.ANTIDIABETIC))){
            return "alta";
        } else if (pH.getDiagnose().equals(diagnose.TOS) && this.tipusM.equals(tipusMedicament.ANTITUSIU)){
            return "alta";
        } else if (pH.getDiagnose().equals(diagnose.ESGUINC) && this.tipusM.equals(tipusMedicament.ANALGESIC)){
            return "mitja";
        } else {
            return "baixa";
        }
    }
}
