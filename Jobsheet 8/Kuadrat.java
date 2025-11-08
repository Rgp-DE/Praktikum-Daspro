public class Kuadrat {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++) {
            int jumlahPangkat = 0;
            
            System.out.print("n = " + n + "  jumlah kuadrat = ");
            for (int j = 1; j <= n; j++) {
                int pangkat = j * j;
                jumlahPangkat += pangkat;
                if (j > 1) System.out.print(" + ");
                System.out.print(pangkat);
            }
            System.out.println(" = " + jumlahPangkat);
        }
    }
}
