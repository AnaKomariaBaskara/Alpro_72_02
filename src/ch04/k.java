package ch04;

import java.util.Arrays;

public class k {
    public static void main(String[] args) {
            // 1. Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // 2. Perhatikan Algoritma - Algoritma berikut ini

        // k. menampilkan angka-angka setelahnya bernilai bernilai besar
        
        System.out.println("Menampilkan Angka-Angka yang setelahnya bernilai lebih besar");
        System.out.println("-------------------------------");
        for (int i = 1; i < arrayAngka.length; i++){
            if ( arrayAngka[i] > arrayAngka[i-1]){
                System.out.println(arrayAngka[i-1]);
            }
        }
    }
}
