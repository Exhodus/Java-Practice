package Minecraft;

public class TaulaCrafteig {
    Item comp1;
    Item comp2;
    Item resultat;

    //Constructors
    public TaulaCrafteig(){
        this.comp1 = null;
        this.comp2 = null;
        this.resultat = null;
    }
    //Getters

    public Item getComp1() {
        return this.comp1;
    }

    public Item getComp2() {
        return this.comp2;
    }

    public Item getResultat() {
        return this.resultat;
    }

    //Setters
    //Mètodes

    public boolean afegirComponents(Item c1, Item c2, Item resultat){
         if(c1 instanceof Components){
             if(c2 instanceof Components){
                 if(resultat instanceof Pocions){
                     this.comp1 = c1;
                     this.comp2 = c2;
                     this.resultat = resultat;
                     return true;
                 } else {
                     System.out.println("L'item resultat no és una poció.");
                 }
             } else{
                 System.out.println("L'ítem 2 no és un component.");
             }
         } else {
             System.out.println("L'ítem 1 no és un component.");
         }
         return false;
    }

    public Item craftejar(){
        if(this.comp2 != null && this.comp1 != null && this.resultat != null){
            return this.resultat;
        } else {
            return  null;
        }
    }
}
