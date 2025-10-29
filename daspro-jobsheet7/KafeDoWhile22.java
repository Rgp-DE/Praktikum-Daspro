import java.util.Scanner;

public class KafeDoWhile22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine().trim();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. Keluar dari program.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();

            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();

            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            // consume newline setelah nextInt
            sc.nextLine();

            int total = kopi * hargaKopi + teh * hargaTeh + roti * hargaRoti;
            System.out.println("Nama Pelanggan : " + namaPelanggan);
            System.out.println("Total Harga     : Rp " + total);
            System.out.println(); // pemisah sebelum transaksi berikutnya
        } while (true);

        sc.close();
    }
}