package ch03;

public class perbandingan1 {
    public static void main(String[] args) {
      // Buat variabel
        int x = 5;
        int y = 8;
        int z = 9;
        
        // Bandingkan
        boolean tes1 = x>y;
        boolean tes2 = x<y;
        boolean tes3 = x<z;
        boolean tes4 = y>z;
        
        // Print
        System.out.println("Tes ke 1 = " + tes1);
        System.out.println("Tes ke 2 = " + tes2);   
        System.out.println("Tes ke 3 = " + tes3);
        System.out.println("Tes ke 4 = " + tes4);   
    }
}
