package Minecraft;

import java.util.ArrayList;

public class Jugable extends Personatge {
    Inventari equip;
    int esmeraldes;

    //Construcotrs
    public Jugable(String nom, int hpMax, int esmeraldes, Inventari inventari){
        super(nom,hpMax);
        this.esmeraldes = esmeraldes;
        this.equip = inventari;
    }

    //Mètodes
    @Override
    public String toString() {
        return "Jugable{ " +
                "nom = '" + nom + '\'' +
                ", esmeraldes = " + esmeraldes +
                ", viu = " + viu + '\''+
                ", hp = "+this.getHp()+'\''+
                ", hp Màxima = "+this.getHpMax()+'\''+
                '}';
    }

    public int comprar(Comerciant c) throws Exception{
        if(c.viu){
            if(c.preu <= this.esmeraldes){
                if(c.quantitat > 0) {
                    this.equip.add(c.producte);
                    this.esmeraldes -= c.preu;
                    c.quantitat -= 1;
                    return this.esmeraldes;
                }
            } else {
                throw  new EtsPobreException("Error. No tens suficients esmeraldes.");
            }
        } else {
            throw  new EtsPobreException("El comerciant es mort.");
        }
        return this.esmeraldes;
    }

    public int vendre(int index, Comerciant c) throws Exception{
        if(c.viu){
            this.esmeraldes += c.preu;
            this.equip.remove(index);
            return this.esmeraldes;
        } else {
            throw  new EtsPobreException("El comerciant es mort.");
        }
    }

    public void utilitzar(Pocions p){
        if(p.tipus.equals(tipusPocio.CONSUMIBLE)){
            this.setHpUp(p.poder, this.getHpMax());
        }
    }

}
