import java.util.LinkedList;
import java.util.Scanner;

public class ProblemaJoel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> alumnes = new LinkedList<>();
        int entrades = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < entrades; i++){
            alumnes.add(scan.nextLine().toUpperCase());
        }

        for(int i = 0; i < alumnes.size(); i++){
            if(alumnes.get(i).equals("XAVI")){
                if(!alumnes.get(i-1).equals("ADRI") && !alumnes.get(i+1).equals("ADRI")){
                    alumnes.add(i+1,"GRAU");
                }
            }
        }
    }
}
