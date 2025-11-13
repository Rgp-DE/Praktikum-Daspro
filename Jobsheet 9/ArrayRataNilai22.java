import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt(); // input jumlah elemen array

        int[] nilaiMhs = new int[jumlahMhs]; // array dengan ukuran sesuai input
        double total = 0;
        double rata2;
        int jumlahLulus = 0; // variabel untuk menghitung mahasiswa yang lulus

        // input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // menghitung total nilai dan mahasiswa yang lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("\nRata-rata nilai = " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus = " + jumlahLulus);

        sc.close();
    }
}
