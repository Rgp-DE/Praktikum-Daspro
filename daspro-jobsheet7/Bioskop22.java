import java.util.Scanner;

public class Bioskop22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;

        double totalTiket = 0;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk mengakhri program): ");
            if (!sc.hasNextInt()) {
                System.out.println("Input tidak valid. Masukkan bilangan bulat.");
                sc.next(); // buang input yang tidak valid
                continue;
            }

            int jumlah = sc.nextInt();

            if (jumlah == 0) {
                break; // selesai input hari ini
            }

            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Coba lagi.");
                continue; // abaikan dan minta input ulang
            }

            double subtotal = (double) jumlah * hargaTiket;
            int diskonPersen = 0;
            if (jumlah > 10) {
                diskonPersen = 15;
            } else if (jumlah > 4) {
                diskonPersen = 10;
            }

            double diskon = subtotal * diskonPersen / 100;
            double totalUntukTransaksi = subtotal - diskon;

            System.out.println("Diskon: " + diskonPersen + "%, Harga setelah diskon: Rp " + String.format("%,.0f", totalUntukTransaksi).replace(',', '.'));

            totalTiket += jumlah;
            totalPenjualan += totalUntukTransaksi;
        }

        System.out.println();
        System.out.println("Total tiket terjual: " + String.format("%,.0f", totalTiket).replace(',', '.'));
        System.out.println("Total penjualan: Rp " + String.format("%,.0f", totalPenjualan).replace(',', '.'));

        sc.close();
    }
}