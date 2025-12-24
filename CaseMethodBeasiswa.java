import java.util.Scanner;

public class CaseMethodBeasiswa {

    static String[] nama = new String[100];
    static String[] nim = new String[100];
    static double[] ipk = new double[100];
    static String[] jenis = new String[100];
    static int[] penghasilan = new int[100];
    static int jumlahPendaftar = 0;

    static Scanner sc = new Scanner(System.in);

    public static void tampilMenu() {
        System.out.println("\n=== Sistem Pendaftaran Beasiswa ===");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    public static void tambahData() {
        if (jumlahPendaftar >= 100) {
            System.out.println("Data penuh!");
            return;
        }

        System.out.print("Nama Mahasiswa: ");
        nama[jumlahPendaftar] = sc.next();

        System.out.print("NIM: ");
        nim[jumlahPendaftar] = sc.next();

        System.out.print("IPK terakhir: ");
        ipk[jumlahPendaftar] = sc.nextDouble();

        System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
        jenis[jumlahPendaftar] = sc.next();

        if (!(jenis[jumlahPendaftar].equalsIgnoreCase("Reguler") ||
              jenis[jumlahPendaftar].equalsIgnoreCase("Unggulan") ||
              jenis[jumlahPendaftar].equalsIgnoreCase("Riset"))) {
            System.out.println("Jenis beasiswa tidak valid.");
            return;
        }

        System.out.print("Penghasilan orang tua (maksimal 2000000): ");
        penghasilan[jumlahPendaftar] = sc.nextInt();

        if (penghasilan[jumlahPendaftar] > 2000000) {
            System.out.println("Pendaftaran dibatalkan karena penghasilan melebihi batas maksimal.");
            return;
        }

        jumlahPendaftar++;
        System.out.println("Pendaftar berhasil disimpan. Total pendaftar: " + jumlahPendaftar);
    }

    public static void tampilSemua() {
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.println("\nNama\tNIM\tIPK\tJenis\tPenghasilan");
        for (int i = 0; i < jumlahPendaftar; i++) {
            System.out.println(nama[i] + "\t" + nim[i] + "\t" + ipk[i] + "\t" +
                               jenis[i] + "\t" + penghasilan[i]);
        }
    }

    public static void cariByJenis() {
        System.out.print("Masukkan jenis beasiswa yang dicari: ");
        String cari = sc.next();

        boolean ditemukan = false;
        for (int i = 0; i < jumlahPendaftar; i++) {
            if (jenis[i].equalsIgnoreCase(cari)) {
                System.out.println(nama[i] + " | " + nim[i] + " | IPK: " + ipk[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada pendaftar untuk jenis beasiswa tersebut.");
        }
    }

    public static void hitungRataIPK() {
        String[] daftarJenis = {"Reguler", "Unggulan", "Riset"};

        for (int j = 0; j < daftarJenis.length; j++) {
            double total = 0;
            int count = 0;

            for (int i = 0; i < jumlahPendaftar; i++) {
                if (jenis[i].equalsIgnoreCase(daftarJenis[j])) {
                    total += ipk[i];
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(daftarJenis[j] + " : rata-rata IPK = " + (total / count));
            } else {
                System.out.println(daftarJenis[j] + " : tidak ada pendaftar.");
            }
        }
    }

 public static void judul() {
    String RESET = "\u001B[0m";

    String MERAH = "\u001B[31m";
    String UNGU  = "\u001B[35m";
    String BIRU  = "\u001B[34m";
    String CYAN  = "\u001B[36m";

    System.out.println(MERAH + "==============================================================================================");
    System.out.println(MERAH + " ██████╗ █████╗ ███████╗███████╗    ███╗   ███╗███████╗████████╗██╗  ██╗ ██████╗ ██████╗ ");
    System.out.println(UNGU  + "██╔════╝██╔══██╗██╔════╝██╔════╝    ████╗ ████║██╔════╝╚══██╔══╝██║  ██║██╔═══██╗██╔══██╗");
    System.out.println(CYAN  + "██║     ███████║███████╗█████╗      ██╔████╔██║█████╗     ██║   ███████║██║   ██║██║  ██║");
    System.out.println(BIRU  + "██║     ██╔══██║╚════██║██╔══╝      ██║╚██╔╝██║██╔══╝     ██║   ██╔══██║██║   ██║██║  ██║");
    System.out.println(UNGU  + "╚██████╗██║  ██║███████║███████╗    ██║ ╚═╝ ██║███████╗   ██║   ██║  ██║╚██████╔╝██████╔╝");
    System.out.println(MERAH + " ╚═════╝╚═╝  ╚═╝╚══════╝╚══════╝    ╚═╝     ╚═╝╚══════╝   ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚═════╝ ");
    System.out.println(BIRU  + "==============================================================================================" + RESET);
}


    public static void main(String[] args) {
        judul();
        int pilihan = 0;

        while (pilihan != 5) {
            tampilMenu();
            pilihan = sc.nextInt();

            if (pilihan == 1) {
                tambahData();
            } else if (pilihan == 2) {
                tampilSemua();
            } else if (pilihan == 3) {
                cariByJenis();
            } else if (pilihan == 4) {
                hitungRataIPK();
            } else if (pilihan == 5) {
                System.out.println("Terima kasih. Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        
    }
}
