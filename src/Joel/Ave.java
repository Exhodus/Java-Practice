package Joel;

import java.util.Scanner;

public class Ave {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tren = scan.nextInt();
        int sumaEsquerra = 0,sumaDreta = 0,sumaTotEsq = 0,sumaTotDreta = 0;
        int llocs, velocitat = 300, suma50 = 0, suma100 = 0;

        for(int i = 0; i < tren; i ++){
            llocs = scan.nextInt();

            for(int j = 0; j < llocs; j++){
                sumaEsquerra += scan.nextInt();
                sumaDreta += scan.nextInt();
            }

//            sumaTotEsq += sumaEsquerra;
//            sumaTotDreta += sumaDreta;

            if(sumaEsquerra > sumaDreta){
                if(sumaEsquerra - sumaDreta >= 100){
                    sumaEsquerra -= sumaDreta;
                    sumaEsquerra /= 100;
                    velocitat -= sumaEsquerra*5;
                } else if(sumaEsquerra - sumaDreta >= 50) {
                    sumaEsquerra -= sumaDreta;
                    sumaEsquerra /= 50;
                    velocitat -= sumaEsquerra * 2;
                }
            } else {
                if(sumaDreta - sumaEsquerra >= 100){
                    sumaDreta -= sumaEsquerra;
                    sumaDreta /= 100;
                    velocitat -= sumaDreta*5;
                } else {
                    if(sumaDreta - sumaEsquerra >= 50){
                        sumaDreta -= sumaEsquerra;
                        sumaDreta /= 50;
                        velocitat -= sumaDreta*2;
                    }
                }
            }

            System.out.println(velocitat);

            sumaEsquerra = 0;
            sumaDreta = 0;
            velocitat = 300;
        }

//        if(sumaTotDreta > sumaTotEsq){
//            sumaTotDreta -= sumaTotEsq;
//            if( sumaTotDreta >= 100){
//                sumaTotDreta /= 100;
//                velocitat -= sumaTotDreta*5;
//            }
//        } else {
//            sumaTotEsq -= sumaTotDreta;
//            if(sumaTotEsq >= 100){
//                sumaTotEsq /= 100;
//                velocitat -= sumaTotEsq * 5;
//            }
//        }



    }
}
