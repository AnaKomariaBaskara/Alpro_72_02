package ch04;

import java.util.Arrays;

public class e {
    public static void main(String[] args) {
        // 1. Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // 2. Perhatikan Algoritma - Algoritma berikut ini

        // e. Menampilkan angka - angka yang memiliki angka 2 di dalam Array
        
        System.out.print("Yang memiliki angka 2  = [ ");
        for (int i  = 0; i < arrayAngka.length; i++){
            if (arrayAngka[i] % 10 == 2 || arrayAngka[i] / 10 == 2) {
                System.out.print(arrayAngka[i] + " ");
            }
        }
        System.out.print("]");
    }
}
