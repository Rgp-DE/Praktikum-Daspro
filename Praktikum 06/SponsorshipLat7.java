import java.util.Scanner;

public class SponsorshipLat7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biayaPublikasi = 300000; // Biaya publikasi
        int biayaDekorasi = 500000; // Biaya dekorasi
        int konsumPanitJuri = 500000; // Biaya konsumsi panitia dan juri
        int Hadiah = 4000000;
        int biayaLain = 500000; // Biaya lain-lain
        int biayaPendaftaran = 50000;
        double danaPolinema; 
        int jumlahTim;

        System.out.print("Masukkan jumlah Tim: ");
        jumlahTim = scanner.nextInt();

        System.out.print("Apakah Polinema bersedia memberikan dana bantuan? (ya/tidak): ");
        String jawaban = scanner.next();
        if (jawaban.equalsIgnoreCase("ya") || jawaban.equalsIgnoreCase("y")) {
            System.out.print("Masukkan persentase bantuan (tanpa tanda %, contoh 60 untuk 60%): ");
            double persen = scanner.nextDouble();
            danaPolinema = persen / 100.0;
        } else {
            danaPolinema = 0.0;
        }

        int konsumPeserta = 25000 * 3 * jumlahTim;
        System.out.println("Konsumsi Peserta: Rp " + konsumPeserta);
        int honorJuri = 75000 * jumlahTim;
        int biayaPendaftaranTotal = biayaPendaftaran * jumlahTim;
        int totalBiaya = biayaPublikasi + biayaDekorasi + konsumPanitJuri + Hadiah + biayaLain + konsumPeserta
                + honorJuri;

        double danaDitutupPolinema = totalBiaya * danaPolinema;
        double danaSponsorship;
        if (danaDitutupPolinema >= totalBiaya) {
            System.out.println("Polinema menutup semua biaya. Tidak perlu dana sponsorship.");
            danaSponsorship = 0;
        } else {
            double danaSubsidi = totalBiaya - danaDitutupPolinema;
            danaSponsorship = danaSubsidi - biayaPendaftaranTotal;
            if (danaSponsorship < 0) {
                danaSponsorship = 0;
            }
            System.out.println("Dana Sponsorship yang Dibutuhkan: Rp " + (double) danaSponsorship);
        }

        System.out.println("Dana yang Ditanggung Polinema: Rp " + (double) danaDitutupPolinema);


        scanner.close();
    }
}