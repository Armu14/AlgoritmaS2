import java.util.Scanner;
public class T1{
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		String jenis, merek;
		int pilih;
		System.out.print("Masukkan jenis kendaaraan (Motor/Mobil) : ");
		jenis=input.next();
		if (jenis.equals("Mobil")){
			System.out.print("Masukkan merek Mobil (Honda/Suzuki) : ");
			merek=input.next();
			switch (merek){
				case "Honda":
				System.out.println("Mobil dari Honda : ");
				System.out.println("1. Jazz (170 jt)");
				System.out.println("2. Brio (120 jt)");
				System.out.println("3. Mobilio (170 jt)");
				System.out.print("Silahkan pilih kendaaraan (1/2/3) : ");
				pilih=input.nextInt();
				switch (pilih){
					case 1 :
					System.out.println("Harga Mobil Jazz : Rp. 170.000.000.");
					break;
					case 2 :
					System.out.println("Harga Mobil Brio : Rp. 120.000.000.");
					break;
					case 3 :
					System.out.println("Harga Mobil Mobilio : Rp. 170.000.000.");
					break;
					default :
					System.out.println("Salah memasukkan pilihan!!");

				}
				break;
				case "Suzuki":
				System.out.println("Mobil dari Suzuki : ");
				System.out.println("1. APV (180 jt)");
				System.out.println("2. Swift (155 jt)");
				System.out.println("3. Ertiga (160 jt)");
				System.out.print("Silahkan pilih kendaaraan (1/2/3) : ");
				pilih=input.nextInt();
				switch (pilih){
					case 1 :
					System.out.println("Harga Mobil APV : Rp. 180.000.000.");
					break;
					case 2 :
					System.out.println("Harga Mobil Swift : Rp. 155.000.000.");
					break;
					case 3 :
					System.out.println("Harga Mobil Ertiga : Rp. 160.000.000.");
					break;
					default :
					System.out.println("Salah memasukkan pilihan!!");
				}
				break;
			}
		}else{
			System.out.print("Masukkan merek Motor (Honda/Yamaha) : ");
			merek=input.next();
			switch (merek){
				case "Honda":
				System.out.println("Motor dari Honda : ");
				System.out.println("1. Vario (15 jt)");
				System.out.println("2. Supra (12 jt)");
				System.out.print("Silahkan pilih kendaaraan (1/2) : ");
				pilih=input.nextInt();
				switch (pilih){
					case 1 :
					System.out.println("Harga Motor Vario : Rp. 15.000.000.");
					break;
					case 2 :
					System.out.println("Harga Motor Supra : Rp. 12.000.000.");
					break;
					default :
					System.out.println("Salah memasukkan pilihan!!");
				}
				break;
				case "Yamaha":
				System.out.println("Motor dari Yamaha : ");
				System.out.println("1. Mio (15 jt)");
				System.out.println("2. Vixion (20 jt)");
				System.out.print("Silahkan pilih kendaaraan (1/2) : ");
				pilih=input.nextInt();
				switch (pilih){
					case 1 :
					System.out.println("Harga Motor Mio : Rp. 15.000.000.");
					break;
					case 2 :
					System.out.println("Harga Motor Vixion : Rp. 20.000.000.");
					break;
					default :
					System.out.println("Salah memasukkan pilihan!!");
				}
				break;
			}
		}
	}
}