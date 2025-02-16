package Hospital1;

public class Pacient {
    String nom;
    double diners;
    int edat;
    Gravetat gravetat;
    Planta planta;

    public Pacient(String nom, double diners, int edat, Gravetat gravetat){
        this.nom = nom;
        this.diners = diners;
        if(edat <= 0){
            this.edat = 0;
        } else if (edat > 150){
            this.edat = 150;
        } else {
            this.edat = edat;
        }
        this.calcularPlanta();
        this.gravetat = gravetat;
    }

    public Pacient(String nom, int edat){
        this.nom = nom;
        this.diners = 0;
        this.gravetat = Gravetat.LLEU;
        this.edat = edat;
        this.calcularPlanta();
    }

    public Planta calcularPlanta(){
        if(edat < 2){
            return Planta.NEONATAL;
        } else if (edat >= 2 && edat <= 18){
            return Planta.PEDIATRIA;
        } else if( edat >= 19 && edat <= 74){
            return Planta.GENERAL;
        } else {
            return Planta.GERIATRIA;
        }
    }



    public void diguesNom(){
        System.out.println("Nom del pacient: "+this.nom);
    }
}
