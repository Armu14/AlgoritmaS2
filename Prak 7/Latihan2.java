import java.util.Scanner;
public class Latihan2 {
	public static void main(String args[]) {
  		int oracle=0, ccna=0, jumlah=0;
  		int jawab=1;
  		System.out.println("Kategori workshop : ");
  		System.out.println("1. oracle : ");
  		System.out.println("2. ccna : ");
  		Scanner masuk=new Scanner(System.in);
  		do {
    		System.out.print("Masukkan kategori workshop (1,2): ");
    		int kategori=masuk.nextInt();
    		if(kategori==1) {
    	 		oracle++;
    	 	} else {
     			ccna++;
    		}
    		System.out.print("Daftar workshop ? (1=ya,0=tidak) ");
    		jawab=masuk.nextInt();
   		}while(jawab ==1);
 		System.out.println("");System.out.println("");
 		System.out.println("Data yang dimasukkan ");
 		System.out.println("Jumlah oracle = "+oracle);
 		System.out.println("Jumlah ccna = "+ccna);
	}
}