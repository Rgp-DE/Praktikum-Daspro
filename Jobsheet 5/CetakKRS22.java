import java.util.Scanner;

public class CetakKRS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("-------Cetak KRS Siakad-------");
        System.out.println("Apakah UKT Sudah Lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas ? "Pembayaran UKT Terverifikasi\nSilahkan Cetak KRS dan minta tanda tangan DPA"
                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);

        sc.close();
    }
}