public class Tugas1c{
	public static void main(String[]args){
		int[] bilangan= new int[8];
		int p = 0;

		for (int i = 1; i<=15; i++){
			if (i % 2 != 0){
				bilangan[p] = i*i;
				p++;
			}
		}
		System.out.println("Bilangan Ganjil Kuadrat : ");
		for (int i = 0 ; i < bilangan.length; i++){
			System.out.println((2*i+1)+ "^2 = "+bilangan[i]);
		}
	}
}