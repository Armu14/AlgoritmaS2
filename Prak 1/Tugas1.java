import java.util.Scanner;
public class Tugas1{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		String mer, jen;
		int pil;
		System.out.print("Pilih kendaaraan yang ingin anda beli (1:Mobil/2.Motor) : ");
		pil=input.nextInt();
		switch (pil){
			case 1 :
			System.out.println("Merek mobil yang disediakan :");
			System.out.println("Honda");
			System.out.println("Suzuki");
			System.out.print("Pilih Merek Kendaraan : ");
			mer=input.next();
			switch(mer){
				case "Honda" :
				System.out.println("Jenis mobil yang berMerek Honda :");
				System.out.println("Jazz");
				System.out.println("Brio");
				System.out.println("Mobilio");
				System.out.println("Pilih jenis mobil : ");
				jen=input.next();
				switch(jen){
					case "Jazz":
					System.out.println("Harga Mobil +"jen"+ : Rp 170.000.000");
					break;
					case "Brio":
					System.out.println("Harga Mobil +"jen"+ : Rp 120.000.000");
					break;
					case "Mobilio":
					System.out.println("Harga Mobil +"jen"+ : Rp 170.000.000");
					break;
					default :
					System.out.println("jenis mobil tidak terdaftar!!");
				}
				break;
				case "Suzuki" :
					System.out.println("Jenis mobil yang berMerek Honda :");
					System.out.println("APV");
					System.out.println("Swift");
					System.out.println("Ertiga");
					System.out.println("Pilih jenis mobil : ");
					jen=input.next();
					switch(jen){
						case "APV":
						System.out.println("Harga Mobil +"jen"+ : Rp 180.000.000");
						break;
						case "Swift":
						System.out.println("Harga Mobil +"jen"+ : Rp 155.000.000");
						break;
						case "Ertiga":
						System.out.println("Harga Mobil +"jen"+ : Rp 160.000.000");
						break;
						default :
						System.out.println("jenis mobil tidak terdaftar!!");
					}
					break;
				}
				break;
				case 1 :
				System.out.println("Merek mobil yang disediakan :");
				System.out.println("Honda");
				System.out.println("Suzuki");
				System.out.print("Pilih Merek Kendaraan : ");
				mer=input.next();
				switch(mer){
					case "Honda" :
					System.out.println("Jenis mobil yang berMerek Honda :");
					System.out.println("Jazz");
					System.out.println("Brio");
					System.out.println("Mobilio");
					System.out.println("Pilih jenis mobil : ");
					jen=input.next();
					switch(jen){
						case "Jazz":
						System.out.println("Harga Mobil +"jen"+ : Rp 170.000.000");
						break;
						case "Brio":
						System.out.println("Harga Mobil +"jen"+ : Rp 120.000.000");
						break;
						case "Mobilio":
						System.out.println("Harga Mobil +"jen"+ : Rp 170.000.000");
						break;
						default :
						System.out.println("jenis mobil tidak terdaftar!!");
					}
					break;
					case "Suzuki" :
						System.out.println("Jenis mobil yang berMerek Honda :");
						System.out.println("APV");
						System.out.println("Swift");
						System.out.println("Ertiga");
						System.out.println("Pilih jenis mobil : ");
						jen=input.next();
						switch(jen){
							case "APV":
							System.out.println("Harga Mobil +"jen"+ : Rp 180.000.000");
							break;
							case "Swift":
							System.out.println("Harga Mobil +"jen"+ : Rp 155.000.000");
							break;
							case "Ertiga":
							System.out.println("Harga Mobil +"jen"+ : Rp 160.000.000");
							break;
							default :
							System.out.println("jenis mobil tidak terdaftar!!");
						}
						break;
					}
				}
			}
		}
	}
}