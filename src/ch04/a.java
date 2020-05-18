package ch04;

import java.util.Arrays;

public class a {

    public static void main(String[] args) {
        // 1. Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // 2. Perhatikan Algoritma - Algoritma berikut ini

        // a. Menampilkan semua nilai didalam Array tersebut diatas
        System.out.println(Arrays.toString(arrayAngka));

        // atau
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.print(arrayAngka[i] + ", ");
        }
    }
}
