package Minecraft;


public class Components extends Item {

    public Components(String nom, int valor){
        super(nom,valor);
    }

    //Mètodes

    @Override
    public void avaluar() {
        System.out.println("Nom del Component: "+this.nom);
        System.out.println("Valor del Component: "+this.valor);
        if(this.valor > 100){
            System.out.println("Es molt valuós!");
        }
    }
}
