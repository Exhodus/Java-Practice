package Hospital6;

import java.util.ArrayList;

public class ArrayListAcotada <T> extends ArrayList<T> {

    @Override
    public T get(int index){
        if(index > super.size()){
            return super.get(super.size()-1);
        } else if( index < 0){
            return super.get(0);
        } else {
            index = index % super.size();
            return super.get(index);
        }
    }
}
