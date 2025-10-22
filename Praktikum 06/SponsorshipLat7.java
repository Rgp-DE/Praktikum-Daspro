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
        int biayaPendafatranTotal = biayaPendaftaran * jumlahTim;
        int totalBiaya = biayaPublikasi + biayaDekorasi + konsumPanitJuri + Hadiah + biayaLain + konsumPeserta
                + honorJuri;
        double danaDitutupPolinema = totalBiaya * danaPolinema;
        double danaSubsidi = totalBiaya - danaDitutupPolinema;
        double danaSponsorship = danaSubsidi - biayaPendafatranTotal;

        System.out.println("Dana Sponsorship yang Diperlukan: Rp " + danaSponsorship);
        System.out.println("Total Biaya Acara: Rp " + totalBiaya);


        scanner.close();
    }
}