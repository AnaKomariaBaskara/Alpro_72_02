package ch04;

import java.util.Arrays;

public class n {
    public static void main(String[] args) {
            // 1. Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // 2. Perhatikan Algoritma - Algoritma berikut ini

        // n. menampilkan jumlah angka-angka di dalam array tersebut di atas dengan seluruh angka-angka sebelumnya
        
        int hasil = 0;

        for (int i = 0; i < arrayAngka.length; i++){
            System.out.print("Hasil jumlah " + arrayAngka[i] + " dengan seluruh angka sebelumnya = ");
            System.out.println(arrayAngka[i] + hasil);
            hasil = hasil + arrayAngka[i];
        }
    }
}
