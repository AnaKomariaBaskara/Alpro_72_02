package ch03;

import java.util.Scanner;

public class pembagi {
    public static void main(String[] args) {
        int angka1 = 3;
        int angka2 = 3;
        int hasil;
        
        Scanner keyboard = new Scanner (System.in);
        
        // Pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil = " + hasil);
        
        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();
    }
}