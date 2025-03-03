package Minecraft;

public class Pocions extends Item {
    int poder;
    tipusPocio tipus;

    //Constructors
    public Pocions(String nom, int valor, int poder, tipusPocio tipus){
        super(nom, valor);
        this.poder = poder;
        this.tipus = tipus;
    }
    //Getters
    //Setters
    //Mètodes


    @Override
    public void avaluar() {
        System.out.println("Nom de la poció: "+this.nom);
        System.out.println("Tipus de la poció: "+this.tipus);
        System.out.println("Valor de la poció: "+this.valor);
        if(this.valor > 50){
            System.out.println("És molt valuosa!");
        }
    }
}
