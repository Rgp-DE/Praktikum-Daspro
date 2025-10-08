import java.util.Scanner;

public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Day Number (1-7): ");
        int dayNumber = sc.nextInt();
        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("Weekday");
        } else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}