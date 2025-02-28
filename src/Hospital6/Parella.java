package Hospital6;

public class Parella<T> {
    private T primer;
    private T segon;

    public Parella(T primer,T segon){
        this.primer = primer;
        this.segon = segon;
    }

    public T getPrimer(){
        return primer;
    }

    public T getSegon(){
        return segon;
    }

    public void setPrimer(T primer) {
        this.primer = primer;
    }

    public void setSegon(T segon) {
        this.segon = segon;
    }
}
