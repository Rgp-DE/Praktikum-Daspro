import java.util.Scanner;
public class Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis = -1;
        int durasi;
        int total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar):");
            System.out.print("Pilihan: ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000; // mobil
                } else {
                    total += durasi * 2000; // motor
                }
            } else if (jenis != 0) {
                System.out.println("Pilihan tidak valid. Masukkan 1, 2, atau 0.");
            }
        } while (jenis != 0);

        System.out.println("Total biaya parkir = Rp " + total);
        sc.close();
    }
}