import java.util.Scanner;

public class Kafe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Andi", true, "DISKON50");

        System.out.println("Masukkan nomor menu yang ingin Anda pesan:");
        int pilihanMenu = sc.nextInt();

        System.out.println("Masukkan jumlah item yang ingin dipesan:");
        int banyakItem = sc.nextInt();

        String kodePromo = "DISKON50"; // Contoh kode promo

        int totalHarga = hitungTotalHarga21(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga yang harus dibayar: Rp. " + totalHarga);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("======= Menu Resto Kafe ========");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappuccino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000 ");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("===============================");
    }

    public static int hitungTotalHarga21(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            diskon = hargaTotal * 50 / 100;
            System.out.println("Kode promo valid: Diskon 50% diterapkan.");
        } else if (kodePromo.equals("DISKON30")) {
            diskon = hargaTotal * 30 / 100;
            System.out.println("Kode promo valid: Diskon 30% diterapkan.");
        } else {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }

        return hargaTotal - diskon;
    }
}
