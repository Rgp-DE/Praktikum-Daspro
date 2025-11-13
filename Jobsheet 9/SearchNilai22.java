import java.util.Scanner;

public class SearchNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input jumlah elemen array
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] arrNilai = new int[jumlah];

        // input nilai-nilai mahasiswa
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        // input nilai (key) yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = 0; 

        // proses pencarian nilai dalam array
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; // simpan indeks tempat nilai ditemukan
                break;     // menghentikan pencarian setelah ditemukan
            }
        }

        System.out.println(); 

        // menampilkan hasil pencarian
        if (hasil != 0) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam data mahasiswa.");
        }

        sc.close();
    }
}
