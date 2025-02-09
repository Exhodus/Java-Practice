package EjerciciosGPT.SimonDice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SymonSays {
    static int dificulty = 1;
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> machine = new ArrayList<>();
        Player player = new Player();
        boolean exit = false;
        while (!exit) {
            System.out.println("MENU: ");
            System.out.println("    1. Play");
            System.out.println("    2. Configuration");
            System.out.println("    3. Exit");
            int option = scan.nextInt();
            switch (option){
                case 1:
                    play(player,machine);
                    break;
                case 2:
                    config(player,machine);
                    break;
                case 3:
                    System.out.println("See you soon!");
                    exit = true;
                default:
                    System.out.println("That is not a valid option. Please try again!");
            }
        }
    }

    private static void play(Player player, ArrayList<Integer> machine) {

        machine = new ArrayList<>();
        int numChar = setDificulty();
        initMachine(machine,numChar);
        Collections.shuffle(machine);
        boolean fail = false;
        while (!fail && !machine.isEmpty()) {
            showNum(machine);
            int numPlayer = tryPlayer();
            fail = check(numPlayer,machine);
            if(fail){
                System.out.println("Tough Luck! you didn't make it.");
                player.mistakes++;
            } else {
                System.out.println("Congratulations, you made it!");
                player.victories++;
            }
        }

    }

    private static boolean check(int numPlayer, ArrayList<Integer> machine) {
        //TODO comprobar los 2 numeros.
        ArrayList<Integer> playerNum = new ArrayList<>();
        while (numPlayer > 0){
            playerNum.add(numPlayer%10);
            numPlayer /= 10;
        }
        Collections.reverse(playerNum);
        if(playerNum.size() == machine.size()) {
            for (int i = 0; i < playerNum.size(); i++) {
                if (playerNum.get(i) != machine.get(i)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private static int tryPlayer() {
        System.out.println("Remember the numbers before? Try and write them all!");
        System.out.print("Numbers: ");
        int num = scan.nextInt();
        return num;
    }

    private static void showNum(ArrayList<Integer> machine) {
        int aux = machine.get(0);
        for(int i = 0; i < machine.size(); i++){
            System.out.print(machine.get(i)+" ");
        }
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    private static void initMachine(ArrayList<Integer> machine,int numChar) {
        for(int i = 0; i < numChar; i++){
        machine.add(rand.nextInt(0,10));
        }
    }

    private static int setDificulty() {
        if(dificulty == 1){
            return 6;
        } else if (dificulty == 2){
            return 10;
        } else {
            return 15;
        }
    }

    private static void config(Player player, ArrayList<Integer> machine) {
        int optionConfig = 0;
        while (optionConfig != 4) {

            System.out.println("CONFIGURATION");
            System.out.println("  1. Change player's name.");
            System.out.println("  2. Change game's difficulty.");
            System.out.println("  3. Reset Victories and Mistakes.");
            System.out.println("  4. Back to menu.");
            optionConfig = scan.nextInt();
            switch (optionConfig) {
                case 1:
                    changeName(player);
                    break;
                case 2:
                    changeDifficulty();
                    break;
                case 3:
                    resetWL(player);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("That is not a valid option. Please try again!");
            }
        }

    }

    private static void resetWL(Player player) {
        System.out.println("Your current Wins are: "+player.victories);
        System.out.println("Your current Loses are: "+player.mistakes);
        System.out.println("Are you sure you want to reset them? Y/N");
        scan.nextLine();
        String yesNo = scan.nextLine().toLowerCase();
        if(yesNo.equals("y") ){
            player.mistakes = 0;
            player.victories = 0;
        }
    }

    private static void changeDifficulty() {
        System.out.println("Change difficulty: ");
        System.out.println(" 1- medium ");
        System.out.println(" 2- hard ");
        System.out.println(" 3- impossible ");
        dificulty = scan.nextInt();
    }

    private static void changeName(Player player) {
        System.out.println("Your current name is: "+player.name);
        System.out.print("Enter your new name: ");
        scan.nextLine();
        player.name = scan.nextLine();
    }
}
