package Hospital4;

public class Persona {
    private String nom;


    //Constructors
    public Persona(String nom) {
        this.nom = nom;
    }

    public Persona(){
        this.nom = "Sense Definir";
    }

    //Getters
    public String getNom(){
        return this.nom;
    }

    //Setters
//    public void setNom(String nouNom){
//        this.nom = nouNom;
//    }

    //Métodes
    public void diguesNom(){
        System.out.println(this.nom);
    }
}
