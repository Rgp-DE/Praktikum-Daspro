import java.util.Scanner;

public class TagihanListrikLat5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tarifPerKwh; 
        int biayaBulanan = 50000;  
        double totalSebelumPpn, biayaListrik, Ppn, totalSemuaBiaya;

        System.out.print("Masukkan pilihan daya (contoh: 900, 1300, 2200, 3500, 5500): ");
        int daya = scanner.nextInt();
        if (daya == 900) {
            tarifPerKwh = 1300;
        } else if (daya == 1300 || daya == 2200) {
            tarifPerKwh = 1500;
        } else if (daya == 3500 || daya == 5500) {
            tarifPerKwh = 1700;
        } else {
            System.out.println("Daya tidak dikenali. Menggunakan tarif default Rp 1.500/kWh.");
            tarifPerKwh = 1500;
        }

        System.out.print("Masukkan jumlah kWh yang digunakan: ");
        double kwhDigunakan = scanner.nextDouble();   
        biayaListrik = kwhDigunakan * tarifPerKwh;
        totalSebelumPpn = biayaListrik + biayaBulanan;  
        Ppn = totalSebelumPpn * 0.1; 

        
        totalSemuaBiaya = totalSebelumPpn + Ppn;
        System.out.println("Total biaya listrik yang harus dibayar: Rp " + totalSemuaBiaya);

        
        scanner.close();
    }

    
}
