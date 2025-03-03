package Minecraft;

import java.util.ArrayList;

public class Inventari extends ArrayList<Item> {

    @Override

    public boolean add(Item item){
        int contP = 0;
        int contC = 0;
        for(int i = 0; i < super.size(); i++){
            if(super.get(i) instanceof Pocions){
                contP++;
            } else if (super.get(i) instanceof Components){
                contC++;
            }
        }
        if(item instanceof Pocions && contP < 3){
            super.add(item);
            return true;
        } else if(item instanceof Components && contC < 5) {
            return true;
        } else {
            return false;
        }
    }


}
