package latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Buku[] arrBuku = new Buku[6];
        arrBuku[0]= new Buku("Bk01", "Algoritma", "Jobsheet", 2023, 10);
        arrBuku[1]= new Buku("Bk02", "Dasar Pemrograman", "Jobsheet", 2023, 15);
        arrBuku[2]= new Buku("Bk03", "Agama", "Buku Ajar", 2023, 20);
        arrBuku[3]= new Buku("Bk04", "Matematika", "Buku Ajar", 2023, 25);
        arrBuku[4]= new Buku("Bk05", "Basis Data", "Jobsheet", 2023, 30);
        arrBuku[5]= new Buku("Bk06", "Pancasila", "Buku Ajar", 2023, 35);

        Scanner sc = new Scanner(System.in);
        int pilih =0;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Tampil berdasarkan jenis");
            System.out.println("2. Tampil berdasarkan stok");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    Transaksi.jumlahBukuPerJenis(arrBuku);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                case 4: 
                    System.out.println("Testing");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih!=3);
        
    }
}
