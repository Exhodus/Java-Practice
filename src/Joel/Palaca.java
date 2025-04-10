package Joel;

import java.util.ArrayList;
import java.util.Scanner;

public class Palaca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        int ca, dmg;
        for(int i = 0; i < casos; i++) {
            ca = scan.nextInt();
            scan.nextLine();
            String[] daus = scan.nextLine().split(" \\+ ");
            int mod = Integer.parseInt(daus[1]);
            String[] sep = daus[0].split("d");
            int qd = Integer.parseInt(sep[0]);
            int td = Integer.parseInt(sep[1]);
            dmg = scan.nextInt();

            int totalPossibleDamage = (qd * td) + mod;
            int minPossibleDamage = qd + mod;

            if (qd != 0) {
                if (ca > 0) {
                    if (dmg > totalPossibleDamage) {
                        if (dmg % 2 == 0) {
                            if ((dmg / 2) <= totalPossibleDamage && (dmg / 2) >= minPossibleDamage) {
                                System.out.println("SI");
                            } else {
                                System.out.println("NO");
                            }
                        } else {
                            System.out.println("NO");
                        }
                    } else if (dmg < minPossibleDamage) {
                        if (dmg == 0) {
                            System.out.println("SI");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        System.out.println("SI");
                    }
                } else if (ca >= 20) {
                    minPossibleDamage *= 2;
                    totalPossibleDamage *= 2;
                    if( dmg == 0){
                        System.out.println("SI");
                    } else if(dmg % 2 == 0){
                        if((dmg / 2) <= totalPossibleDamage && (dmg/2) >= minPossibleDamage){
                            System.out.println("SI");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        System.out.println("NO");
                    }

                }else if (ca == 0){
                    if (dmg > totalPossibleDamage) {
                        if (dmg % 2 == 0) {
                            if ((dmg / 2) <= totalPossibleDamage && (dmg / 2) >= minPossibleDamage) {
                                System.out.println("SI");
                            } else {
                                System.out.println("NO");
                            }
                        } else {
                            System.out.println("NO");
                        }

                    } else if (dmg >= minPossibleDamage) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                }
            }else {
                System.out.println("NO");
            }
        }
    }
}
