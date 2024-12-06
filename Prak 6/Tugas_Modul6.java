import java.util.Scanner;
public class Tugas_Modul6{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String matkul, jenjang;
		int sks, total=0, i = 1;
		System.out.print("Masukkan Jenjang (D3/S1) = ");
		jenjang = input.nextLine();
		if (jenjang.equals("D3")){
			while(i <= 3){
				System.out.print("Masukkan Mata Kuliah = ");
				matkul = input.next();
				System.out.print("Masukkan SKS = ");
				sks = input.nextInt();
				total = total + sks;
				i++;
			}System.out.println("Total SKS = "+total);
		}else{
			while(i <= 5){
				System.out.print("Masukkan Mata Kuliah = ");
				matkul = input.next();
				System.out.print("Masukkan SKS = ");
				sks = input.nextInt();
				total = total + sks;
				i++;
			}System.out.println("Total SKS = "+total);
		}
	}
}