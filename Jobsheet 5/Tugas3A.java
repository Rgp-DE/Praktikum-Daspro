import java.util.Scanner;

public class Tugas3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = sc.nextInt();

        int maksimum, minimum;
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                maksimum = bil1;
            } else {
                maksimum = bil3;
            }
        } else {
            if (bil2 > bil3) {
                maksimum = bil2;
            } else {
                maksimum = bil3;
            }
        }

        if (bil1 < bil2) {
            if (bil1 < bil3) {
                minimum = bil1;
            } else {
                minimum = bil3;
            }
        } else {
            if (bil2 < bil3) {
                minimum = bil2;
            } else {
                minimum = bil3;
            }
        }

        System.out.println("Bilangan maksimum adalah " + maksimum);
        System.out.println("Bilangan minimum adalah " + minimum);
        sc.close();
    }
}
