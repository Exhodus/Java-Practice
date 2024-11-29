package ExamenLlistas.Bonus;

import java.util.*;

public class BONUS_Spotify_Inacabat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> top10 = new ArrayList<>(Arrays.asList("Flowers", "Last Night", "Anti-Hero", "Rich Flex", "As It Was", "Unholy", "About Damn Time", "Bad Habit", "Me Porto Bonito", "I'm Good (Blue)"));
        ArrayList<String> Marc23 = new ArrayList<>(Arrays.asList("Flowers", "Anti-Hero", "Unholy", "Flowers", "Snap", "Somebody That I Used To Know", "Anti-Hero", "Flowers", "About Damn Time", "Shivers", "As It Was", "Flowers", "Bad Habit", "Snap", "Flowers", "Anti-Hero", "Flowers", "Rich Flex", "Somebody That I Used To Know", "As It Was"));
        ArrayList<String> Noelia55 = new ArrayList<>(Arrays.asList("Last Night", "Snap", "Anti-Hero", "Last Night", "Me Porto Bonito", "Flowers", "Unholy", "Anti-Hero", "Bad Habit", "Flowers", "Somebody That I Used To Know", "Last Night", "Rich Flex", "Snap", "Last Night", "I'm Good (Blue)", "Unholy", "Shivers", "As It Was", "Last Night"));
        ArrayList<String> Alex89 = new ArrayList<>(Arrays.asList("Anti-Hero", "Rich Flex", "Shivers", "About Damn Time", "Snap", "Flowers", "Bad Habit", "As It Was", "Anti-Hero", "Rich Flex", "Somebody That I Used To Know", "Flowers", "Unholy", "Last Night", "Snap", "Me Porto Bonito", "Anti-Hero", "Flowers", "Shivers", "Bad Habit"));
        ArrayList<String> Carmen12 = new ArrayList<>(Arrays.asList("Flowers", "I'm Good (Blue)", "Snap", "About Damn Time", "Somebody That I Used To Know", "Anti-Hero", "Flowers", "Bad Habit", "Shivers", "Last Night", "As It Was", "Flowers", "Rich Flex", "Snap", "Anti-Hero", "Unholy", "Flowers", "Me Porto Bonito", "Shivers", "I'm Good (Blue)"));
        ArrayList<String> Daniel45 = new ArrayList<>(Arrays.asList("As It Was", "Snap", "Flowers", "Last Night", "Somebody That I Used To Know", "Anti-Hero", "Rich Flex", "Flowers", "About Damn Time", "Bad Habit", "Shivers", "Snap", "Unholy", "As It Was", "Me Porto Bonito", "Flowers", "I'm Good (Blue)", "Anti-Hero", "Flowers", "Last Night"));




        System.out.println("Qué voleu fer? ");
        System.out.println("1. Mostra el que escolten els nostres usuaris a part del TOP 10.");
        System.out.println("2. Mostra cuantes vegades els nostres usuaris han reproduït una cançó del TOP 10 \n durant el anterior mes.");
        System.out.println("3. Mostra en una llista totes les cançons escoltades, sense repeticions.");
        System.out.println("4. Mostra l'usuari més Mainstream i el mes Alternatiu!");
        System.out.println("5. Mostra la canço més escoltada pels nostres usuaris.");

        int casos = scan.nextInt();
        int cont = 0;

        switch (casos){
            case 1:
                System.out.println("En Marc23: ");
                Marc23.removeAll(top10);
                System.out.println(Marc23);
                System.out.println();

                System.out.println("La Noelia55: ");
                Noelia55.removeAll(top10);
                System.out.println(Noelia55);
                System.out.println();

                System.out.println("L'Alex89: ");
                Alex89.removeAll(top10);
                System.out.println(Alex89);
                System.out.println();

                System.out.println("La Carmen12: ");
                Carmen12.removeAll(top10);
                System.out.println(Carmen12);
                System.out.println();

                System.out.println("En Daniel45: ");
                Daniel45.removeAll(top10);
                System.out.println(Daniel45);
                break;
            case 2:

                System.out.println("En Marc23: ");
                Marc23.retainAll(top10);
                System.out.println(Marc23.size());
                System.out.println();

                System.out.println("La Noelia55: ");
                Noelia55.retainAll(top10);
                System.out.println(Noelia55.size());
                System.out.println();

                System.out.println("L'Alex89: ");
                Alex89.removeAll(top10);
                System.out.println(Alex89.size());
                System.out.println();

                System.out.println("La Carmen12: ");
                Carmen12.removeAll(top10);
                System.out.println(Carmen12.size());
                System.out.println();

                System.out.println("En Daniel45: ");
                Daniel45.removeAll(top10);
                System.out.println(Daniel45.size());
                break;
            case 3:
                top10.addAll(Marc23);
                top10.addAll(Noelia55);
                top10.addAll(Alex89);
                top10.addAll(Carmen12);
                top10.addAll(Daniel45);

                HashSet <String> filtrat = new HashSet<>();

                filtrat.addAll(top10);

                TreeSet<String> ordenat = new TreeSet<>();

                ordenat.addAll(filtrat);

                System.out.println(ordenat);
                break;
            case 4:
                Marc23.retainAll(top10);
                Noelia55.retainAll(top10);
                Daniel45.retainAll(top10);
                Alex89.retainAll(top10);
                Carmen12.retainAll(top10);


                break;
            case 5:
        }

    }
}
