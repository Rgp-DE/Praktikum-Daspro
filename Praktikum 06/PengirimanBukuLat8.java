import java.util.Scanner;

public class PengirimanBukuLat8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int biayaJilidPerBuku = 20000; 
            int beratCover = 250; // dalam gram
            int beratPacking = 300; // dalam gram
            int biayaCetakPerHalaman = 200; // biaya cetak per halaman
            int beratKertasPerHalaman = 3; // dalam gram
            int jumlahHalaman, jumlahBuku;
            System.out.print("Masukkan jenis cover (Hard/Soft): ");
            String jenisCover = scanner.next();
            if (jenisCover.equalsIgnoreCase("Hard") || jenisCover.equalsIgnoreCase("Hardcover") || jenisCover.equalsIgnoreCase("Hard Cover")) {
                biayaJilidPerBuku = 20000;
                beratCover = 250;
            } else if (jenisCover.equalsIgnoreCase("Soft") || jenisCover.equalsIgnoreCase("Softcover") || jenisCover.equalsIgnoreCase("Soft Cover")) {
                biayaJilidPerBuku = 10000;
                beratCover = 100;
            } else {
                System.out.println("Jenis cover tidak dikenali. Menggunakan soft cover sebagai default.");
                biayaJilidPerBuku = 10000;
                beratCover = 100;
            }
        // Proses Input
            System.out.print("Masukkan Jumlah Halaman: ");
            jumlahHalaman = scanner.nextInt();
            System.out.print("Masukkan Jumlah Buku: ");
            jumlahBuku = scanner.nextInt();

            int biayaCetakPerBuku = jumlahHalaman * biayaCetakPerHalaman;
            int totalBiayaPerBuku = biayaCetakPerBuku + biayaJilidPerBuku;
            int totalBiayaSemuaBuku = totalBiayaPerBuku * jumlahBuku;

            // Berat Buku
            int totalLembarPerBuku = jumlahHalaman /2; // karena 1 lembar ada 2 halaman
            int beratKertasperBuku = totalLembarPerBuku * beratKertasPerHalaman;
            int totalBeratPerBuku = beratKertasperBuku + beratCover + beratPacking;
            int totalBeratSemuaBuku = totalBeratPerBuku * jumlahBuku; // dalam gram

            // Konversi gram ke kg
            double beratDalamKg = Math.ceil(totalBeratSemuaBuku / 1000.0);

            // Biaya Pengiriman
            double biayaPengiriman = beratDalamKg * 15000; // Rp 15.000 per kg

            // Total Biaya
            double totalBiaya = totalBiayaSemuaBuku + biayaPengiriman;


            System.out.println("Total Biaya Pengiriman Buku: Rp " + totalBiaya);         
        scanner.close();
    }
}