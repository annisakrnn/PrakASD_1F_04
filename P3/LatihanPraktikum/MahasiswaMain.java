package LatihanPraktikum;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa04[] mahasiswaArray = new Mahasiswa04[3];
        double totalIPK = 0;
        double maxIPK = 0;
        int indexMaxIPK = 0;
        String nama, nim, jenisKelamin;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswaArray[i] = new Mahasiswa04(nama, nim, jenisKelamin, ipk);
            totalIPK += ipk;

        
            if (ipk > maxIPK) {
                maxIPK = ipk;
                indexMaxIPK = i;
            }
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            mahasiswaArray[i].infoMahasiswa(i);
        }

        double rata2 = totalIPK / 3;
        System.out.println("Rata-rata IPK: " + rata2);

        System.out.println("Mahasiswa dengan IPK tertinggi:");
        mahasiswaArray[indexMaxIPK].infoMahasiswa(indexMaxIPK);
    }
}
