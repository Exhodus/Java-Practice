package Minecraft;

public abstract class Item {
    String nom;
    int valor;

    //Constructors

    public Item(String nom, int valor){
        this.nom = nom;
        this.valor = valor;
    }


    //Mètodes

    public abstract void avaluar();

}
