import java.util.Scanner;

public class NilaiMahasiswa21 {

    // a. Fungsi isianArray: mengisi elemen array dengan input user
    static void isianArray(int[] nilai) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
    }

    // b. Fungsi tampilArray: menampilkan seluruh nilai mahasiswa
    static void tampilArray(int[] nilai) {
        System.out.println("Daftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    // c. Fungsi hitTot: menghitung total nilai seluruh mahasiswa
    static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    // d. Fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca nilai N (jumlah mahasiswa)
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();

        // Membuat array sebesar N
        int[] nilaiMahasiswa = new int[N];

        // Memanggil fungsi-fungsi
        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);

        input.close();
    }
}
