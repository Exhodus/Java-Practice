package OverCooked3;

public abstract class PlatDecorator implements Plat{
    protected Plat platDecorat;

    public PlatDecorator(Plat plat) {
        if(!plat.getNom().contains("Sashimi") && !plat.getNom().contains("formatge")){
            this.platDecorat = plat;
        } else {
            System.out.println("No es pot ficar Formatge al Sashimi! Terrorista.");
        }

    }
    @Override
    public String getNom() {
        return platDecorat.getNom();
    }
    @Override
    public double getTempsPreparacio() {
        return platDecorat.getTempsPreparacio();
    }
    @Override
    public double getCost() {
        return platDecorat.getCost();
    }


    @Override
    public String  toString() {
        return "platDecorat = " + platDecorat ;
    }
}
