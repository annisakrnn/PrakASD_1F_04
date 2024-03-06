package LatihanPraktikum;

public class Mahasiswa04 {
    String nama;
    String nim;
    String jenisKelamin;
    double ipk;
    double totalIPk;
    double maxIPK;

    public Mahasiswa04(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public void infoMahasiswa(int index) {
        System.out.println("Data Mahasiswa ke-" + (index + 1));
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Nilai IPK : " + ipk);
        System.out.println();
    }
}