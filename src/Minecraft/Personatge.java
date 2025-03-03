package Minecraft;

public abstract class Personatge {
    String nom;
    Boolean viu;
    private int hp;
    private int hpMax;

    //Constructors
    public Personatge(String nom, int hpMax) {
        this.nom = nom;
        this.viu = true;
        this.hpMax = hpMax;
        this.hp = hpMax; // Inicialitza hp al valor màxim per defecte
    }

    //Getters
    public int getHp() {
        return hp;
    }



    public int getHpMax() {
        return hpMax;
    }

    //Setters
    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public void setHpUp(int hp,int hpMax) {
        if(this.hp+hp >hpMax){
            this.hp = hpMax;
        } else {
            this.hp += hp;
        }
    }

    public void setHpDown(int hp, int dany){
        this.hp -= dany;
    }

    @Override
    public String toString() {
        return "Personatge{" +
                "hp = " + hp +
                ", nom = '" + nom + '\'' +
                ", hpMax = " + hpMax +
                '}';
    }
}



//Mètodes

