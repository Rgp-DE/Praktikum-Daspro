import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt(); // input jumlah elemen array

        int[] nilaiMhs = new int[jumlahMhs]; // array dengan ukuran sesuai input
        double total = 0;
        double rata2;
        int jumlahLulus = 0; 
        int jumlahTidakLulus = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;

        // input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // inisialisasi nilai tertinggi dan terendah
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        // menghitung total nilai, jumlah lulus, tidak lulus, serta nilai tertinggi & terendah
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jumlahTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }

            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        // menghitung rata-rata
        rata2 = total / nilaiMhs.length;

        double rataLulus = 0;
        double rataTidakLulus = 0;

        if (jumlahLulus > 0) {
            rataLulus = totalLulus / jumlahLulus;
        }

        if (jumlahTidakLulus > 0) {
            rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
        }

        // output hasil
        System.out.println("\nRata-rata seluruh nilai = " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus = " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + jumlahTidakLulus);
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai terendah = " + nilaiTerendah);
        System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rataLulus);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rataTidakLulus);

        sc.close();
    }
}
