package Hospital6;

public class TractamentFactory {
    public Object crearTractament(String tipus) {
        if (tipus == null || tipus.isEmpty()) {
            return null;
        }
        switch (tipus) {
            case "ANTIBIOTIC":
                return new Medicament("Amoxicilina", tipusMedicament.ANTIBIOTIC);
            case "FISIO":
                return new Terapia("Rehabilitació", tipusTerapia.FISIO);
            case "CIRURGIA":
                return new Cirugia("Intervenció quirúrgica");
            default:
                throw new IllegalArgumentException("Tipus de tractament desconegut " + tipus);
        }

    }
}
