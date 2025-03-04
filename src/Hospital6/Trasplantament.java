package Hospital6;

public class Trasplantament {
    private Organs organ;
    private Pacient donant;
    private Pacient receptor;

    //Constructors
    public Trasplantament(Organs organ, Pacient donant, Pacient receptor){
        this.organ = organ;
        this.donant= donant;
        this.receptor = receptor;
        realitzarTrasplantament();
    }

    //Mètodes
    public void realitzarTrasplantament(){
        this.donant.getMapaOrgans().put(this.organ, false);
        this.receptor.getMapaOrgans().put(this.organ, true);
    }


}
