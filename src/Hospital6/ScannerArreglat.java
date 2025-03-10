package Hospital6;

import java.util.Scanner;

public class ScannerArreglat {
    Scanner sc;
    boolean hemFetUnNextInt;

    public ScannerArreglat(){
        sc = new Scanner(System.in);
        hemFetUnNextInt = false;
    }



    public String nextLine() {
        String s;
        if(hemFetUnNextInt) {
            s = sc.nextLine();
            if(s.trim().equals("")) {
                s = sc.nextLine();
            }
        }else {
            s = sc.nextLine();
        }
        hemFetUnNextInt = false;
        return s;

    }

    public int nextInt() {
        int res = sc.nextInt();
        hemFetUnNextInt = true;
        return res;
    }


    public double nextDouble() {
        double res = sc.nextDouble();
        hemFetUnNextInt = true;
        return res;
    }

}
