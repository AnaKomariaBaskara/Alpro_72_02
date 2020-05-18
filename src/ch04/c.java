package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class c {

    private static int[] bil;
    public static void main(String[] args) {
         // 1. Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // 2. Perhatikan Algoritma - Algoritma berikut ini

        // c. menampilkan angka-angka ganjil di dalam array
       System.out.print("Bilangan Ganjil : ");
       for (int i = 0;i < bil.length; i++){
           if (bil [i] % 2!=0){
            System.out.print(bil [i] + "" );
           }
       }
    }
}
