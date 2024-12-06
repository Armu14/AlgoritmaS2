import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jumlah mahasiswa, jumlah mata kuliah, dan jumlah ujian
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();

        System.out.print("Masukkan jumlah ujian: ");
        int jumlahUjian = scanner.nextInt();

        // Inisialisasi array 3 dimensi untuk menyimpan nilai
        double[][][] nilai = new double[jumlahMahasiswa][jumlahMataKuliah][jumlahUjian];

        // Memasukkan nilai tiap mahasiswa untuk setiap mata kuliah
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahMataKuliah; j++) {
                for (int k = 0; k < jumlahUjian; k++) {
                    System.out.print("Masukkan nilai ujian " + (k + 1) + " mata kuliah " + (j + 1) + ": ");
                    nilai[i][j][k] = scanner.nextDouble();
                }
            }
        }

        // Menghitung rata-rata nilai tiap mahasiswa untuk setiap mata kuliah
        double[][] rataNilai = new double[jumlahMahasiswa][jumlahMataKuliah];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahMataKuliah; j++) {
                double total = 0;
                for (int k = 0; k < jumlahUjian; k++) {
                    total += nilai[i][j][k];
                }
                rataNilai[i][j] = total / jumlahUjian;
            }
        }

        // Menampilkan rata-rata nilai setiap mahasiswa untuk setiap mata kuliah
        System.out.println("Rata-rata nilai setiap mahasiswa untuk setiap mata kuliah:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.println("  Mata Kuliah " + (j + 1) + ": " + rataNilai[i][j]);
            }
        }
    }
}
