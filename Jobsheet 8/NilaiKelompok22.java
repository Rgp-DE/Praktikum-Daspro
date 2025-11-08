import java.util.Scanner;

public class NilaiKelompok22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, totalNilai, rataNilai;
        double rataTertinggi = 0;     // Menyimpan rata-rata tertinggi
        int kelompokTertinggi = 0;    // Menyimpan nomor kelompok dengan rata-rata tertinggi
        int i = 1; 

        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata kelompok " + i + ": " + rataNilai);

            // Mengecek apakah rata-rata kelompok ini adalah yang tertinggi
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        // Menampilkan hasil akhir
        System.out.println("\nKelompok dengan rata-rata tertinggi adalah Kelompok " 
                            + kelompokTertinggi + " dengan nilai rata-rata " + rataTertinggi);

        sc.close();
    }
}
