public class Kubus21{

    // Fungsi menghitung volume kubus
    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    // Fungsi menghitung luas permukaan kubus
    static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * (sisi * sisi);
        return luasPermukaan;
    }

    public static void main(String[] args) {
        int sisi = 5; // contoh nilai sisi

        int volume = hitungVolume(sisi);
        int luas = hitungLuasPermukaan(sisi);

        System.out.println("Sisi kubus: " + sisi);
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luas);
    }
}
