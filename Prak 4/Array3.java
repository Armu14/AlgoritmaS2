import java.util.Scanner;
public class Array3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//mendeklarisan nilai Array
		int baris = 0;
		int kolom = 2;
		System.out.print("Masukkan Jumlah Kucing : ");
		baris = input.nextInt();
		String[][] cats= new String[baris][kolom];
		for (int i=0;i<baris;i++) {
			System.out.print("Masukkan Nama Kucing : ");
			cats[i][0]=input.next();
			System.out.print("Masukkan Warna Kucing : ");
			cats[i][1]=input.next();
			System.out.println();
		}
		System.out.println("Nama Kucing\tWarna");
		for (int i=0;i<baris;i++) {
			for (int j=0;j<kolom;j++) {
				System.out.print(cats[i][j]);
				System.out.print("\t\t");
			}
			System.out.println(" ");
		}
	}
}