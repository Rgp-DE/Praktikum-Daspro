import java.util.Scanner;

public class Kafe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Andi", true, "DISKON50");

        String kodePromo = "DISKON50"; 
        int totalKeseluruhan = 0;

        while (true) {
            System.out.println("Masukkan nomor menu yang ingin Anda pesan (0 untuk selesai):");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break; // keluar loop jika user selesai memesan
            }

            System.out.println("Masukkan jumlah item:");
            int banyakItem = sc.nextInt();

            int totalPerMenu = hitungTotalHarga21(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalPerMenu;

            System.out.println("Subtotal pesanan ini: Rp. " + totalPerMenu);
            System.out.println("---------------------------------------");
        }

        System.out.println("=======================================");
        System.out.println("Total keseluruhan pesanan: Rp. " + totalKeseluruhan);
        System.out.println("Terima kasih telah memesan!");
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("======= Menu Resto Kafe ========");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappuccino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
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
            System.out.println("Diskon 50% diterapkan untuk pesanan ini.");
        } else if (kodePromo.equals("DISKON30")) {
            diskon = hargaTotal * 30 / 100;
            System.out.println("Diskon 30% diterapkan untuk pesanan ini.");
        }

        return hargaTotal - diskon;
    }
}
