package EjerciciosGPT;

public class CalculoSuma1To100 {
    public static void main(String[] args) {

        int num = 1,sum = 0;
        while (num <= 100){
            sum += num;
            num++;
        }

        System.out.println(sum);
    }
}
