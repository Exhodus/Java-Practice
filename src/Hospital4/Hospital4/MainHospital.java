package Hospital4.Hospital4;

public class MainHospital {

    public static void main(String[] args) {
        Metge marc = new Metge();
        marc.diguesNom();
        System.out.println(marc.getAnysTreballats()+" "+marc.getSou());
        marc.augmentarAnysTreballats();
        System.out.println(marc.getAnysTreballats()+" "+ marc.getSou());

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        Metge perDefecte = new Metge();
        System.out.println(perDefecte.getNom());
        Metge house = new Metge("House");
        System.out.println(house.getNom()+" "+house.getSou());
        Metge wilson = new Metge("Wislon",10);
        System.out.println(wilson.getNom()+" "+wilson.getAnysTreballats());

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        Metge xavi = new Metge("Xavi", "Cardiologia",1500,2);
        xavi.infoMetge();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        Metge adri = new Metge("Adri", Categoria.ESPECIALISTA);
        System.out.println(adri.getNom()+" "+adri.getCategoria());
        if(adri.getCategoria() == Categoria.ESPECIALISTA){
            System.out.println("Marc es un Especialista!");
        }
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        Pacient andrea = new Pacient("Andrea", 2000, 28, Gravetat.LLEU);
        Pacient quim = new Pacient("Quim", 80);

        xavi.afegirPacient(andrea);
        xavi.afegirPacient(quim);
        xavi.setCategoria(Categoria.ESPECIALISTA);

        xavi.mostrarPacients();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        PacientHospitalitzat dani = new PacientHospitalitzat("Dani", 35);
        System.out.println(dani.getNom());
        dani.diguesNom();
        xavi.consulta(dani);

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        Metge david = new Metge();
        david.infoMetge();

        PacientHospitalitzat quimHospital = quim.hospitalitzat("cures");
        quimHospital.infoHospitlitzat();

        PacientHospitalitzat andreaHospital = hospitalitzat(andrea, "rehabilitació");
        andreaHospital.infoHospitlitzat();

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        Pacient daniPacient = new Pacient();
        dani.estatic = "hola";
        Pacient claudia = new Pacient();
        claudia.estatic = "adeu";

        System.out.println(dani.estatic);

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("TO STRING: ");
        System.out.println(marc.toString());
        System.out.println(xavi.toString());
        System.out.println(quimHospital.toString());
    }

   static public PacientHospitalitzat hospitalitzat(Pacient p, String tractament){
        if(!(p instanceof PacientHospitalitzat)){
            PacientHospitalitzat pH = new PacientHospitalitzat(p.getNom(), p.getDiners(), p.getEdat(), p.getGravetat());
            pH.setTractamentActual(tractament);
            return pH;
        } else {
            System.out.println("Aquest pacient ja està hospitalitzat");
            return (PacientHospitalitzat) p;
        }
    }
}
