package Hospital1;

import java.util.ArrayList;

public class Metge {
    String nom;
    int anysTreballats;
    double sou;
    String departament;
    Categoria categoria;
    ArrayList<Pacient> pacientsAssignats = new ArrayList<>();

    public void afegirPacient(Pacient pacient){
        this.pacientsAssignats.add(pacient);
    }

    public boolean consulta(Pacient p){
        int preuBase = 10;
        if(this.categoria == Categoria.RESIDEN){
            preuBase*=2;
        } else if (this.categoria == Categoria.ESPECIALISTA){
            preuBase+=10;
        }

        if(p.edat < 15 || p.gravetat == Gravetat.CRITICA){
            preuBase = 0;
        }

        if(preuBase <= p.diners){
            p.diners -= preuBase;
            afegirPacient(p);
            return true;
        } else {
            return false;
        }
    }

    public void mostrarPacients(){
        for(int i = 0; i < this.pacientsAssignats.size(); i++){
            System.out.println(this.pacientsAssignats.get(i).nom+" "+this.pacientsAssignats.get(i).gravetat);
        }
    }

    public Metge(){
        this.nom = "Sense definir";
        this.anysTreballats = 0;
        this.sou = 1000.0;
        this.departament = "Sense Departament";
    }

    public Metge(String nom, Categoria cat){
        this.nom = nom;
        this.sou = 1000.0;
        this.anysTreballats = 0;
        this.categoria = cat;
    }

    public Metge(String nom, String departament, int souInicial, int anysTreballats){
        this.nom = nom;
        this.departament = departament;
        this.sou = souInicial;
        this.anysTreballats = anysTreballats;
    }

    public Metge(String nom){
        this.nom = nom;
        this.anysTreballats = 0;
        this.sou = 1000.0;
    }

    public Metge(String nom, int anysTreballats){
        this(nom);

        for(int i = 0; i < anysTreballats; i++){
            this.augmentarAnysTreballats();
        }
    }

    public void diguesNom(){
        System.out.println(this.nom);
    }

    public void infoMetge(){
        System.out.println("Nom del Metge: "+this.nom+"\nDepartament: "+this.departament+"\nAnys Treballats: "+this.anysTreballats+"\nSout: "+this.sou);
    }

    public void augmentarAnysTreballats(){
        this.anysTreballats++;
        this.sou += this.sou*0.02;
        if(this.sou % 6 == 0){
            this.sou += this.sou*0.05;
        }
    }
}
