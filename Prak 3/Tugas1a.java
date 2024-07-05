import java.util.Scanner;
public class Tugas1a{
	public static void main(String[]args){
		int[] bilangan =new int[10];
		int pangkat, hasil ;
		for (int i=0; i<bilangan.length; i++){
			pangkat = i+1;
			hasil = pangkat*pangkat;
			System.out.println((i+1)+" Kuadrat : "+hasil);
		}
	}
}