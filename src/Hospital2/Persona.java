package Hospital2;

public class Persona {
    String nom;

    public Persona(String nom) {
        this.nom = nom;
    }

    public Persona(){
        this.nom = "Sense Definir";
    }

    public void diguesNom(){
        System.out.println(this.nom);
    }
}
