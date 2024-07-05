import java.util.Scanner;
public class Array4 {
	public static void main(String[] args) {
		int bilangan[] = new int[4];
		int i,j;
		Scanner input = new Scanner(System.in);
		for (i=0;i<=3;i++) {
		    System.out.print("Silahkan masukan bilangan ke "+i+" : ");
		    bilangan[i] = input.nextInt();
		}
		//untuk menampilkan array
		for (j=0;j<=3;j++) {
     		System.out.println("Bilangan yang anda masukkan" + " "+ bilangan[j]);
     	}
    }
}
