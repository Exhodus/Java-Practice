package Joel.Llistes;

import javax.management.MBeanRegistration;
import java.util.ArrayList;
import java.util.Scanner;

public class ShitListed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        ArrayList<String> activitat = new ArrayList<>();
        int miradas, shitlist = 0;

        for (int i = 0; i < casos; i++){

            scan.nextLine();
            for(int j = 0; j < 6; j++){
                activitat.add(scan.next());
            }

            miradas = scan.nextInt();
            int[] hores = new int[miradas];

            for (int j = 0; j < hores.length; j++){
                hores[j] = scan.nextInt();
            }

            for (int j = 0; j < hores.length; j++){
                switch (hores[j]){
                    case 15:
                        if(!activitat.get(0).equals("Eclipse")){
                            if(activitat.get(0).equals("LoL")){
                                shitlist += 2;
                            } else if (!activitat.get(0).equals("HollowKnight") && !activitat.get(0).equals("DarkSouls")
                            && !activitat.get(0).equals("Zelda")){
                                shitlist += 1;
                            }
                        }
                        break;
                    case 16:
                        if(!activitat.get(1).equals("Eclipse")){
                            if(activitat.get(1).equals("LoL")){
                                shitlist += 2;
                            } else if (!activitat.get(1).equals("HollowKnight") && !activitat.get(1).equals("DarkSouls")
                                    && !activitat.get(1).equals("Zelda")){
                                shitlist += 1;
                            }
                        }
                        break;
                    case 17:
                        if(!activitat.get(2).equals("Eclipse")){
                            if(activitat.get(2).equals("LoL")){
                                shitlist += 2;
                            } else if (!activitat.get(2).equals("HollowKnight") && !activitat.get(2).equals("DarkSouls")
                                    && !activitat.get(2).equals("Zelda")){
                                shitlist += 1;
                            }
                        }
                        break;
                    case 18:
                        if(!activitat.get(3).equals("Eclipse")){
                            if(activitat.get(3).equals("LoL")){
                                shitlist += 2;
                            } else if (!activitat.get(3).equals("HollowKnight") && !activitat.get(3).equals("DarkSouls")
                                    && !activitat.get(3).equals("Zelda")){
                                shitlist += 1;
                            }
                        }
                        break;
                    case 19:
                        if(!activitat.get(4).equals("Eclipse")){
                            if(activitat.get(4).equals("LoL")){
                                shitlist += 2;
                            } else if (!activitat.get(4).equals("HollowKnight") && !activitat.get(4).equals("DarkSouls")
                                    && !activitat.get(4).equals("Zelda")){
                                shitlist += 1;
                            }
                        }
                        break;
                    case 20:
                        if(!activitat.get(5).equals("Eclipse")){
                            if(activitat.get(5).equals("LoL")){
                                shitlist += 2;
                            } else if (!activitat.get(5).equals("HollowKnight") && !activitat.get(5).equals("DarkSouls")
                                    && !activitat.get(5).equals("Zelda")){
                                shitlist += 1;
                            }
                        }
                        break;
                }
            }

            System.out.println("Nivell de Shitlist: "+shitlist);
            shitlist = 0;
            activitat.clear();
        }
    }
}
