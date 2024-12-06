import java.util.Scanner;
public class Array5_M6 {
	public static void main(String[] args){ //dapat dipanggil tanpa menggunakan Objec
		int b=3;int d=3; //matrik 3 baris 3 kolom
		try{
			System.out.println("Masukan Nilai Matrix:");
			int[][] matrix1=new int[b][d];
			for(int i=0;i<b;i++){
				for(int j=0;j<d;j++){
					matrix1[i][j]=input();
	    	    }
	    	}
	    	for(int i=0;i<b;i++){
				for(int j=0;j<d;j++){
					System.out.print(matrix1[i][j]+" ");
				}
	    	    System.out.println();
	    	}
		}
		catch (Exception inputMismatchException){
			System.err.printf("\nException: %s\n", inputMismatchException);
			System.out.println("Hanya Menerima Nilai Integer Saja, Ulangi Input");
		}
	}
	static int input(){
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		return b;
	}
}
