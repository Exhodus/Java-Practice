package Hospital6;

import java.util.Scanner;

public class ScannerArreglat {
    Scanner scan;
    boolean hemFetUnNextInt;

    public ScannerArreglat(){
        scan = new Scanner(System.in);
        hemFetUnNextInt= false;
    }

    public String nextLine(){
        String s;

        if(hemFetUnNextInt){
            s = scan.nextLine();
            if(s.trim().equals("")){
                s = scan.nextLine();
            }
        }else {
            s = scan.nextLine();
        }
        return s;
    }
}
