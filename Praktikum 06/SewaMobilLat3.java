import java.util.Scanner;

public class SewaMobilLat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int biayaSewa = 300000; // Biaya sewa per hari
            int biayaSupir = 200000; // Biaya supir per hari
            int biayaBahanBakar = 1000; // biaya bahan bakar per km
            int hariSewa;
            double jarakTempuh;
        // Your code here
            System.out.print("Masukkan jumlah hari sewa: ");
            hariSewa = scanner.nextInt();
            System.out.print("Masukkan jarak tempuh (dalam km): ");
            jarakTempuh = scanner.nextDouble();

            if (hariSewa > 30) {
                System.out.println("Lama sewa maksimal 30 hari");
            } else {
                double totalBiayaSewa = hariSewa * biayaSewa;
                double totalBiayaSupir = hariSewa * biayaSupir;
                double totalBiayaBahanBakar = jarakTempuh * biayaBahanBakar;
                double totalBiaya = totalBiayaSewa + totalBiayaSupir + totalBiayaBahanBakar;

                System.out.println("Total biaya sewa mobil: Rp " + totalBiaya);
            }
        scanner.close();
    }
}