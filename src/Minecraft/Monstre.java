package Minecraft;

public class Monstre extends NoJugable implements Pocionable{
    int atac;


    //Constructors
    public Monstre(String nom, int maxHp, int atac){
        super(nom, maxHp);
        this.atac = atac;
    }

    //Mètodes
    public boolean atacar(Personatge p) throws Exception{
        if(p.viu) {
            p.setHpDown(p.getHp(), this.atac);
            if (p.getHp() <= 0) {
                p.viu = false;
            }
            return p.viu;
        }else {
            throw  new EtsPobreException("El comerciant es mort.");
        }
    }

    @Override
    public void mhasLlancatUnaPocio(Pocions p) {
        if(p.tipus.equals(tipusPocio.LLANCABLE)) {
            this.setHpDown(this.getHp(), p.poder);
            if (this.getHp() <= 0) {
                this.viu = false;
            }
        }
    }
}
