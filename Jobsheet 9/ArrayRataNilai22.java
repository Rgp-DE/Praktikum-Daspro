import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jumlahLulus = 0; // variabel mahasiswa yang lulus

       
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // menghitung total nilai dan jumlah mahasiswa yang lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) { // cek apakah mahasiswa lulus
                jumlahLulus++;
            }
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("\nRata-rata nilai = " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus = " + jumlahLulus);// menampilkan jumlah mahasiswa yang lulus

        sc.close();
    }
}
