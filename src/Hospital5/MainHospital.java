package Hospital5;

public class MainHospital {

    public static void main(String[] args) throws Exception {
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

        Pacient quim = new Pacient("Quim", 80);

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

        Medicament med = new Medicament("Paracetamol", tipusMedicament.ANALGÈSIC);
        PacientHospitalitzat quimHospital = quim.hospitalitzat(med);


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


        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        System.out.println("Coherencies: ");
        System.out.println(quimHospital.toString());
        quimHospital.setDiagnosi(Diagnosi.ESGUINC);
        Medicament medicament = new Medicament("Droga", tipusMedicament.ANALGÈSIC);
        quimHospital.setTractamentActual(medicament);
        System.out.println(quimHospital.toString());


        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        System.out.println("Li cambiem la gravetat al Quim de lleu a Greu");
        quimHospital.setGravetat(Gravetat.GREU);
        System.out.println("Ara l'hi fiquem la cirugia");
        Cirugia cig = new Cirugia("Cosa");
        cig.assignar(quimHospital);
        cig.realitzar(quimHospital);
        System.out.println(quimHospital.getGravetat());

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        PacientHospitalitzat claudiaH = new PacientHospitalitzat("Claudia", 2000.20, 34, Gravetat.MODERARA);


        // el try-catch té dues parts
        try {
            // intentem fer el codi en el try
            Trasplantament traspMedula = claudiaH.solicitarTrasplantament(quimHospital, Organs.MEDULA);
            // printem l'objecteper veure si es crea
            System.out.println("Hem trobat donant! Codi de trasplantament " + traspMedula);
            // si salta una excepció al fer el codi que hi ha dintre del try, anirà a
            // executar aquest codi, en comptes d'acabar el programa
        } catch (Exception e) {
            // Escrivim el missatge de l’excepció. El missatge és la String que hem posat en
            // el constructor de l’excepció
            e.printStackTrace();
            //el finally s'executa sempre, tant si ha saltat l'excepció com si no
        } finally {
            System.out.println(claudia.getNom() + " segueix hospitalitzada");
        }

    }

//   static public PacientHospitalitzat hospitalitzat(Pacient p, String tractament){
//        if(!(p instanceof PacientHospitalitzat)){
//            PacientHospitalitzat pH = new PacientHospitalitzat(p.getNom(), p.getDiners(), p.getEdat(), p.getGravetat());
//            pH.setTractamentActual(tractament);
//            return pH;
//        } else {
//            System.out.println("Aquest pacient ja està hospitalitzat");
//            return (PacientHospitalitzat) p;
//        }
//    }
}
