package Hospital5;

public interface Intervencio {
    public void assignar(PacientHospitalitzat p);
    public void realitzar (PacientHospitalitzat p);

    public default boolean potAssignar(PacientHospitalitzat pac){
        if(pac.getIntervencioAssignada() != null && pac.getGravetat().equals(Gravetat.CRITICA)){
            return true;
        }
        return false;
    }

    public default boolean intervencioMalAplicada(PacientHospitalitzat pac){
        for(int i = 0; i < pac.getTractamentsActuals().size(); i++){
            if(pac.getTractamentsActuals().get(i) instanceof Intervencio){
                return true;
            }
        }

        return false;
    }
}
