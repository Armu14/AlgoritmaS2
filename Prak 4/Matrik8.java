import java.util.Scanner;

public class Matrik8 {
    public static void main(String[] args) {
        int b = 3;
        int d = 3;
        System.out.println("Masukan Nilai Matrix 1:");
        int[][] matrix1 = new int[b][d];
        inputMatrix(matrix1);
        System.out.println("Masukan Nilai Matrix 2:");
        int[][] matrix2 = new int[b][d];
        inputMatrix(matrix2);
        int[][] hasilKali = new int[b][d];

        // Perkalian matriks
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k < d; k++) {  // Perhitungan elemen hasil kali
                    hasilKali[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Menampilkan matrix hasil kali
        System.out.println("\nHasil Kali Matrix:");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(hasilKali[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void inputMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input();
            }
        }
    }
    static int input() {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        return b;
    }
}