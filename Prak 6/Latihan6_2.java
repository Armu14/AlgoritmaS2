import java.util.Scanner;
public class Latihan6_2{
	public static void main (String arg[]){
   		Scanner in=new Scanner(System.in);
   		int nilai, i, n=1;
   		System.out.print("Masukkan Banyak Siswa : ");
   		i=in.nextInt();
		while (n<=i){
   			System.out.println("Angka Bulat dari 0 - 100");
   			System.out.print("Masukkan Nilai Siswa Ke- "+n+" : ");
   			nilai=in.nextInt();
   			if (nilai>=60){
     			if (nilai>=80){
       				System.out.println("Nilai siswa bagus sekali ");
       				n++;
     			}else{
       				System.out.println("Nilai siswa bagus ");
       				n++;
				}
   			} else {
   				if (nilai>=30){
     				System.out.println("Nilai siswa kurang ");
     				n++;
   				}else{
     				System.out.println("Nilai siswa jelek ");
     				n++;
				}
   			}
		}
	}
}
