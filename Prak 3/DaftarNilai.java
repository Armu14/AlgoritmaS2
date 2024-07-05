import java.util.Scanner;
public class DaftarNilai {
    public static void main(String[] args) {

        int jumlah;
        String[] nama;
        int[] nim;
        float[][] nilai;
        float[] rata;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = input.nextInt();

        nama = new String[jumlah];
        nim = new int[jumlah];
        nilai = new float[jumlah][3];
        rata = new float[jumlah];

		System.out.println("========================");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            nama[i] = input.next();
            System.out.print("NIM: ");
            nim[i] = input.nextInt();


            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai Tugas " + (j + 1) + ": ");
                nilai[i][j] = input.nextFloat();
            }
        }System.out.println();
        for (int i = 0; i < jumlah; i++) {
            rata[i] = (nilai[i][0] + nilai[i][1] + nilai[i][2]) / 3;
        }
        System.out.println("===================================================");
        System.out.println("\tDaftar Nilai Mata Kuliah Algoritma");
        System.out.println("Nama   Nim   Tugas1   Tugas2   Tugas3    |rata-rata");
        System.out.println("===================================================");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5s  %-5d  %-7.2f  %-7.2f  %-7.2f  |  %-7.2f\n",
                    nama[i], nim[i], nilai[i][0],
                    nilai[i][1], nilai[i][2], rata[i]);
        }
    }
}