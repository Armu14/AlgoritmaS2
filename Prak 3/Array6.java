import java.util.Scanner;
public class Array6{
	public static void main(String args[]){
		Scanner masuk = new Scanner(System.in);
		int nilai[]= new int[5];
		System.out.println("Masukan 5 buat data nilai");
		for (int i = 0; i < 5; i++){
			System.out.print( (i + 1 )+" : ");
	    	nilai[i]=masuk.nextInt();
	    }
	    int min = nilai[0];
		int max = nilai[0];
		for (int i = 0; i < 5; i++){
			if ( nilai[i]> max)
			max = nilai[i];
			if ( nilai[i]< min)
			min = nilai[i];
		}
		System.out.println("Nilai terbesar = "+max);
		System.out.println("Nilai Terkecil  = "+min);
	}
}
