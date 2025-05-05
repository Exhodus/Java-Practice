package Joel.PilasCuas;

import java.util.Scanner;
import java.util.Stack;

public class LISP2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < casos; i++){
            String entrada = scan.nextLine();
            String[] sep = entrada.split("");
            Stack<String> pila = new Stack<>();

            for(int j = 0; j < sep.length; j++){
                switch (sep[j]){
                    case ")":
                        if(!pila.isEmpty() && pila.peek().equals("(")){
                            pila.pop();
                        }
                        break;
                    case "}":
                        if(!pila.isEmpty() && pila.peek().equals("{")){
                            pila.pop();
                        }
                        break;
                    case "]":
                        if(!pila.isEmpty() && pila.peek().equals("[")){
                            pila.pop();
                        }
                        break;
                    case ">":
                        if(!pila.isEmpty() && pila.peek().equals("<")){
                            pila.pop();
                        }
                        break;
                    default:
                        pila.push(sep[j]);
                }
            }

            if(!pila.isEmpty()){
                System.out.println("no");
            } else {
                System.out.println("si");
            }
        }
    }
}
