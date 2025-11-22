import java.util.Scanner;

public class SurveyKepuasan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. DEKLARASI ARRAY & INPUT DATA
  
        int[][] survey = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Input jawaban untuk responden " + (i + 1));

            for (int j = 0; j < 6; j++) {
                System.out.print("Masukkan nilai pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
        }

        // b. RATA-RATA PER RESPONDEN
        System.out.println("\n=== Rata-rata per Responden ===");
        for (int i = 0; i < 10; i++) {
            int total = 0;

            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }

            double rataResponden = (double) total / 6;
            System.out.println("Responden " + (i + 1) + ": " + rataResponden);
        }

        // c. RATA-RATA PER PERTANYAAN
     
        System.out.println("\n=== Rata-rata per Pertanyaan ===");
        for (int j = 0; j < 6; j++) {
            int total = 0;

            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }

            double rataPertanyaan = (double) total / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataPertanyaan);
        }

        // d. RATA-RATA KESELURUHAN
        
        int totalSemua = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalSemua += survey[i][j];
            }
        }

        double rataKeseluruhan = (double) totalSemua / (10 * 6);
        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);

        sc.close();
    }
}
