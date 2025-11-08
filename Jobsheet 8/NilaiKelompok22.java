import java.util.Scanner;

public class NilaiKelompok22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, totalNilai, rataNilai;
        double rataTertinggi = 0;
        int kelompokTertinggi = 0;

        // Perulangan FOR menggantikan WHILE untuk 6 kelompok
        for (int i = 1; i <= 6; i++) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            // Perulangan FOR untuk input 5 nilai tiap kelompok
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata kelompok " + i + ": " + rataNilai);

            // Mengecek apakah rata-rata saat ini tertinggi
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
        }

        // Menampilkan hasil akhir
        System.out.println("\nKelompok dengan rata-rata tertinggi adalah Kelompok " 
                            + kelompokTertinggi + " dengan nilai rata-rata " + rataTertinggi);

        sc.close();
    }
}
