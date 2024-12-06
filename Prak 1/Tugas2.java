import java.util.Scanner;
public class Tugas2{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int bulan, jumlah;
		System.out.print("Masukkan jumlah hari dalam 1 tahun (364/365) : ");
		jumlah=input.nextInt();
		System.out.print("Pilih Bulan (1-12) : ");
		bulan=input.nextInt();
		if (jumlah%4==0){
			switch (bulan){
				case 1,3,5,7,9,11:
				System.out.println("Bulan ke "+bulan+" berjumlah 31 hari");
				break;
				case 2:
				System.out.println("Bulan ke "+bulan+" berjumlah 28 hari");
				break;
				case 4,6,8,10,12:
				System.out.println("Bulan ke "+bulan+" berjumlah 30 hari");
				break;
				default :
				System.out.println("Salah memasukkan bulan!!");
				break;
			}
		}else{
			switch (bulan){
				case 1,3,5,7,9,11:
				System.out.println("Bulan ke "+bulan+" berjumlah 31 hari");
				break;
				case 2:
				System.out.println("Bulan ke "+bulan+" berjumlah 29 hari");
				break;
				case 4,6,8,10,12:
				System.out.println("Bulan ke "+bulan+" berjumlah 30 hari");
				break;
				default :
				System.out.println("Salah memasukkan bulan!!");
				break;
			}
		}
	}
}