import java.util.Scanner;
public class Latihan1 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String nama[];
		String desc[]=new String[10];
		int mhs, jml, banyakTes = 3, nilai[][];
		float rata[], jumlah[];
		System.out.print("Masukkan Jumlah Mahasiswa : ");
		mhs = input.nextInt();
		nama = new String[mhs];
		nilai = new int[mhs][banyakTes];
		jumlah = new float[mhs];
		rata = new float[mhs];
		System.out.println();
		for(int h=0;h<mhs;h++){ //Mahasiswa
			System.out.println("Mahasiswa " + (h+1));
			System.out.print("Nama Mahasiswa : ");
			nama[h] = input.next();
			for(int i=0;i<banyakTes;i++){ //Tes keberapa
				System.out.print("Nilai Tes " + (i+1) + " : ");
				nilai[h][i] = input.nextInt();
				jumlah[h] = jumlah[h] + nilai[h][i];
			}
			rata[h] = jumlah[h]/banyakTes;
			System.out.println();
			if(rata[h]>=80){
				desc[h]="Sangat Baik";
			} else if (rata[h]>=50){
				desc[h]="Baik";
			} else {
				desc[h]="Kurang Baik";
			}
		}
		System.out.println("---------------------------");
		System.out.println("Daftar Nilai Mahasiswa : ");
		System.out.println("---------------------------");
		System.out.println();
		System.out.println("\t\tNama\tTest 1\tTest 2\tTest 3\tRata-rata\tDeskripsi");
		for(int j=0;j<mhs;j++){
			System.out.print("Mahasiswa " + (j+1));
			System.out.print("\t" + nama[j]);
			for(int k=0;k<banyakTes;k++){
				System.out.print("\t" + nilai[j][k]);
			}
			System.out.print("\t" + rata[j]);
			System.out.print("\t" + desc[j]);
			System.out.println();
		}
	}
}