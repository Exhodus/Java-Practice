package Minecraft;

public class Comerciant extends NoJugable implements Pocionable {
    Item producte;
    int quantitat;
    int preu;


    //Construcotrs
    public Comerciant(String nom, int quantitat, int preuVenda, Item objecte){
        super(nom, 1);
        this.quantitat = quantitat;
        this.preu = preuVenda;
        this.producte = objecte;
    }
    //Getters
    //Setters
    //Mètodes

    @Override
    public void mhasLlancatUnaPocio(Pocions p) {
        if(p.tipus.equals(tipusPocio.LLANCABLE)){
            this.viu = false;
        }
    }
}
