package Lliga2425;

import java.util.Scanner;

public class NouBarris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String barri = scan.nextLine();

        switch (barri){
            case "Ciutat Meridiana":
            case "Torre Baro":
            case "Vallbona":
            case "Trinitat Nova":
            case "Prosperitat":
            case "Roquetes":
            case "Verdum":
            case "Guineueta":
            case "Canyelles":
            case "La Trinitat Vella":
                System.out.println("SI");
                break;
            default:
                System.out.println("NO");
        }
    }
}
