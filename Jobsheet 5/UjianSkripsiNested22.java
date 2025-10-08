import java.util.Scanner;

public class UjianSkripsiNested22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        System.out.print("Apakah Mahasiswa Sudah Bebas Kompen (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan Jumlah Log Bimbingan Pebimbing 1: ");
        int bimninganP1 = sc.nextInt();
        System.out.print("Masukkan Jumlah Log Bimbingan Pebimbing 2: ");
        int bimninganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimninganP1 >= 8 && bimninganP2 >= 4) {
                pesan = "Semua Syarat Terpenuhi. Mahasiswa boleh mendaftarkan Ujian Skripsi";
            } else if (bimninganP1 < 8 && bimninganP2 < 4) {
                pesan = "Gagal! Log bimbingan pembimbing 1 kurang dari 8 dan log bimbingan pembimbing 2 kurang dari 4";
            } else if (bimninganP1 < 8) {
                pesan = "Gagal! Log bimbingan pembimbing 1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan pembimbing 2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memilliki tanggungan kompen";
        }
        System.out.println(pesan);
        sc.close();

    }
}
