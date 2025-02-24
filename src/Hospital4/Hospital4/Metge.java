package Hospital4.Hospital4;

import java.util.ArrayList;

public class Metge extends Persona {
    private int anysTreballats;
    private double sou;
    private String departament;
    private Categoria categoria;
    private ArrayList<Pacient> pacientsAssignats = new ArrayList<>();



    //Constructors
    public Metge(){
        super();
        this.anysTreballats = 0;
        this.sou = 1000.0;
        this.departament = "Sense Departament";
        this.categoria = Categoria.INTERN;
    }

    public Metge(String nom, Categoria cat){
        super(nom);
        this.sou = 1000.0;
        this.anysTreballats = 0;
        this.categoria = cat;
        this.categoria = Categoria.INTERN;
    }

    public Metge(String nom, String departament, int souInicial, int anysTreballats){
        super(nom);
        this.departament = departament;
        this.sou = souInicial;
        this.anysTreballats = anysTreballats;
        this.categoria = Categoria.INTERN;
    }

    public Metge(String nom){
        super(nom);
        this.anysTreballats = 0;
        this.sou = 1000.0;
    }

    public Metge(String nom, int anysTreballats){
        super(nom);
        for(int i = 0; i < anysTreballats; i++){
            this.augmentarAnysTreballats();
        }
    }

    //Getters
    public String getDepartament(){
        return this.departament;
    }

    public int getAnysTreballats(){
        return this.anysTreballats;
    }

    public double getSou(){
        return this.sou;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    public ArrayList<Pacient> getPacientsAssignats(){
        return this.pacientsAssignats;
    }

    //Setters

    public void setDepartament(String nouDepartament){
        this.departament = nouDepartament;
    }

    public void setCategoria(Categoria novaCategoria){
        if(!novaCategoria.equals(Categoria.INTERN) && this.categoria.equals(Categoria.INTERN)){
            this.categoria = novaCategoria;
        } else if (this.categoria.equals(Categoria.RESIDEN) && novaCategoria.equals(Categoria.ESPECIALISTA)){
            this.categoria = novaCategoria;
        } else {
            System.out.println("ERROR: No es pot assignar la nova categoría al metge. La nova" +
                    " categoria hauria de ser superior. No igual o inferior.");
        }
    }

    //Metodes


    @Override
    public String toString() {
        return "Metge{ nom=" + super.getNom() +
                ", anysTreballats=" + this.getAnysTreballats() +
                ", sou=" + this.getSou() +
                ", departament='" + this.getDepartament() + '\'' +
                ", categoria=" + this.getCategoria() +
                ", pacientsAssignats=" + this.getPacientsAssignats() +
                '}';
    }

    public boolean consulta(Pacient p){
        int preuBase = 10;
        double preuFinal = calcularPreuConsulta(p.getEdat(),p.getGravetat(),this.getCategoria(),preuBase);

        if(preuBase <= p.getDiners()){
            p.setDiners(preuBase);
            afegirPacient(p);
            return true;
        } else {
            return false;
        }
    }

    static double calcularPreuConsulta(int edat, Gravetat gravetat, Categoria categoria, int preuBase){
        if(categoria == Categoria.RESIDEN){
            preuBase*=2;
        } else if (categoria == Categoria.ESPECIALISTA){
            preuBase+=10;
        }

        if(edat < 15 || gravetat == Gravetat.CRITICA){
            preuBase = 0;
        }

        return preuBase;
    }

    public void afegirPacient(Pacient pacient){
        this.pacientsAssignats.add(pacient);
    }

    public void mostrarPacients(){
        for(int i = 0; i < this.pacientsAssignats.size(); i++){
            System.out.println(this.pacientsAssignats.get(i).getNom()+" "+this.pacientsAssignats.get(i).getGravetat());
        }
    }
    public void infoMetge(){
        System.out.println("Nom del Metge: "+super.getNom()+"\nDepartament:" +
                " "+this.departament+"\nAnys Treballats: "+this.anysTreballats+"\nSout: "+this.sou);
    }

    public void augmentarAnysTreballats(){
        this.anysTreballats++;
        actualitzarSou(this.sou*0.02);
        if(this.sou % 6 == 0){
            actualitzarSou(this.sou*0.05);
        }
    }

    private void actualitzarSou(double augment){
        this.sou = augment;
    }
}
