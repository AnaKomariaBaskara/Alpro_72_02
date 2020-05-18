package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 1. Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // 2. Perhatikan Algoritma - Algoritma berikut ini

        // b. Mencari sebuah angka di dalam Array tersebut
        System.out.print("Masukkan nilai yang ingin dicari =");
        int input = scanner.nextInt();

        Arrays.sort(arrayAngka);
        System.out.println(Arrays.toString(arrayAngka));
        int hasil = Arrays.binarySearch(arrayAngka,input);

        if (hasil < 0) {
            System.out.println("Maaf, Nilai yang anda cari tidak ditemukan");
        } else {
            System.out.println("Array dengan nilai " + input + " berada pada indeks ke-"+ hasil);
        }
    }
}
