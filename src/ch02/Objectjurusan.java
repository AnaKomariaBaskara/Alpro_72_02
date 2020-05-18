package ch02;


public class Objectjurusan {
    public static void main(String[] args) {
        jurusan j1 = new jurusan();
        jurusan j2 = new jurusan();
        jurusan j3 = new jurusan();
        
        j1.nama = "Teknik Informatika";
        j1.akreditasi = "A";
        j1.jumlahMahasiswa = 1200;
        
        j2.nama = "Sistem Informatika";
        j2.akreditasi = "A";
        j2.jumlahMahasiswa = 1090;
        
        j3.nama = "Teknik elektro";
        j3.akreditasi = "A";
        j3.jumlahMahasiswa = 750;
        
        System.out.println("jurusan 1");
        System.out.println("nama : " + j1.getNama());
        System.out.println("akreditasi : " + j1.getAkreditasi());
        System.out.println("jumlah : " + j1.getJumlahMahasiswa());
        
        System.out.println("jurusan 2");
        System.out.println("nama : " + j2.getNama());
        System.out.println("akreditasi : " + j2.getAkreditasi());
        System.out.println("jumlah : " + j2.getJumlahMahasiswa());
        
        System.out.println("jurusan 3");
        System.out.println("nama : " + j3.getNama());
        System.out.println("akreditasi : " + j3.getAkreditasi());
        System.out.println("jumlah : " + j3.getJumlahMahasiswa());
    }
}
