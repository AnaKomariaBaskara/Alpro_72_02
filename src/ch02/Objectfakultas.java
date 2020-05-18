package ch02;

public class Objectfakultas {
    public static void main(String[] args) {
        fakultas fk1 = new fakultas();
        fakultas fk2 = new fakultas();
        
        fk1.nama = "Sains dan Teknologi";
        fk1.jumlahMahasiswa = 2354;
        
        fk2.nama = "Psikologi";
        fk2.jumlahMahasiswa = 1202;
        
        System.out.println("fakultas " + fk1.getNama() + " : " + fk1.getJumlahMahasiswa());
        System.out.println("fakultas " + fk2.getNama() + " : " + fk2.getJumlahMahasiswa());
    }
}
