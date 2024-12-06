import java.util.Scanner;
public class Latihan5 {
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		int nilai[][]=new int[10][3];
		int rata, jumlah, i;
		String nama[]=new String[10];
		for (i = 0; i < 10; i++){
			System.out.print("Masukkan Nama Siswa Ke "+(i+1)+" : ");
			nama[i]=input.next();
			for (int j = 0; j<3; j++){
				System.out.print("Masukkan Nilai Mata Kuliah Ke "+(j+1)+" : ");
				nilai[i][j] = input.nextInt();

			}
		}
		for (i = 1; i <= 10; i++){
			for (int j = 1; j<=3; j++){
				System.out.println("Nama\tMataKuliah1\tMataKuliah2\ttMataKuliah3\tRata-Rata\tKomentar");
				System.out.println(nama[i]="/t"+nilai[i][j]);
			}
		}
	}
}