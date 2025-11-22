import java.util.Scanner;

public class BioskopwithScanner21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                // Menu 1: Input data penonton
                String nama;
                int baris, kolom;
                boolean inputValid;

                do {
                    inputValid = true;

                    System.out.print("\nMasukkan nama: ");
                    nama = scanner.nextLine();

                    // Input dan validasi baris
                    do {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = scanner.nextInt();
                        scanner.nextLine();

                        if (baris < 1 || baris > 4) {
                            System.out.println("Baris tidak tersedia! Silakan pilih baris 1-4.");
                        }
                    } while (baris < 1 || baris > 4);

                    // Input dan validasi kolom
                    do {
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = scanner.nextInt();
                        scanner.nextLine();

                        if (kolom < 1 || kolom > 2) {
                            System.out.println("Kolom tidak tersedia! Silakan pilih kolom 1-2.");
                        }
                    } while (kolom < 1 || kolom > 2);

                    // Cek apakah kursi sudah terisi
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("\nWarning: Kursi baris " + baris + " kolom " + kolom + " sudah terisi oleh " + penonton[baris - 1][kolom - 1] + "!");
                        System.out.println("Silakan masukkan baris dan kolom kembali.\n");
                        inputValid = false;
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");
                    }

                } while (!inputValid);

            } else if (menu == 2) {
                // Menu 2: Tampilkan daftar penonton
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String tampil = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + tampil + "\n");
                    }
                }

            } else if (menu == 3) {
                // Menu 3: Exit
                System.out.println("\nTerima kasih! Program selesai.");
                break;

            } else {
                System.out.println("\nMenu tidak valid! Pilih menu 1-3.");
            }

        }

        scanner.close();
    }
}