import java.util.Scanner;

public class ArrayKasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar menu yang tersedia
        String[] daftarMenu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        // Harga masing-masing menu (indeks sama dengan daftarMenu)
        double[] daftarHarga = {
            20000, 22000, 15000,
            17000, 13000, 18000, 20000
        };

        // Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); // buang newline

        // Array untuk menyimpan jumlah pesanan tiap menu
        int[] daftarPesanan = new int[daftarMenu.length];

        // Input pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama menu: ");
            String namaMenu = sc.nextLine();

            // Linear search untuk mencari menu
            int indexMenu = -1;
            for (int j = 0; j < daftarMenu.length; j++) {
                if (daftarMenu[j].equalsIgnoreCase(namaMenu)) {
                    indexMenu = j;
                    break;
                }
            }

            if (indexMenu == -1) {
                System.out.println("Menu tidak ditemukan!");
                i--; // ulangi input pesanan ini
                continue;
            }

            // Jika menu ditemukan → input jumlah item
            System.out.print("Masukkan jumlah item: ");
            int jumlahItem = sc.nextInt();
            sc.nextLine(); // buang newline

            // Simpan pada array daftarPesanan (indeks sama dengan menu)
            daftarPesanan[indexMenu] += jumlahItem;
        }

        // Hitung total pembayaran
        double totalBayar = 0;
        System.out.println("\n===== DAFTAR PESANAN =====");
        for (int i = 0; i < daftarPesanan.length; i++) {
            if (daftarPesanan[i] > 0) {
                double subtotal = daftarPesanan[i] * daftarHarga[i];
                totalBayar += subtotal;
                System.out.println(daftarMenu[i] + " x " + daftarPesanan[i] + 
                                   " = Rp" + subtotal);
            }
        }

        // Tampilkan total harga
        System.out.println("\nTotal yang harus dibayar: Rp" + totalBayar);
        System.out.println("==========================");
    }
}
