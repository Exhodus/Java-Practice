package ProgramaMENavidenyo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class yoquese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            sc.nextLine();
            if (n == 0) break;
            Map<String, Integer> infantiles = new HashMap<>();
            Map<String, Integer> adultos = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String voto = sc.next();
                if (voto.equals(voto.toLowerCase())) {
                    infantiles.put(voto, infantiles.getOrDefault(voto, 0) + 1);
                } else if (voto.equals(voto.toUpperCase())) {
                    adultos.put(voto, adultos.getOrDefault(voto, 0) + 1);
                }
            }
            int maxInfantil = 0, maxAdulto = 0;
            String ganadorInfantil = "empate", ganadorAdulto = "EMPATE";
            boolean empateInfantil = false, empateAdulto = false;
            for (Map.Entry<String, Integer> entry : infantiles.entrySet()) {
                if (entry.getValue() > maxInfantil) {
                    maxInfantil = entry.getValue();
                    ganadorInfantil = entry.getKey();
                    empateInfantil = false;
                } else if (entry.getValue() == maxInfantil) {
                    empateInfantil = true;
                }
            }
            for (Map.Entry<String, Integer> entry : adultos.entrySet()) {
                if (entry.getValue() > maxAdulto) {
                    maxAdulto = entry.getValue();
                    ganadorAdulto = entry.getKey();
                    empateAdulto = false;
                } else if (entry.getValue() == maxAdulto) {
                    empateAdulto = true;
                }
            }
            if (empateInfantil) ganadorInfantil = "empate";
            if (empateAdulto) ganadorAdulto = "EMPATE";
            System.out.println(ganadorInfantil + " " + ganadorAdulto);
        }


    }
}
