package ch04;

import java.util.Arrays;

public class l {
    public static void main(String[] args) {
            // 1. Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // 2. Perhatikan Algoritma - Algoritma berikut ini

        // l. menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap di dalam array
        
        int i = 1;

        do{
            if (arrayAngka[i] %2 == 0 && arrayAngka[i-1] %2 == 0){
                System.out.print("Selisih dari " + arrayAngka[i-1] + " dan " + arrayAngka[i] + " = ");
                System.out.println(arrayAngka[i-1] + arrayAngka[i] + " ");
            }
            i++;
        } while(i < arrayAngka.length);
    }
}
