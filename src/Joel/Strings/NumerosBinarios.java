package Joel.Strings;

import java.util.Scanner;

public class NumerosBinarios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        String op,result = "";
        int num1,num2,total;


        for(int i = 0; i < casos;i++){
            scan.nextLine();
            op = scan.nextLine();
            String[] calcul = op.split(" ");
            num1 = Integer.parseInt(calcul[0]);
            num2 = Integer.parseInt(calcul[2]);
            if(calcul[1].equals("+")){
                total = num1+num2;
            } else {
                total = num1-num2;
            }

            for(int j = total; j >= 0; j = j/2){
                if(j%2 == 0){
                    result += "0";
                } else {
                    result += "1";
                }
            }

            System.out.println(result);
            result = "";
            total = 0;
        }
    }
}
