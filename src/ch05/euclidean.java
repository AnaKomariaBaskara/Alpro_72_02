package ch05;

import java.util.Scanner;

public class euclidean {
    public static void main(String[] args) {
        int r, s, t;
        Scanner ras = new Scanner(System.in);
        System.out.print("r : ");
        r = ras.nextInt();
        
        System.out.print("s : ");
        s = ras.nextInt();
        
        t = r % s;
        while (t != 0){
            r = s;
            s = t;
            t = s % t;
        }
        
        System.out.println("FPB = " + s);
    }    
}