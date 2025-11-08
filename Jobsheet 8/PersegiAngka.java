import java.util.Scanner;

public class PersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal adalah 3!");
        } else {
            // Loop baris
            for (int i = 1; i <= n; i++) {
                // Loop kolom
                for (int j = 1; j <= n; j++) {
                    // Kondisi untuk sisi luar persegi
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print(n + " ");
                    } else {
                        System.out.print("  "); // bagian dalam kosong
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
