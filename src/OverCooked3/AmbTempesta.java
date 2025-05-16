package OverCooked3;

public class AmbTempesta implements DecoradorAmbient{
    private DecoradorAmbient  ambientDecorat;

    public AmbTempesta(DecoradorAmbient  ambient) {
        this.ambientDecorat = ambient;
    }
    // doble desgast
    @Override
    public double getModificadorDesgastCuiner() {
        return ambientDecorat.getModificadorDesgastCuiner()*2.0;
    }

    // 20% menys paciència
    @Override
    public double getModificadorPacienciaClient() {
        return ambientDecorat.getModificadorPacienciaClient()*0.8;
    }
}
