public class Piramida {
    public static void main(String[] args) {
        int tingkat = 5;
        int tingkatSekarang = 1;

        do {
            int spasi = tingkat - tingkatSekarang;
            int bintang = 2 * tingkatSekarang - 1;

            // Cetak spasi
            int j = 1;
            do {
                System.out.print(" ");
                j++;
            } while (j <= spasi);

            // Cetak bintang
            int k = 1;
            do {
                System.out.print("*");
                k++;
            } while (k <= bintang);

            System.out.println(); // Pindah ke baris baru

            tingkatSekarang++;
        } while (tingkatSekarang <= tingkat);
    }
}
