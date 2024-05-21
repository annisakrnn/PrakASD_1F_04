import java.util.Scanner;

public class Filmmain {
    
        public static void menu(){
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("  Data Film Layar Lebar  ");
            System.out.println("+++++++++++++++++++++++++");
            System.out.println(" 1. Tambah Data Awal\n 2. Tambah Data Akhir\n 3. Tambah Data Index Tertentu\n 4. Hapus Data Pertama\n 5. Hapus Data Terakhir\n 6. Hapus Data Tertentu\n 7. Cetak\n 8. Cari ID Film\n 9. Urut Data Rating Film DESC\n 10. Keluar\n");
            System.out.println("-----------------------------------");
        }
    
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            Scanner sd = new Scanner(System.in);
            Scanner se = new Scanner(System.in);

            film fl = new film();
            int pilih;

            do{
                menu();
                pilih = sc.nextInt();
                sc.nextLine();
    
                switch(pilih){
                    case 1:
                        System.out.println("Masukkan Data Film Posisi Awal");
                        System.out.print("ID Film\t\t: ");
                        int id = sd.nextInt();
                        System.out.print("Judul Film\t: ");
                        String judulFilm = sc.nextLine();
                        System.out.print("Rating\t\t: ");
                        double rating = se.nextDouble();
                        fl.addFirst(id, judulFilm, rating);
                        sc.nextLine();
                    break;
                
                    case 2:
                        System.out.println("Masukkan Data Film Posisi Akhir");
                        System.out.print("ID Film\t\t: ");
                        int idD = sd.nextInt();
                        System.out.print("Judul Film\t: ");
                        String judulFilmM = sc.nextLine();
                        System.out.print("Rating\t\t: ");
                        double ratingG = se.nextDouble();
                        fl.addLast(idD, judulFilmM, ratingG);
                        sc.nextLine();
                    break;
                
                    case 3:
                        System.out.println("Masukkan Data Film Posisi yang diinginkan");
                        System.out.print("Urutan ke - ");
                        int idx = sd.nextInt();
                        System.out.print("ID Film\t\t: ");
                        int idDD = sd.nextInt();
                        System.out.print("Judul Film\t: ");
                        String judulFilmMM = sc.nextLine();
                        System.out.print("Rating\t\t: ");
                        double ratingGG = se.nextDouble();
                        fl.add(idDD, judulFilmMM, ratingGG, idx);
                        sc.nextLine();
                        break;
                
                    case 4:
                        fl.removeFirst();
                        fl.print();
                    break;
                
                    case 5:
                        fl.removeLast();
                        fl.print();
                    break;
                
                    case 6:
                        System.out.println("hapus Data Film Posisi yang diinginkan");
                        System.out.print("Urutan ke - ");
                        int index = sc.nextInt();
                        fl.remove(index);
                        fl.print();
                    break;
                
                    case 7:
                        fl.print();
                    break;
                
                    case 8:
                        System.out.println("Cari ID Film Yang ingin dicari");
                        System.out.print("Masukkan ID\t: ");
                        int cari = sc.nextInt();
                        int idF = fl.findSeqSearch(cari);
                        fl.tampilPosisi(cari, idF);
                    break;
                
                    case 9:
                        System.out.println("Data Akan diurut secara DESC");
                        fl.sort();
                    break;
                
                    case 10:
                        System.exit(0);
                    break;
                } 
            }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9 || pilih == 10);
        }
    }

