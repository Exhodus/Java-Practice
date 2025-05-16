package OverCooked3;

public class SalsaExtra extends PlatDecorator{
    public SalsaExtra(Plat platDecorat) {
        super(platDecorat);
    }

    // modifica descripció
    @Override
    public String getNom() {
        return platDecorat.getNom()+" amb salsa extra";
    }

    // afegeix 1 segon extra
    @Override
    public double getTempsPreparacio() {
        return platDecorat.getTempsPreparacio()+1.0;
    }

    // afegeix 1.5 euros extra
    @Override
    public double getCost() {
        return platDecorat.getCost()+1.5;
    }
}
