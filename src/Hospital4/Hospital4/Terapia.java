package Hospital4.Hospital4;

import java.util.Random;

public class Terapia extends Tractament{
    tipusTerapia tipusT;
    static Random rand = new Random();

    public Terapia(String nom, tipusTerapia tipus){
        super(nom);
        this.tipusT = tipus;
    }


    @Override
    public void Administrar(PacientHospitalitzat ph) {
        if(!ph.getGravetat().equals(Gravetat.CRITICA)){
            String coherencia = coherenciaDT(ph);
            int randomness = rand.nextInt(0,101);
            switch (coherencia){
                case "Alta":
                    int plus = rand.nextInt(0,21);
                    if(80+plus > randomness){
                        ph.reduirGravetat();
                    }
                    break;
                case "incoherent":
                    ph.augmentarGravetat();
                    break;
                default:
                    System.out.println("No s'ha pogut portar a terme la terapia");
            }

        }
    }

    private String coherenciaDT(PacientHospitalitzat ph) {
        String devolucio = "";

        if(ph.getDiagnosi().equals(Diagnosi.ESGUINC) && this.tipusT.equals(tipusTerapia.FISIO) ||
                ph.getDiagnosi().equals(Diagnosi.ANSIETAT) && this.tipusT.equals(tipusTerapia.PSICO) ||
                ph.getDiagnosi().equals(Diagnosi.RESTRENYIMENT) && this.tipusT.equals(tipusTerapia.NUTRICIONAL) ||
                ph.getDiagnosi().equals(Diagnosi.DIABETIS) && this.tipusT.equals(tipusTerapia.NUTRICIONAL)){
            return "Alta";
        } else if (this.tipusT.equals(tipusTerapia.TIMO)){
            return "incoherent";
        }

        return devolucio;
    }
}
