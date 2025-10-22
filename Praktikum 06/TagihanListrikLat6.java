import java.util.Scanner;

public class TagihanListrikLat6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tarifPerKwh; 
        int biayaBulanan = 50000;  
        double totalSebelumPpn, biayaListrik, Ppn, totalSemuaBiaya;

        System.out.print("Masukkan pilihan daya (contoh: 900, 1300, 2200, 3500, 5500): ");
        int daya = scanner.nextInt();
        switch (daya) {
            case 900:
                tarifPerKwh = 1300;
                break;
            case 1300:
            case 2200:
                tarifPerKwh = 1500;
                break;
            case 3500:
            case 5500:
                tarifPerKwh = 1700;
                break;
            default:
                System.out.println("Daya tidak dikenali. Menggunakan tarif default Rp 1.500/kWh.");
                tarifPerKwh = 1500;
                break;
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
