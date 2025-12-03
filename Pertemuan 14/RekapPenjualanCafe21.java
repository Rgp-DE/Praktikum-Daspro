import java.util.Scanner;

public class RekapPenjualanCafe21 {

    // Daftar nama menu (5 menu)
    static String[] menu = {
        "Kopi",
        "Teh",
        "Es Kelapa Muda",
        "Roti Bakar",
        "Gorengan"
    };

    // 5 menu × 7 hari
    static int[][] penjualan = new int[5][7];

    
    // 1. Fungsi input data penjualan (2D array)
    
    static void inputData(Scanner sc) {
        System.out.println("=== INPUT DATA PENJUALAN 5 MENU SELAMA 7 HARI ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    
    // 2. Fungsi menampilkan seluruh data dalam bentuk tabel
   
    static void tampilkanTabel() {
        System.out.println("\n=== TABEL PENJUALAN MENU CAFE ===");
        System.out.print(String.format("%-18s", "Menu"));
        for (int h = 1; h <= 7; h++) {
            System.out.print(String.format("Hari %d ", h));
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(String.format("%-18s", menu[i]));
            for (int j = 0; j < 7; j++) {
                System.out.print(String.format("%-7d", penjualan[i][j]));
            }
            System.out.println();
        }
    }

    
    // 3. Fungsi menampilkan menu dengan total penjualan tertinggi
    
    static void tampilMenuTertinggi() {
        int maxTotal = -1;
        int indexMenu = -1;

        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indexMenu = i;
            }
        }

        System.out.println("\n=== MENU DENGAN TOTAL PENJUALAN TERTINGGI ===");
        System.out.println("Menu : " + menu[indexMenu]);
        System.out.println("Total Penjualan : " + maxTotal);
    }

    
    // 4. Fungsi menampilkan rata-rata penjualan tiap menu
   
    static void tampilRataRata() {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");

        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rata = total / 7.0;

            System.out.println(menu[i] + " : " + rata);
        }
    }

    // Fungsi main
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inputData(sc);             
        tampilkanTabel();          
        tampilMenuTertinggi();     
        tampilRataRata();          
    }
}
