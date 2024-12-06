import java.util.Scanner;

public class T5U {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah mahasiswa dan mata kuliah
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah : ");
        int jumlahMataKuliah = scanner.nextInt();

        // Array untuk menyimpan nilai mahasiswa
        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMataKuliah];

        // Meminta pengguna untuk memasukkan nilai
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai untuk Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai Mata Kuliah " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }

        // Menghitung dan menampilkan rata-rata nilai
        System.out.println("\nNama\tMata Kuliah1\tMata Kuliah2\tMata Kuliah3\tRata-Rata");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            double rataRata = hitungRataRata(nilaiMahasiswa[i]);
            System.out.println("Mahasiswa " + (i + 1) + ": " + rataRata);
        }

    }

    // Method untuk menghitung rata-rata nilai
    public static double hitungRataRata(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return (double) total / nilai.length;
    }
}
