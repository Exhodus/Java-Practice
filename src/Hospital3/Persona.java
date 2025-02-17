package Hospital3;

public class Persona {
    private String nom;

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
