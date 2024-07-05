import java.util.Scanner;
public class Array5{
	public static void main(String args[]){
		Scanner masuk = new Scanner(System.in);
		int nilai[]= new int[5];
		int total;
		double rata;
		System.out.println("Masukan 5 buat data nilai");
		for (int i = 0; i < 5; i++){
			System.out.print( (i + 1 )+" : ");
	    	nilai[i]=masuk.nextInt();
	    }
		System.out.println("Data nilai yang dimasukan");
		for (int i = 0; i < 5; i++)
		System.out.println("Nilai = "+nilai[i]);
		total = 0;
		for (int i = 0; i < 5; i++)
		total = total + nilai[i];
		rata = total/5;
		System.out.println("Total data = "+total);
		System.out.println("Rata-rata  = "+rata);
	}
}
