import java.util.Scanner;

public class CetakKRS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("-------Cetak KRS Siakad-------"); 
        System.out.println("Apakah UKT Sudah Lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRS dan minta tanda tangan DPA");
        }

        sc.close();
    }
}