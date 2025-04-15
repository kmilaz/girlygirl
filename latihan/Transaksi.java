package latihan;

public class Transaksi {
    static void jumlahBukuPerJenis(Buku[] arrBuku){
        int jobsheet=0;
        int bukuAjar=0;
        for (Buku buku : arrBuku) {
            if (buku.jenisBuku.equalsIgnoreCase("Jobsheet")) {
                jobsheet++;
            } else {
                bukuAjar++;
            }
        }
        System.out.println("\n===== Jumlah Buku per Jenis =====");
        System.out.println("Jobsheet   : " + jobsheet);
        System.out.println("Buku Ajar  : " + bukuAjar);
    }
}