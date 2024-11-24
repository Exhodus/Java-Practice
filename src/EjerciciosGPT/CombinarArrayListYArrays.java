package EjerciciosGPT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombinarArrayListYArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scan.nextInt();
        }

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i]%2 == 0) {
                nums.add(numeros[i]);
            }
        }

        System.out.println(nums);
    }
}
