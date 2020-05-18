package ch04;

import java.util.Arrays;

public class h {
    public static void main(String[] args) {
        // 1. Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // 2. Perhatikan Algoritma - Algoritma berikut ini

        // h. menghitung jumlah angka di dalam Array
        System.out.println("panjang Array = " + arrayAngka.length);
        
         int jml = 0;

        for (int i = 0; i < arrayAngka.length; i++){
            jml = jml + arrayAngka[i];
        }

        System.out.println("Hasil Jumlah Angka = " + jml);
    }
}
