package Hospital2;

public class MainHospital {

    public static void main(String[] args) {
        Metge marc = new Metge();
        marc.nom = "Marc";
        marc.diguesNom();
        marc.anysTreballats = 2;
        marc.sou = 1000;
        System.out.println(marc.anysTreballats+" "+ marc.sou);
        marc.augmentarAnysTreballats();
        System.out.println(marc.anysTreballats+" "+ marc.sou);

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        Metge perDefecte = new Metge();
        System.out.println(perDefecte.nom);
        Metge house = new Metge("House");
        System.out.println(house.nom+" "+house.sou);
        Metge wilson = new Metge("Wislon",10);
        System.out.println(wilson.nom+" "+wilson.anysTreballats);

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        Metge xavi = new Metge("Xavi", "Cardiologia",1500,2);
        xavi.infoMetge();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        Metge adri = new Metge("Adri", Categoria.ESPECIALISTA);
        System.out.println(adri.nom+" "+adri.categoria);
        if(adri.categoria == Categoria.ESPECIALISTA) {
            System.out.println("Marc es un Especialista!");
        }
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        Pacient andrea = new Pacient("Andrea", 2000, 28, Gravetat.LLEU);
        Pacient quim = new Pacient("Quim", 80);

        xavi.afegirPacient(andrea);
        xavi.afegirPacient(quim);

        xavi.mostrarPacients();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        PacientHospitalitzat dani = new PacientHospitalitzat("Dani", 35);
        System.out.println(dani.nom);
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

    }

   static public PacientHospitalitzat hospitalitzat(Pacient p, String tractament){
        if(!(p instanceof PacientHospitalitzat)){
            PacientHospitalitzat pH = new PacientHospitalitzat(p.nom, p.diners, p.edat, p.gravetat);
            pH.tractamentActual = tractament;
            return pH;
        } else {
            System.out.println("Aquest pacient ja està hospitalitzat");
            return (PacientHospitalitzat) p;
        }
    }
}
