import java.util.Scanner;

public class SewaMobilLat4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int biayaSewa = 300000; // Biaya sewa per hari
            int biayaSupir = 200000; // Biaya supir per hari
            int biayaBahanBakar = 1000; // biaya bahan bakar per km
            int hariSewa;
            double jarakTempuh;
        
            System.out.print("Masukkan jumlah hari sewa: ");
            hariSewa = scanner.nextInt();
            System.out.print("Masukkan jarak tempuh (dalam km): ");
            jarakTempuh = scanner.nextDouble();
            System.out.println("Masukkan Jenis Bahan Bakar (Pertalite / Pertamax) : ");
            String jenisBahanBakar = scanner.next();
            if (jenisBahanBakar.equalsIgnoreCase("Pertalite")) {
                biayaBahanBakar = 1000; // biaya bahan bakar per km untuk Pertalite
            } else if (jenisBahanBakar.equalsIgnoreCase("Pertamax")) {
                biayaBahanBakar = 1300; // biaya bahan bakar per km untuk Pertamax
            } else {
                System.out.println("Jenis bahan bakar tidak dikenali. Menggunakan biaya default (Pertalite).");
            }

            if (hariSewa > 30) {
                System.out.println("Lama sewa maksimal 30 hari");
            } else {
                double totalBiayaSewa = hariSewa * biayaSewa;
                double totalBiayaSupir = hariSewa * biayaSupir;
                double totalBiayaBahanBakar = jarakTempuh * biayaBahanBakar;
                double totalBiaya = totalBiayaSewa + totalBiayaSupir + totalBiayaBahanBakar;

                double diskon = 0;
                if (totalBiaya > 2000000) {
                    diskon = totalBiaya * 0.05; // diskon 5%
                    totalBiaya -= diskon;
                    System.out.println("Diskon 5%: Rp " + (double)diskon);
                }

                System.out.println("Total biaya sewa mobil: Rp " + (double)totalBiaya);
            }
        scanner.close();
    }
}