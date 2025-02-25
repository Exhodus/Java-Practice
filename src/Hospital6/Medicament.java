package Hospital6;

import java.util.Random;

public class Medicament extends Tractament {
    tipusMedicament tipusM;
    static Random rand = new Random();

    public Medicament(String nom, tipusMedicament tipus){
        super(nom);
        this.tipusM = tipus;
    }

    //SEtters

    @Override
    public void Administrar(PacientHospitalitzat ph) {
        if(!ph.getGravetat().equals(Gravetat.CRITICA)){
            String coherencia = coherenciaDM(ph);
            int randomness = rand.nextInt(0,101);
            switch (coherencia){
                case "Alta":
                    break;
                case "Mitja":
                    break;
                case "Baixa":
                    break;
            }
        }
    }

    private String coherenciaDM(PacientHospitalitzat ph) {
        String devolucio = "";

        if((ph.getDiagnosi().equals(Diagnosi.IBACTERIANA) && this.tipusM.equals(tipusMedicament.ANTIBIOTIC)) ||
                (ph.getDiagnosi().equals(Diagnosi.DIABETIS) && this.tipusM.equals(tipusMedicament.ANTIDIABETIC)) ||
                (ph.getDiagnosi().equals(Diagnosi.TOS) && this.tipusM.equals(tipusMedicament.ANTITUSIU))){
            if(this.getQuantitat() > 0) {
                this.quantitat--;
                return "Alta";
            }
        } else if (ph.getDiagnosi().equals(Diagnosi.ESGUINC) && this.tipusM.equals(tipusMedicament.ANALGÈSIC)){
            if(this.getQuantitat() > 0) {
                this.quantitat--;
                return "Mitja";
            }
        } else {
            if(this.getQuantitat() > 0) {
                this.quantitat--;
                return "Baixa";
            }
        }
        return devolucio;
    }
}
