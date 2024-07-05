public class Main {
    // Fungsi untuk menghitung pangkat
    public static int hitungPangkat(int bilangan, int pangkat) {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= bilangan;
        }
        return hasil;
    }

    public static void main(String[] args) {
        // Iterasi dari 1 hingga 10
        for (int i = 1; i <= 10; i++) {
            // Hitung pangkat
            int pangkat = hitungPangkat(i, i);
            // Tampilkan bilangan dan pangkatnya
            System.out.println(i + " pangkat " + i + " = " + pangkat);
        }
    }
}
